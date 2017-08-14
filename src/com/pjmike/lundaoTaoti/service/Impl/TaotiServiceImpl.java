package com.pjmike.lundaoTaoti.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
		return taotiMapper.insertTheis(taoti);
	}
	/**
	 * 返回用户的淘题信息
	 */
	@Override
	public List<Taoti> selectAllTaoti(String nickname) {
		
		List<Taoti> taotilist = taotiMapper.selectAllTaoti(nickname);
		for(Taoti taoti:taotilist) {
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
	public Taoti selectOne(int id) {
		return taotiMapper.selectOne(id);
	}
}
