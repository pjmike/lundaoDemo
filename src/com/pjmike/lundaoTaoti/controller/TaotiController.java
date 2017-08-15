package com.pjmike.lundaoTaoti.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pjmike.lundaoTaoti.po.Taoti;
import com.pjmike.lundaoTaoti.service.Impl.TaotiServiceImpl;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
public class TaotiController {
	@Autowired
	TaotiServiceImpl taotiServiceImpl;
	/**
	 * 查询出一个淘题信息
	 * @param id
	 * @return
	 */
	@RequestMapping("returnOneThesis")
	@ResponseBody
	public Taoti returnOneThesis(int id) {
		return taotiServiceImpl.selectOne(id);
	}
	
	@RequestMapping("/insertTaotiThesis")
	public void insertTaotiThesis() {
		
	}
	/**
	 * 查询出所有淘题信息
	 * @param request
	 * @return
	 */
	@RequestMapping("allTaoti")
	@ResponseBody
	public List<Taoti> allTaoti(HttpServletRequest request) {
		@SuppressWarnings("static-access")
		JSONObject jsonObject = new JSONObject().fromObject(request.getAttribute("object"));
		String nickname = jsonObject.getString("nickname");
		
		return taotiServiceImpl.selectAllTaoti(nickname);
		
	}
	/**
	 * 增加或减少淘题的期望值
	 * @param request
	 */
	@RequestMapping("upAndDownCommentNum")
	public void upAndDownCommentNum(HttpServletRequest request) {
		@SuppressWarnings("static-access")
		JSONObject jb = new JSONObject().fromObject(request.getAttribute("Taoti"));
		
		Taoti taoti = new Taoti();
		taotiServiceImpl.upAndDownCommentNum(taoti);
	}
	
	/**
	 * 发起一个辩题
	 * @param request
	 */
	@RequestMapping("insertTheis")
	public void insertTheis(HttpServletRequest request) {
		@SuppressWarnings("static-access")
		JSONObject jb = new JSONObject().fromObject(request.getAttribute("Taoti"));
		String nickname = jb.getString("nickname");
		String Icon = jb.getString("Icon");
		String title = jb.getString("describtion");
		String content = jb.getString("content");
		String backgroud = jb.getString("backgroud");
		JSONArray la = jb.getJSONArray("labels");
		String[] labels = null;
		for(int i=0;i<la.size();i++) {
			labels[i] = la.getString(i);
		}
		Taoti taoti = new Taoti();
		taoti.setBackground(backgroud);
		taoti.setContent(content);
		taoti.setTitle(title);
		taoti.setLabels(labels);
		taoti.setNickname(nickname);
		taoti.setIcon(Icon);
		
		taotiServiceImpl.insertTheis(taoti);
		
		
	}
}
