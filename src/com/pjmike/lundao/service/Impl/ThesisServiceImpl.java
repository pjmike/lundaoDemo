package com.pjmike.lundao.service.Impl;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjmike.lundao.mapper.ReplyMapper;
import com.pjmike.lundao.mapper.ThesisMapper;
import com.pjmike.lundao.po.AskquestionExtend;
import com.pjmike.lundao.po.ReplyExtend;
import com.pjmike.lundao.po.Thesis;
import com.pjmike.lundao.po.ThesisExtend;
import com.pjmike.lundao.po.User;

/**
 * @author pjmike
 *
 */
@Service
public class ThesisServiceImpl implements ThesisService {
	@Autowired
	ThesisMapper thesisMapper;
	@Autowired
	ReplyMapper replyMapper;
	@Override
	public ThesisExtend selectBythesisId(int id) throws Exception,ClassCastException{
		ThesisExtend thesisextend = thesisMapper.selectBythesisId(id);
		//以下为评论列表
		List<AskquestionExtend> askquestions = thesisextend.getAskquestions();
		
		
		if(askquestions == null || askquestions.size()==0) {
			askquestions = new ArrayList<>();
		}
		//对评论的回复
		//字回复
		
		for(AskquestionExtend as:askquestions) {
			
			List<ReplyExtend> rep =replyMapper.select(as.getId());
			
			List<ReplyExtend> creplylist = new ArrayList<ReplyExtend>();
			
			List<ReplyExtend> rreplylist = new ArrayList<>();
			if (rep!=null) {
				for (ReplyExtend r : rep) {
					

					if (r.getReplyId()==0) {
						//找出对评论的回复
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
					//这里只设置评论，不设置回复，回复内容已经包含在其中
					as.setReplies(rreplylist); 
				}
				/*//将对应
				List<ReplyExtend> list = new ArrayList<>();
				for(ReplyExtend re:creplylist) {
					if(re.getCommentId().equals(as.getId())) {
						list.add(re);
					}
				}
				as.setReplies(list);*/
			}
		}
		/*List<ReplyExtend> replys = new ArrayList<>();
		for(AskquestionExtend as:askquestions) {
				if (as.getReplies()!=null) {
					for (ReplyExtend r : as.getReplies()) {
						if ("comment".equals(r.getrType())) {
							//找出对评论的回复
							replys.add(r);
						}
					} 
				}
				//找出最佳对评论的回复。
				ReplyExtend replyMax = findNiceReply(replys);
				if (as.getReplies().size()>0) {
					as.getReplies().set(0, replyMax);
				}*/
				
//		}
		
		
		
		List<AskquestionExtend> findMaxlike = findMaxlike(askquestions);
		
		
		thesisextend.setAskquestions(findMaxlike);
	
		return thesisextend;
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
	public  List<AskquestionExtend> findMaxlike(List<AskquestionExtend> askquestions) {
		//按点赞数排序
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
	
	
	//找出点赞数最大的评论
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


	@Override
	public Thesis selectOne(int id) {
		return thesisMapper.selectOne(id);
	}
}
