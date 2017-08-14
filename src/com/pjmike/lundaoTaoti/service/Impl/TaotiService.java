package com.pjmike.lundaoTaoti.service.Impl;

import java.util.List;

import com.pjmike.lundaoTaoti.po.Taoti;

public interface TaotiService {
	/**
	 * 增加用户发起的辩题存入淘题数据库
	 * @param taoti
	 * @return
	 */
	int insertTheis(Taoti taoti);
	
	/**
	 * 返回用户的淘题信息
	 * @param nickname
	 * @return
	 */
	List<Taoti> selectAllTaoti(String nickname);
	
	/**增加或减少淘题的期望值
	 * @param id
	 * @return
	 */
	int upAndDownCommentNum(Taoti taoti); 
	
	/**
	 * 返回一个具体淘题信息
	 * @param nickname
	 * @return
	 */
	Taoti selectOne(int id);
	
}
