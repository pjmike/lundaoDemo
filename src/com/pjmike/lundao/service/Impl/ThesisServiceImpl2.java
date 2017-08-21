package com.pjmike.lundao.service.Impl;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.aspectj.weaver.ast.Call;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjmike.lundao.mapper.AskquestionMapper;
import com.pjmike.lundao.mapper.ReplyMapper;
import com.pjmike.lundao.mapper.SupplementMapper;
import com.pjmike.lundao.mapper.ThesisMapper;
import com.pjmike.lundao.po.AskquestionExtend;
import com.pjmike.lundao.po.ReplyExtend;
import com.pjmike.lundao.po.Supplement;
import com.pjmike.lundao.po.Thesis;
import com.pjmike.lundao.po.ThesisExtend;
import com.pjmike.lundao.po.ThesisSupplement;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.po.comvote;
/**
 * @author pjmike
 *
 */
@Service
public class ThesisServiceImpl2 implements ThesisService {
	@Autowired
	ThesisMapper thesisMapper;
	@Autowired
	ReplyMapper replyMapper;
	@Autowired
	AskquestionMapper askquestionMapper;
	@Autowired
	SupplementMapper supplementMapper;
	private static int count = 1;
	private static int number = 0;
	@Override
	public ThesisExtend selectBythesisId(int id,User user) throws Exception,ClassCastException{
		ThesisExtend thesisextend = thesisMapper.selectBythesisId(id);
		//以下为评论列表
		List<AskquestionExtend> askquestions = thesisextend.getAskquestions();
		
		if(askquestions == null || askquestions.size()==0) {
			askquestions = new ArrayList<>();
		}
		//对评论的回复
		//字回复
		
		for(AskquestionExtend as:askquestions) {
			//更新点赞量
			int like = askquestionMapper.likeNumber(as.getId());
			if(like>0) {
				as.setLike(like);
			}
			/**
			 * 判断是否点赞与是否关注
			 */
			if(user != null) {
				comvote comvote = new comvote();
				comvote.setA_comment_id(as.getId());
				comvote.setA_uid(user.getId());
				int islike = askquestionMapper.Islike(comvote);
				if(islike>0) {
					as.setIslike(true);
				} 
				int isAttention = askquestionMapper.IsAttention(user.getId(),as.getId());
				if(isAttention>0) {
					as.setAttention2(true);
				}
			}
			
			/**
			 * 先找出所有回复内容，包扩对评论的回复以及子回复
			 */
			List<ReplyExtend> rep =replyMapper.select(as.getId());
			
			List<ReplyExtend> creplylist = new ArrayList<ReplyExtend>();
			
			List<ReplyExtend> rreplylist = new ArrayList<>();
			if (rep!=null) {
				for (ReplyExtend r : rep) {
					
					int replylike = replyMapper.likeNumber(r.getReplyId());
					//更新点赞量
					if(replylike>0) {
						r.setrLike(replylike);
					}
					
					if (user!=null) {
						int islike = replyMapper.Islike(user.getId(), r.getReplyId());
						//判断用户是否对回复点赞
						if (islike > 0) {
							r.setIslike(true);
						} 
					}
					
					if (r.getReplyId()==0) {
						//找出对评论的所有回复
						rreplylist.add(r);
						
						creplylist.add(r);
					} else {
						//判断对评论的回复是否为空，为空则无子回复
						//设置creplylist进行循环判断，但不将creplylist设置到as中，听因为在此过程中,对象已经被修改
						
						
						if (creplylist.size() > 0) {
							for (ReplyExtend reply : creplylist) {
								if (reply.getId() != null && r.getReplyId()>0) {
									if (reply.getId().equals(r.getReplyId())) {
										if (reply.getNextReply() == null) {
											reply.setNextReply(new ArrayList<>());
										}
										reply.getNextReply().add(r);
										creplylist.add(r);
										break;
									}
								}
							}
						}
					}
					
					//找出其中获赞数最大的评论
					//用一个递归方法
					ReplyExtend maxReply = findNiceReply(rreplylist);
					if((rreplylist.size()-count)>0) {
						maxReply.setRightScroll(true);
						count++;
					}
					r.setReplyExtend(maxReply);
					
					
					
					List<ReplyExtend> replyList = new ArrayList<>();
					
					
					if(r.getReplyId()==0) {
						replyList.add(r);
					}
					for (ReplyExtend reply : replyList) {
					if (maxReply.getId() != null && r.getReplyId()>0) {
						if (maxReply.getId().equals(r.getReplyId())) {
						
							
							if (maxReply.getNextReply() == null) {
								maxReply.setNextReply(new ArrayList<>());
							}
							maxReply.getNextReply().add(r);
							replyList.add(r);
							break;
						}
					}	
				}	

					//这里只设置评论，不设置回复，回复内容已经包含在其中
					as.setReplies(rreplylist); 
//					as.setExtend(maxReply);
				}
			}
		}
		
		
		
		List<AskquestionExtend> findMaxlike = findMaxlike(askquestions);
		
		
		thesisextend.setAskquestions(findMaxlike);
		ReplyExtend max = new ReplyExtend();
		List<AskquestionExtend> testask = thesisextend.getAskquestions();
		for(AskquestionExtend ask:testask) {
			List<ReplyExtend> replylist = ask.getReplies();
			 max = findNiceReply(replylist);
			ask.setExtend(max);
			replylist.remove(number);
			if((replylist.size()-count)>0) {
				max.setRightScroll(true);
				count++;
			}
		}
		for(AskquestionExtend ask:testask) {
			
			Callback(max,ask);
		}
		return thesisextend;
	}
	
	
	public void Callback(ReplyExtend reply,AskquestionExtend ask) {
		if ( reply.getNextReply()!=null ) {
			
			reply.setReplyExtend(findFirstReply(reply.getNextReply(),ask));
			if(reply.getNextReply().size()-count>0) {
				reply.getReplyExtend().setRightScroll(true);
			}
			Callback(reply.getReplyExtend(),ask);
		}
	}
	
	
//	 查询出一个辩题下所有评论
	 
