package com.pjmike.lundaoTaoti.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

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
	List<Taoti> selectAllTaoti(int id);
	
	/**
	 * 返回一个具体淘题信息
	 * @param nickname
	 * @return
	 */
	Taoti selectOne(@Param("taotiId")int taotiId,@Param("userid")int userid);
	
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
	
	int insertCommented(Taoti taoti);
	/**
	 * 模糊查询淘题
	 * @param name
	 * @return
	 */
	List<Taoti> selectTaoti(String name);
	int updateCommented(Taoti taoti);
	
	int selectTaoticommented(Taoti taoti);
	
	Boolean selectTaotiStatus(@Param("taotiId")int taotiId,@Param("userid")int userid);
	int insertlabels(@Param("taotiId")int taotiId,@Param("value")String labels);
}
