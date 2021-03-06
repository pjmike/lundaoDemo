package com.pjmike.lundao.service.Impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjmike.lundao.mapper.DebatetopicMapper;
import com.pjmike.lundao.mapper.MarkdebateMapper;
import com.pjmike.lundao.mapper.ThesisMapper;
import com.pjmike.lundao.po.DebateTopicCustom;
import com.pjmike.lundao.po.DebateTopicSimple;
import com.pjmike.lundao.po.Debatetopic;
import com.pjmike.lundao.po.DebatetopicExample;
import com.pjmike.lundao.po.Debatetopicextend;
import com.pjmike.lundao.po.Markdebate;
import com.pjmike.lundao.po.Thesis;
import com.pjmike.lundao.po.User;
import com.sun.javafx.collections.MappingChange.Map;
@Service
public class DebateServiceImpl implements DebateService{
	
	@Autowired
	private DebatetopicMapper debatetopicMapper;
	@Autowired
	private ThesisMapper thesisMapper;
	
	@Autowired
	private MarkdebateMapper markdebateMapper;
	
	//按照id查找某一具体辩题及相关论点
	//有一个问题是查询出的所有论点点赞数关注数都一样--->已解决
	
	@Override
	public Debatetopicextend selectByPrimaryKey(Integer topicid,User user) {
		Debatetopicextend debatetopicextend = debatetopicMapper.selectByPrimaryKey(topicid);
		if (debatetopicextend == null)
			return debatetopicextend;
		if (debatetopicextend != null && debatetopicextend.getTopicid() > 0) {
			Integer num = debatetopicMapper.likeNumber(debatetopicextend.getTopicid());
			if (num > 0) {
				debatetopicextend.setLike(num);
			} 
		}
		if (user!= null) {
			if (debatetopicMapper.AttentionNumber(debatetopicextend.getTopicid())!=null) {
				Integer attentionNum = debatetopicMapper.AttentionNumber(debatetopicextend.getTopicid());
				if (attentionNum > 0) {
					debatetopicextend.setAttention(attentionNum);
				} 
			}
			if (debatetopicMapper.Islike(user.getId(), debatetopicextend.getTopicid()) != null) {
				Integer status = debatetopicMapper.Islike(user.getId(), debatetopicextend.getTopicid());
				if (status > 0) {
					debatetopicextend.setIslike(true);
				} else {
					debatetopicextend.setIslike(false);
				} 
			}
			if (debatetopicMapper.IsAttention(user.getId(), debatetopicextend.getTopicid())!=null) {
				Integer attention = debatetopicMapper.IsAttention(user.getId(), debatetopicextend.getTopicid());
				if (attention > 0) {
					debatetopicextend.setAttention2(true);
				} else {
					debatetopicextend.setAttention2(false);
				} 
			}
		}
		List<Thesis> thesislist = debatetopicextend.getThesisList();
		
		for(Thesis t:thesislist) {
			/**
			 *判断点赞数，关注数，点赞状态和关注状态
			 */
			if(user!=null) {
				if (thesisMapper.attentionNum(t.getThesisid())!=null) {
					Integer thesisAttention = thesisMapper.attentionNum(t.getThesisid());
					if (thesisAttention > 0) {
						t.settAttention(thesisAttention);
					} 
				}
				if (thesisMapper.Islike(user.getId(), debatetopicextend.getTopicid()) != null) {
					Integer status = thesisMapper.Islike(user.getId(), debatetopicextend.getTopicid());
					if (status > 0) {
						t.setLike(true);
					} else {
						t.setLike(false);
					} 
				}
				if (thesisMapper.IsAttention(user.getId(), debatetopicextend.getTopicid() )!=null) {
					Integer attention = thesisMapper.IsAttention(user.getId(), debatetopicextend.getTopicid());
					if (attention > 0) {
						t.setAttention(true);
					} else {
						t.setAttention(false);
					} 
				}
			}
		}
		//将论点列表进行排序,冒泡排序
		for(int i=0;i<thesislist.size()-1;i++) {
			for (int j = i+1; j <thesislist.size(); j++) {
				long count = DebateServiceImpl.ThesisCount(thesislist.get(i));
				long count1 = DebateServiceImpl.ThesisCount(thesislist.get(j));
				if(count<count1) {
					Thesis d = thesislist.get(i);
					thesislist.set(i, thesislist.get(j));
					thesislist.set(j, d);
				}
			}
			
		}
		debatetopicextend.setThesisList(thesislist);
		return debatetopicextend;
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
	//更新点击量
	@Override
	public int updateClick(Debatetopic record) {
		return debatetopicMapper.updateClick(record);
	}
	
	//查询所有辩题量包含论点
	@Override
	public List<Debatetopicextend> selectList() {
		//从数据库查询出来的辩题列表
		List<Debatetopicextend> debatelist = debatetopicMapper.selectList();
		//将辩题列表进行排序,冒泡排序
		for(int i=0;i<debatelist.size()-1;i++) {
			for (int j = i+1; j <debatelist.size(); j++) {
				long count = DebateServiceImpl.DebateCount(debatelist.get(i));
				long count1 = DebateServiceImpl.DebateCount(debatelist.get(j));
				if(count<count1) {
					Debatetopicextend d = debatelist.get(i);
					debatelist.set(i, debatelist.get(j));
					debatelist.set(j, d);
				}
			}
		}
		 return debatelist;
	}

	//查看全部辩题不含论点
	@Override
	public List<Debatetopic> selectListByPage(User user,int currPage,int pageSize) {
		java.util.Map<String, Object> data = new HashMap<>();
		
		data.put("currPage", currPage);
		data.put("pageSize", pageSize);
		
		
		//从数据库查询出来的辩题列表
				List<Debatetopic> debatelist = debatetopicMapper.selectListByPage(data);
				
				//设置点赞数
				for(Debatetopic d:debatelist) {
					Integer num = debatetopicMapper.likeNumber(d.getTopicid());
					if(num >0) {
						d.setLike(num);
					}
					Integer attentionNum = debatetopicMapper.AttentionNumber(d.getTopicid());
					if(attentionNum >0) {
						d.setAttention(attentionNum);
					}
					
					
					if (user!=null) {
						if(debatetopicMapper.IsAttention(user.getId(), d.getTopicid()) != null) {
							Integer attention = debatetopicMapper.IsAttention(user.getId(), d.getTopicid());
							if(attention>0) {
								d.setAttention2(true);
							} else {
								d.setAttention2(false);
							}
						}
						
						if(debatetopicMapper.Islike(user.getId(), d.getTopicid()) != null) {
							Integer status = debatetopicMapper.Islike(user.getId(), d.getTopicid());
							if (status>0) {
								d.setIslike(true);
							} else {
								d.setIslike(false);
							} 
						}
					}
				}
				for(Debatetopic debate:debatelist) {
					if(debate.getContent().length() > 40) {
						debate.setTitle1(debate.getContent().substring(0, 40));
					} else {
						debate.setTitle1(debate.getContent());
					}
				}
				//将辩题列表进行排序,冒泡排序
				for(int i=0;i<debatelist.size()-1;i++) {
					for (int j = i+1; j <debatelist.size(); j++) {
						long count = DebateServiceImpl.DebateCount(debatelist.get(i));
						long count1 = DebateServiceImpl.DebateCount(debatelist.get(j));
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
	public static long DebateCount(Debatetopic d) {
		
		long sum = (long) (d.getAttention()+d.getLike()+(Math.log10(d.getView()))*4);
		
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
		
		long count = (long) (sum/time);
		return count;
	}
	
	//论点排序算法
	public static long ThesisCount(Thesis d) {
		
		long sum = (long) (d.gettAttention()+d.gettLike()+(Math.log10(d.gettView()))*4);
		
		//s1距离发表的时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		Date s = d.gettPublishtime();
		Date now = new Date(); 
		long l1 = now.getTime() - s.getTime();  
		long day1 = l1 / (24 * 60 * 60 * 1000);  
		long hour1 = (l1 / (60 * 60 * 1000) - day1 * 24); 
		
		//s2为距离发表内容的时间
		Date s2 =d.gettContenttime();
		
		long l2 = now.getTime()-s2.getTime();
		long day2 = l2 / (24 * 60 * 60 * 1000);  
		long hour2 = (l2 / (60 * 60 * 1000) - day2 * 24); 
		
		//时间差
		double time = (hour1+1)-Math.pow(hour2/2, 1.5);
		
		long count = (long) (sum/time);
		return count;
	}

	@Override
	public List<Debatetopic> selectListNoUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insetLike(Integer topicid, int id) {
		
		return debatetopicMapper.insetLike(id,topicid);
	}

	@Override
	public int giveupLike(Integer topicid, int id) {
		return debatetopicMapper.giveupLike(id, topicid);
	}
	@Override
	public int insertAttention(Integer topicid, int id) {
		return debatetopicMapper.insertAttention(id, topicid);
	}

	@Override
	public int deleteAttention(Integer topicid, int id) {
		return debatetopicMapper.deleteAttention(id, topicid);
	}

	@Override
	public List<DebateTopicSimple> selectAlldebateAttentioned(int id) {
		return debatetopicMapper.selectAlldebateAttentioned(id);
	}

	@Override
	public Integer findIshasLike(Integer topicid, int id) {
		return debatetopicMapper.findIshasLike(id, topicid);
	}

	@Override
	public int Likeagain(Integer topicid, int id) {
		return debatetopicMapper.Likeagain(id, topicid);
	}

	@Override
	public Integer findisHasAttention(Integer topicid, int id) {
		return debatetopicMapper.findisHasAttention(id, topicid);
	}

	@Override
	public int Attentionagain(Integer topicid, int id) {
		return debatetopicMapper.Attentionagain(id, topicid);
	}

	@Override
	public Integer Islike(Integer topicid, int id) {
		// TODO Auto-generated method stub
		return debatetopicMapper.Islike(id, topicid);
	}

	@Override
	public Integer IsAttention(Integer topicid, int id) {
		// TODO Auto-generated method stub
		return debatetopicMapper.IsAttention(id, topicid);
	}

	@Override
	public List<DebateTopicCustom> selectDebateTopic(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
