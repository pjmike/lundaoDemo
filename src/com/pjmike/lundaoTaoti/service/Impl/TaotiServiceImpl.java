package com.pjmike.lundaoTaoti.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.instrument.classloading.tomcat.TomcatInstrumentableClassLoader;
import org.springframework.stereotype.Service;

import com.pjmike.lundaoTaoti.mapper.TaotiMapper;
import com.pjmike.lundaoTaoti.po.Taoti;


@Service
public class TaotiServiceImpl implements TaotiService {
	
	@Autowired
	TaotiMapper taotiMapper;
	/**
	 * 增加用户发起的辩题
	 */
	@Override
	public int insertTheis(Taoti taoti) {
		taotiMapper.insertTheis(taoti);
		/*String[] lables = taoti.getLabels();
		System.out.println(lables);
		StringBuffer buffer = null;
		if (lables != null) {
			buffer = new StringBuffer();
			for (int i = 0; i < lables.length; i++) {
				buffer.append(lables[i] + ",");
			} 
		}
		String labels = "";*/
		taotiMapper.insertlabels(taoti.getTaotiId(), taoti.getLabels());
		return 0;
	}
	/**
	 * 返回用户的淘题信息
	 */
	@Override
	public List<Taoti> selectAllTaoti(int id) {
		
		List<Taoti> taotilist = taotiMapper.selectAllTaoti(id);
		for(Taoti taoti:taotilist) {
			Boolean commented = taotiMapper.selectTaotiStatus(taoti.getTaotiId(), taoti.getUserid());
			if (commented != null) {
				if (commented) {
					taoti.setCommented(true);
				} else {
					taoti.setCommented(false);
				} 
			}
			String backgroud = taoti.getBackground();
			String title1 = "";
			if(backgroud.length()>40) {
				title1 = backgroud.substring(0, 40)+"...";
			} else {
				title1 = backgroud;
			}
			taoti.setTitle1(title1);
		}
		return taotilist;
	}
	/**
	 * 增加或减少淘题的期望值
	 */
	@Override
	public int upAndDownCommentNum(Taoti taoti) {
		if(taoti.isCommented()) {
			return taotiMapper.upCommentNum(taoti.getTaotiId());
		} else {
			return taotiMapper.downCommentNum(taoti.getTaotiId());
		}
	}
	/**
	 * 返回某一具体辩题信息
	 */
	@Override
	public Taoti selectOne(int taotiId,int userid) {
		
		Taoti taoti = taotiMapper.selectOne(taotiId,userid);
		Boolean commented = taotiMapper.selectTaotiStatus(taotiId, userid);
		
			
		if (commented != null) {
			if (commented) {
				taoti.setCommented(true);
			} else {
				taoti.setCommented(false);
			} 
		}
		return taoti;
	}
	@Override
	public int downCommentNum(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int insertCommented(Taoti taoti) {
		
		return taotiMapper.insertCommented(taoti);
	}
	@Override
	public int updateCommented(Taoti taoti) {
		return taotiMapper.updateCommented(taoti);
	}
	@Override
	public int selectTaoticommented(Taoti taoti) {
		return taotiMapper.selectTaoticommented(taoti);
	}
	@Override
	public int selectTaotiStatus(int taotiId, int userid) {
		Boolean commented = taotiMapper.selectTaotiStatus(taotiId, userid);
		return 0;
	}
	@Override
	public int insertlabels(int taotiId, String labels) {
		return taotiMapper.insertlabels(taotiId, labels);
	}
	@Override
	public List<Taoti> selectTaoti(String name) {
		return taotiMapper.selectTaoti(name);
	}
}
