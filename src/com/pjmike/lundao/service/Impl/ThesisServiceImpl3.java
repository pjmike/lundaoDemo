package com.pjmike.lundao.service.Impl;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.aspectj.weaver.ast.Call;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjmike.lundao.mapper.AskquestionMapper;
import com.pjmike.lundao.mapper.ReplyMapper;
import com.pjmike.lundao.mapper.SupplementMapper;
import com.pjmike.lundao.mapper.ThesisMapper;
import com.pjmike.lundao.po.Askquestion;
import com.pjmike.lundao.po.AskquestionExtend;
import com.pjmike.lundao.po.Reply;
import com.pjmike.lundao.po.ReplyExtend;
import com.pjmike.lundao.po.Supplement;
import com.pjmike.lundao.po.Thesis;
import com.pjmike.lundao.po.ThesisCollection;
import com.pjmike.lundao.po.ThesisExtend;
import com.pjmike.lundao.po.ThesisSupplement;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.po.comvote;
/**
 * @author pjmike
 *	
 */
@Service
public class ThesisServiceImpl3 implements ThesisService {
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
	
	
	
	//向右滑
	@Override
	public AskquestionExtend selectReply(ReplyExtend it,User user){
		
		List<ReplyExtend> replys = replyMapper.select(it.getCommentId());
		if (user != null) {
			for (ReplyExtend r : replys) {
				Integer islike = replyMapper.Islike(user.getId(), r.getId());
				if(islike != null) {
					if(islike>0) {
						r.setIslike(true);
					}
				}
				
			} 
		}
		List<ReplyExtend> creplylist = new ArrayList<ReplyExtend>();
			
		List<ReplyExtend> rreplylist = new ArrayList<>();
		
		if (replys!=null) {
				for (ReplyExtend r : replys) {
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
				}
			}
		
		AskquestionExtend ask = askquestionMapper.selectOneAskquestion(it.getCommentId());
		if(user != null) {
			comvote c = new comvote();
			c.setA_comment_id(ask.getId());
			c.setA_uid(user.getId());
			Integer islike = askquestionMapper.Islike(c);
			if(islike != null) {
				if(islike >0) {
					ask.setIslike(true);
				}
			}
		}
		ask.setReplies(rreplylist);
		
			ReplyExtend max = new ReplyExtend();
			List<ReplyExtend> replylist = replyMapper.select(it.getCommentId());
			
			List<ReplyExtend> list = replyMapper.selectAleadyClick();
			for(ReplyExtend re:list) {
				if(re.getId() == it.getId()) {
					break;
				} else{
					replyMapper.storeAlreadyClick(it);
					break;
				}
			}
			
			
			if (it.getReplyId() == 0) {
				for(int i=0;i<rreplylist.size();i++) {
					for (int j = 0; j < list.size(); j++) {
						if (rreplylist.get(i).getId() == list.get(j).getId()) {
							rreplylist.remove(i);
						} 
					}
				}
				
				max = findNiceReply(rreplylist);
				max.setLeftScroll(true);
				if(rreplylist.size()>0) {
					max.setRightScroll(true);
				}
				Callback(max, ask);
				
				max.setNextReply(null);
				
				ask.setReplyextend(max);
				
			} else {
						for(int i=0;i<rreplylist.size();i++) {
							for (int j = 0; j < list.size(); j++) {
								if (rreplylist.get(i).getId() == list.get(j).getId()) {
									rreplylist.remove(i);
								} 
							}
						}
						
						max = findNiceReply(rreplylist);
						max.setLeftScroll(true);
						/*if ((rreplylist.size() - listId.size()) > 0) {
							max.setRightScroll(true);
						}*/
						
						Callback(max, ask);
						max.setNextReply(null);
						ask.setReplyextend(max);
			}
			ask.setReplies(null);
			List<ReplyExtend> listreply = new ArrayList<ReplyExtend>();
			if(ask.getReplyextend() != null) {
				ReplyExtend maxreply = ask.getReplyextend();
				listreply.add(maxreply);
				addlist(maxreply, listreply);
				for(ReplyExtend r:listreply) {
					if(user != null) {
						Integer isShow = replyMapper.selectIsShow(user.getId(),r.getId());
						if(isShow != null) {
							if(isShow == 0) {
								r.setShow(false);
							}
						}
					}
				}
				ask.setReplylist(listreply);
			}
			
			return ask;
	}
			
	public void addlist(ReplyExtend reply,List<ReplyExtend> list) {
		
		if(reply.getReplyExtend() != null) {
			list.add(reply.getReplyExtend());
			addlist(reply.getReplyExtend(),list);
		}
	}
	
	public void Callback(ReplyExtend reply,AskquestionExtend ask) {
		List<ReplyExtend> list = replyMapper.selectAleadyClick();
		if ( reply.getNextReply()!=null ) {
			List<ReplyExtend> replytemp = reply.getNextReply();
			for(int i=0;i<replytemp.size();i++) {
				for (int j = 0; j < list.size(); j++) {
					if (replytemp.get(0).getId() == list.get(j).getId()) {
						replytemp.remove(i);
					} 
				}
			}
			
			reply.setReplyExtend(findFirstReply(reply.getNextReply(),ask,reply));
			if (reply.getReplyId() == 0) {
				if (reply.getNextReply().size() > 1) {
					reply.getReplyExtend().setRightScroll(true);
				} 
			}
			
			if(replytemp.size()>1) {
				reply.getReplyExtend().setRightScroll(true);
				reply.getReplyExtend().setLeftScroll(true);
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
			re = replys.get(0);
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
	public ReplyExtend findFirstReply(List<ReplyExtend> list,AskquestionExtend ask,ReplyExtend re) {
		for(ReplyExtend reply:list) {
			if(reply.getFromUid() == re.getToUid()) {
				return reply;
			}
			if(reply.getFromUid() == ask.getFromUid()) {
				return reply;
			}
			
		}
		long maxtime = Time(list.get(0));
		ReplyExtend maxReply = list.get(0);
		for(int i=1;i<list.size();i++) {
			long temp = Time(list.get(i));
			if(temp<maxtime) {
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
	public ThesisExtend selectBythesisId(int id, User user) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<ThesisCollection> selectAllCollectionThesis(int id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public int updateColleThesisIsshow(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ThesisExtend selectBythesisId(int id, User user, int currPage, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}

