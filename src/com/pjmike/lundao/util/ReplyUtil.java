package com.pjmike.lundao.util;

import java.util.ArrayList;
import java.util.List;

import com.pjmike.lundao.po.ReplyExtend;

public class ReplyUtil {
	
	private static int count = 1;
	
	public static void getOneReply(List<ReplyExtend> rreplylist,ReplyExtend r) {
		
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
	}
	
	//找出点赞数最大的回复
		public static  ReplyExtend findNiceReply(List<ReplyExtend> replys) {
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
