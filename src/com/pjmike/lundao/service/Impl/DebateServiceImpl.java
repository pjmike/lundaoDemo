package com.pjmike.lundao.service.Impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjmike.lundao.mapper.DebatetopicMapper;
import com.pjmike.lundao.mapper.MarkdebateMapper;
import com.pjmike.lundao.mapper.ThesisMapper;
import com.pjmike.lundao.po.Debatetopic;
import com.pjmike.lundao.po.Debatetopicextend;
import com.pjmike.lundao.po.Markdebate;
import com.pjmike.lundao.po.Thesis;
import com.pjmike.lundao.po.User;
@Service
public class DebateServiceImpl implements DebateService{
	
	@Autowired
	private DebatetopicMapper debatetopicMapper;
	@Autowired
	private ThesisMapper thesisMapper;
	
	@Autowired
	private MarkdebateMapper markdebateMapper;
	
	@Override
	public Debatetopic selectByPrimaryKey(Integer topicid) {
		return debatetopicMapper.selectByPrimaryKey(topicid);
	}
	@Override
	public List<Thesis> selectBykey() {
		return thesisMapper.selectBykey();
	}
	
	//跟新关注量
	@Override
	public int updateByPrimaryKey(Debatetopic record,User user) {
		int topicid = record.getTopicid();
		int userid = user.getId();
		Markdebate markdebate = new Markdebate();
		markdebate.setDebateid(topicid);
		markdebate.setUserid(userid);
		if(topicid !=0 && userid !=0) {
			markdebateMapper.insertMark(markdebate);
		}
		return debatetopicMapper.updateByPrimaryKey(record);
		
	}
	//跟新点赞量
	@Override
	public int updateByPrimaryKeyWithLike(Debatetopic record) {
		return debatetopicMapper.updateByPrimaryKeyWithLike(record);
	}
	
	//查询所有辩题量
	@Override
	public List<Debatetopicextend> selectList() {
		//从数据库查询出来的辩题列表
		List<Debatetopicextend> debatelist = debatetopicMapper.selectList();
		
		//将辩题列表进行排序,冒泡排序
		for(int i=0;i<debatelist.size()-1;i++) {
			for (int j = i+1; j <debatelist.size(); j++) {
				int count = DebateServiceImpl.Count(debatelist.get(i));
				int count1 = DebateServiceImpl.Count(debatelist.get(j));
				if(count<count1) {
					Debatetopicextend d = debatelist.get(i);
					debatelist.set(i, debatelist.get(j));
					debatelist.set(j, d);
				}
			}
			
		}
		 return debatelist;
	}

	
	
	
	
	@Override
	public List<Debatetopic> selectListby() {
		//从数据库查询出来的辩题列表
				List<Debatetopic> debatelist = debatetopicMapper.selectListby();
				
				//将辩题列表进行排序,冒泡排序
				for(int i=0;i<debatelist.size()-1;i++) {
					for (int j = i+1; j <debatelist.size(); j++) {
						int count = DebateServiceImpl.Count(debatelist.get(i));
						int count1 = DebateServiceImpl.Count(debatelist.get(j));
						if(count<count1) {
							Debatetopic d = debatelist.get(i);
							debatelist.set(i, debatelist.get(j));
							debatelist.set(j, d);
						}
					}
					
				}
				 return debatelist;
	}
	
	
	
	//辩题排序算法
	public static int Count(Debatetopic d) {
		
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