	 public void getCommentList(int id) {
		 ThesisExtend thesisextend = thesisMapper.selectBythesisId(id);
			//以下为评论列表
			List<AskquestionExtend> askquestions = thesisextend.getAskquestions();
			
			
			if(askquestions == null || askquestions.size()==0) {
				askquestions = new ArrayList<>();
			}
			AskquestionExtend reply = new AskquestionExtend();
			for(int i=0;i<askquestions.size();i++) {
				reply = askquestions.get(i);
//				reply.setNextReply(nextReply);
			}
		} 
	 public List<ReplyExtend> getReplyList(AskquestionExtend ask) {
		 List<ReplyExtend> replylist = new ArrayList<>();
		 AskquestionExtend asktmp = ask;
		 boolean flag =true;
		 while(flag) {
			 for(ReplyExtend re:asktmp.getReplies()) {
				 
			 }
		 }
		return replylist;
	 }
	
	
	/*
	 * 以下是定义好的一些算法代码
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	//评论的排序
	public  long Comment(AskquestionExtend as) {
		
			//距离发表的时间
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date s = as.getPublishtime();
			Date now = new Date();
			long sum = 0;
			long l1 = now.getTime() - s.getTime();
			long day1 = l1 / (24 * 60 * 60 * 1000);
			long hour1 = (l1 / (60 * 60 * 1000) - day1 * 24);
			if(hour1!=0) {
				sum = as.getLike()/hour1;
			}
			return sum;
		
	}
	//按点赞数排序
	public  List<AskquestionExtend> findMaxlike(List<AskquestionExtend> askquestions) {
				for(int i=0;i<askquestions.size()-1;i++) {
					for (int j = i+1; j <askquestions.size(); j++) {
						long count =askquestions.get(i).getLike();
						long count1 = askquestions.get(j).getLike();
						if(count<count1) {
							AskquestionExtend ask = askquestions.get(i);
							askquestions.set(i, askquestions.get(j));
							askquestions.set(j, ask);
						}
					}
				}
				AskquestionExtend a1 = askquestions.get(0);
				AskquestionExtend a2 = askquestions.get(1);
				for(int i=0;i<askquestions.size()-1;i++) {
					for (int j = i+1; j <askquestions.size(); j++) {
						long count =Comment(askquestions.get(i));
						long count1 = Comment(askquestions.get(j));
						if(count<count1) {
							AskquestionExtend ask = askquestions.get(i);
							askquestions.set(i, askquestions.get(j));
							askquestions.set(j, ask);
						}
					}
				}
				askquestions.set(0, a1);
				askquestions.set(1,a2);
				return askquestions;
	}
	
	//找出点赞数最大的回复
	public  ReplyExtend findNiceReply(List<ReplyExtend> replys) {
		ReplyExtend re = null;
		if (replys.size()>0) {
			int max = replys.get(0).getrLike();
			re = new ReplyExtend();
			for (int i = 1; i < replys.size(); i++) {
				int temp = replys.get(i).getrLike();
				if (max < temp) {
					max = temp;
					re = replys.get(i);
				}
			} 
		}
		return re;
	}
	//找出最先发布的回复
	public ReplyExtend findFirstReply(List<ReplyExtend> list,AskquestionExtend ask) {
		for(ReplyExtend reply:list) {
			if(reply.getFromUid() == ask.getFromUid()) {
				return reply;
			}
		}
		long maxtime = Time(list.get(0));
		ReplyExtend maxReply = list.get(0);
		for(int i=1;i<list.size();i++) {
			long temp = Time(list.get(i));
			if(temp>maxtime) {
				maxtime = temp;
				maxReply = list.get(i);
			}
		}
		return maxReply;
	}
	
	//找出时间差
	public long Time(ReplyExtend d) {
		Date s = d.getrPublishtime();
		Date now = new Date(); 
		long l1 = now.getTime() - s.getTime();  
		long day1 = l1 / (24 * 60 * 60 * 1000);  
		long hour1 = (l1 / (60 * 60 * 1000) - day1 * 24); 
		return hour1;
	}
	/**
	 * 实现增加论点
	 */
	@Override
	public int insert(Thesis record) {
		
		return thesisMapper.insert(record);
	}




	@Override
	public int insertAttention(Integer thesisId, User user) {
		return thesisMapper.insertAttention(user.getId(), thesisId);
	}

	@Override
	public int deleteAttention(Integer thesisId, User user) {
		return thesisMapper.deleteAttention(user.getId(), thesisId);
	}

	/**
	 * 查询某一论点的简介与题目
	 */
	@Override
	public Thesis selectOne(int id) {
		return thesisMapper.selectOne(id);
	}

	/**
	 * 提交完善版本
	 * @param supplement
	 * @return
	 */
	@Override
	public int insertsupplement(Supplement supplement) {
		return supplementMapper.insertsupplement(supplement);
	}


	/**
	 * 返回所有的完善版本
	 */
	@Override
	public List<ThesisSupplement> selectAllSupplement(Supplement supplement) {
		return thesisMapper.selectAllSupplement(supplement);
	}
	/**
	 * 收藏论点
	 */
	@Override
	public int collectionThesis(Integer thesisId, int id) {
		
		return thesisMapper.collectionThesis(id, thesisId);
	}


	@Override
	public List<Thesis> selectAllCollectionThesis(int id) {
		return thesisMapper.selectAllThesisAttentioned(id);
	}

}
