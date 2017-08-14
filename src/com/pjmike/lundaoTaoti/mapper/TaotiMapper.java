package com.pjmike.lundaoTaoti.mapper;

import java.util.List;

import com.pjmike.lundaoTaoti.po.Taoti;

public interface TaotiMapper {
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
	
	/**
	 * 返回一个具体淘题信息
	 * @param nickname
	 * @return
	 */
	Taoti selectOne(int id);
	
	/**增加淘题的期望值
	 * @param id
	 * @return
	 */
	int upCommentNum(int id); 
	
	/**减少淘题的期望值
	 * @param id
	 * @return
	 */
	int downCommentNum(int id);
}
