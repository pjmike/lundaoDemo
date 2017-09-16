package com.pjmike.lundao.service.Impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjmike.lundao.mapper.AskquestionMapper;
import com.pjmike.lundao.mapper.ReplyMapper;
import com.pjmike.lundao.mapper.SupplementMapper;
import com.pjmike.lundao.mapper.ThesisMapper;
import com.pjmike.lundao.po.AskquAttention;
import com.pjmike.lundao.po.Askquestion;
import com.pjmike.lundao.po.AskquestionExtend;
import com.pjmike.lundao.po.ReplyExtend;
import com.pjmike.lundao.po.ThesisExtend;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.po.comvote;
@Service
public class AskquesServiceImpl implements AskquesService{
	@Autowired
	AskquestionMapper askquestionMapper;
	@Autowired
	ThesisMapper thesisMapper;
	@Autowired
	ReplyMapper replyMapper;
	private static int count = 1;
	private static int number = 0;
	
	
//	private static List<Integer> listId = new ArrayList<>();
//	private static List<ReplyExtend> listReplys = new ArrayList<>();
	/**
	 * 发起提问及异议
	 */
	@Override
	public int insertaskquestion(Askquestion askquestion) {
		
		return askquestionMapper.insertaskquestion(askquestion);
	}
	@Override
	public int likeNumber(int id) {
		return askquestionMapper.likeNumber(id);
	}
	@Override
	public int Islike(comvote comvote) {
		return askquestionMapper.Islike(comvote);
	}
	@Override
	public int insetLike(comvote comvote) {
		return askquestionMapper.insetLike(comvote);
	}
	@Override
	public int giveupLike(comvote comvote) {
		return askquestionMapper.giveupLike(comvote);
	}
	@Override
	public int deleteAttention(int id, int askid) {
		return askquestionMapper.deleteAttention(id, askid);
	}
	@Override
	public int insertAttention(int id, int askid) {
		return askquestionMapper.insertAttention(id, askid);
	}
	@Override
	public int IsAttention(User user, int askid) {
		return askquestionMapper.IsAttention(user.getId(), askid);
	}
	
	//向右滑的时候
	@Override
	public AskquestionExtend findReply(ReplyExtend it, User user) {

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
		List<ReplyExtend> listReplys = replyMapper.selectAleadyClick();
		System.out.println("-----------------------------");
		System.out.println("------------------------------");
		System.out.println(listReplys);
		if (it.getReplyId() >0 ) {
			ReplyExtend max = findNiceReply(rreplylist);
			max = findNiceReply(rreplylist);
			max.setLeftScroll(true);
			ask.setReplyextend(max);
			
			Callback(max, ask, it);
			
		} else {
			List<ReplyExtend> list = new ArrayList<>();
			
			for(ReplyExtend re:listReplys) {
				if(re.getReplyId() == 0) {
					list.add(re);
				}
			}
			
			ReplyExtend max = new ReplyExtend();
			max = findNiceReply(list);
			
			
			Callback(max, ask, it);
		}
			ask.setReplies(null);
			List<ReplyExtend> listreply = new ArrayList<ReplyExtend>();
			if(ask.getReplyextend() != null) {
				ReplyExtend maxreply = ask.getReplyextend();
				listreply.add(maxreply);
				addlist(maxreply, listreply);
				ask.setReplylist(listreply);
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
			}
			return ask;
			
	}
	public void addlist(ReplyExtend reply,List<ReplyExtend> list) {
			
			if(reply.getReplyExtend() != null) {
				list.add(reply.getReplyExtend());
				addlist(reply.getReplyExtend(),list);
			}
		}
		public void Callback(ReplyExtend reply,AskquestionExtend ask,ReplyExtend it) {
			List<ReplyExtend> listReplys = replyMapper.selectAleadyClick();
			if (reply!=null && it!=null) {
				if (reply.getId() == it.getReplyId()) {
					reply.setReplyExtend(findLastReply(listReplys, ask, reply));
					reply.setRightScroll(true);
					Callback(reply.getReplyExtend(), ask, it);
				} else {

					if (reply.getNextReply() != null) {

						reply.setReplyExtend(findFirstReply(reply.getNextReply(), ask, reply));
						
						if (reply.getNextReply().size()  > 0) {
							reply.getReplyExtend().setRightScroll(true);
						}
						
						Callback(reply.getReplyExtend(), ask, it);
					}

				} 
			}
		}
		
		// 查询出一个辩题下所有评论
		 
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
		//			reply.setNextReply(nextReply);
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
			long mintime = Time(list.get(0));
			ReplyExtend minReply = list.get(0);
			for(int i=1;i<list.size();i++) {
				long temp = Time(list.get(i));
				if(temp<mintime) {
					mintime = temp;
					minReply = list.get(i);
				}
			}
			return minReply;
		}
		
		//找出最后发布的回复
		public ReplyExtend findLastReply(List<ReplyExtend> list,AskquestionExtend ask,ReplyExtend re) {
			for(ReplyExtend reply:list) {
				if(reply.getFromUid() == re.getToUid()) {
					return reply;
				}
				if(reply.getFromUid() == ask.getFromUid()) {
					return reply;
				}
				
			}
			ReplyExtend maxReply = null;
			if (list.size()>0) {
				long maxtime = Time(list.get(0));
				maxReply = list.get(0);
				for (int i = 1; i < list.size(); i++) {
					long temp = Time(list.get(i));
					if (temp > maxtime) {
						maxtime = temp;
						maxReply = list.get(i);
					}
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
		@Override
		public List<AskquAttention> selecrAllAttentionAskqustion(int id) {
			
			return askquestionMapper.selecrAllAttentionAskqustion(id);
		}
		@Override
		public int changeIsShow(int id, int askid) {
			return askquestionMapper.changeIsShow(id, askid);
		}
		@Override
		public Integer SeeIsShow(int id, int askid) {
			return askquestionMapper.SeeIsShow(id, askid);
		}
		@Override
		public int AaginLike(comvote comvote) {
			return askquestionMapper.AaginLike(comvote);
		}
		@Override
		public int selectLike(comvote comvote) {
			return askquestionMapper.selectLike(comvote);
		}
		@Override
		public int AaginAttention(int id, int askid) {
			return askquestionMapper.AaginAttention(id, askid);
		}
		@Override
		public int selectAttention(int id, int askid) {
			return askquestionMapper.selectAttention(id, askid);
		}

}
