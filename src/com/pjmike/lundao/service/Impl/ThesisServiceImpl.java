package com.pjmike.lundao.service.Impl;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjmike.lundao.mapper.ThesisMapper;
import com.pjmike.lundao.po.AskquestionExtend;
import com.pjmike.lundao.po.ReplyExtend;
import com.pjmike.lundao.po.Thesis;
import com.pjmike.lundao.po.ThesisExtend;

/**
 * @author pjmike
 *
 */
@Service
public class ThesisServiceImpl implements ThesisService {
	@Autowired
	ThesisMapper thesisMapper;
	@Override
	public ThesisExtend selectBythesisId(int id) throws Exception,ClassCastException{
		ThesisExtend thesisextend = thesisMapper.selectBythesisId(id);
		//以下为评论列表
		List<AskquestionExtend> askquestions = thesisextend.getAskquestions();
		
		
		if(askquestions == null || askquestions.size()==0) {
			askquestions = new ArrayList<>();
		}
		/*//对评论的回复
		List<ReplyExtend> creplylist = new ArrayList<ReplyExtend>();
		//字回复
		List<ReplyExtend> rreplylist = new ArrayList<>();
		
		for(AskquestionExtend as:askquestions) {
			List<ReplyExtend> rep =as.getReplies();
			
			
			
			if (rep!=null) {
				for (ReplyExtend r : rep) {

					if ("comment".equals(r.getrType())) {
						//找出对评论的回复

						creplylist.add(r);

					} else {
						//判断对评论的回复是否为空，为空则无子回复
						if (creplylist.size() > 0) {
							for (ReplyExtend reply : creplylist) {
								if (reply.getId() != null && r.getReplyId() != null) {
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
				as.setReplies(creplylist);
			}
		}
		List<ReplyExtend> replys = new ArrayList<>();
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
				//只返回一条记录
				ReplyExtend replyMax = findNiceReply(replys);
				List<ReplyExtend> res = new ArrayList<>();
				res = as.getReplies();
				
				res.set(0, replyMax);
				
				as.setReplies(res);
				
		}*/
		
		
		
		List<AskquestionExtend> findMaxlike = findMaxlike(askquestions);
		
		
		thesisextend.setAskquestions(findMaxlike);
	
		return thesisextend;
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
		int max = replys.get(0).getrLike();
		ReplyExtend re = new ReplyExtend();
		for(int i=1;i<replys.size();i++) {
			int temp = replys.get(i).getrLike();
			if(max < temp) {
				max = temp;
				re = replys.get(i);
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
}
