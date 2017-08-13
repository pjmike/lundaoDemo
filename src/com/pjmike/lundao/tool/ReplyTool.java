package com.pjmike.lundao.tool;

import java.util.ArrayList;
import java.util.List;

import com.pjmike.lundao.po.ReplyExtend;

public class ReplyTool {
	
	
	public static ReplyExtend getOneReplyList(List<ReplyExtend> replyExtends) {
		List<ReplyExtend> rreplylist = new ArrayList<>();
		List<ReplyExtend> creplylist = new ArrayList<>();

		for (ReplyExtend r : replyExtends) {
			
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
			//用一个递归方法？？？
			ReplyExtend maxReply = findNiceReply(rreplylist);
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
		}
		return null;
	}
	
	
	
	
	
	//找出点赞数最大的回复
	public static ReplyExtend findNiceReply(List<ReplyExtend> replys) {
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
}

