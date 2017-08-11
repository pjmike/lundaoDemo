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
@Service
public class ThesisServiceImpl2 implements ThesisService {
	@Autowired
	ThesisMapper theisMapper;
	@Autowired
	ReplyMapper replyMapper;
	@Override
	public ThesisExtend selectBythesisId(int id) throws Exception, ClassCastException {
		List<AskquestionExtend> asklist = new ArrayList<>();
		ThesisExtend thesis = theisMapper.selectBythesisId(id);
		//得到评论列表
		asklist = thesis.getAskquestions();
		if(asklist != null) {
			AskquestionExtend ask = new AskquestionExtend();
			for(int i=0;i<asklist.size();i++) {
				ask = asklist.get(i);
				ask.setReplies(getReplyList(ask));
				/*List<ReplyExtend> replies = ask.getReplies();
				for(ReplyExtend re:replies) {
					re.setNextReply(getReplyList2(re));
				}*/
				asklist.set(i, ask);
			}
		}
		
	
		return thesis;
	}
	public List<ReplyExtend> getReplyList(AskquestionExtend ask) {
		List<ReplyExtend> replylist = new ArrayList<>();
		AskquestionExtend asktemp = ask;
		boolean flag = true;
		while(flag) {
			int id = asktemp.getId();
			List<ReplyExtend> reply = replyMapper.select(id);
			if(reply.size()>0) {
				replylist = reply;
				flag = false;
			} else {
				replylist = null;
				flag = false;
			}
			
		}
		return replylist;
		
	}
	public List<ReplyExtend> getReplyList2(ReplyExtend reply) {
		
		List<ReplyExtend> replylist = new ArrayList<>();
		ReplyExtend replytemp = reply;
		boolean flag = true;
		while(flag) {
			int replyid = reply.getReplyId();
			
			if(replyid >0) {
				replytemp = replyMapper.selectbyReplyid(replyid);
				replytemp.setNextReply(null);
				replylist.add(replytemp);
			}	else {
				flag = true;
			}
			
		}
		return replylist;
	}
	
	//异议和评论的排序
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
	
	@Override
	public int insert(Thesis record) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int insertAttention(Integer thesisId, User user) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int deleteAttention(Integer thesisId, User user) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Thesis selectOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
