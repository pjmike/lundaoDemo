package com.pjmike.lundao.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pjmike.lundao.mapper.ThesisMapper;
import com.pjmike.lundao.po.Reply;
import com.pjmike.lundao.po.Thesis;
import com.pjmike.lundao.service.Impl.DebateServiceImpl;
import com.pjmike.lundao.service.Impl.ThesisServiceImpl;

@Controller
public class ThesisController {
	@Autowired
	DebateServiceImpl debateServiceImpl;
	
	@Autowired
	ThesisServiceImpl thesisServiceImpl;
	@RequestMapping("/thesis")
	//查询出一个辩题下的所有论点信息
	public 	@ResponseBody List<Thesis> thesis(HttpSession session) {
		List<Thesis> thesislist = debateServiceImpl.selectBykey();
		session.setAttribute("thesislist",thesislist);
			
		
		//将论点列表进行排序,冒泡排序
		for(int i=0;i<thesislist.size()-1;i++) {
			for (int j = i+1; j <thesislist.size(); j++) {
				int count = ThesisController.Count(thesislist.get(i));
				int count1 = ThesisController.Count(thesislist.get(j));
				if(count<count1) {
					Thesis d = thesislist.get(i);
					thesislist.set(i, thesislist.get(j));
					thesislist.set(j, d);
				}
			}
			
		}
		 return thesislist;
	}
	
	
	
	
	//查询出一个提问下的所有评论
	@RequestMapping("/replyOfthesis")
	public @ResponseBody List<Reply> replyOfthesis(HttpSession session,int id) {
		//获取当前会话的thesis，
//		session.getAttribute("thesis");
		
		List<Reply>  replylist = thesisServiceImpl.selectByPrimaryKey(id);
		return replylist;
	}
	
	
public static int Count(Thesis d) {
		
		int sum = d.getAttention()+d.getLike()+d.getView()*4;
		
		//s1距离发表的时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		Date s = d.getPublishtime();
		Date now = new Date(); 
		long l1 = now.getTime() - s.getTime();  
		long day1 = l1 / (24 * 60 * 60 * 1000);  
		long hour1 = (l1 / (60 * 60 * 1000) - day1 * 24); 
		
		//s2为距离发表内容的时间
		Date s2 =d.getContenttime();
		
		long l2 = now.getTime()-s2.getTime();
		long day2 = l2 / (24 * 60 * 60 * 1000);  
		long hour2 = (l2 / (60 * 60 * 1000) - day2 * 24); 
		
		//时间差
		double time = (hour1+1)-Math.pow(hour2/2, 1.5);
		
		int count = (int) (sum/time);
		return count;
	}
}
