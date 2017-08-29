package com.pjmike.lundaoTaoti.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pjmike.lundao.service.util.JsonRead;
import com.pjmike.lundaoTaoti.po.Taoti;
import com.pjmike.lundaoTaoti.service.Impl.TaotiServiceImpl;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/taoti")
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
	 * @throws IOException 
	 */
	@RequestMapping("allTaoti")
	@ResponseBody
	public List<Taoti> allTaoti(HttpServletRequest request) throws IOException {
		JSONObject jsonObject = JsonRead.receivePost(request);
		String nickname = jsonObject.getString("nickname");
		
		return taotiServiceImpl.selectAllTaoti(nickname);
		
	}
	/**
	 * 增加或减少淘题的期望值
	 * @param request
	 * @throws IOException 
	 */
	@RequestMapping("upAndDownCommentNum")
	public void upAndDownCommentNum(HttpServletRequest request) throws IOException {
		JSONObject jb = JsonRead.receivePost(request);
		
		Taoti taoti = new Taoti();
		taotiServiceImpl.upAndDownCommentNum(taoti);
	}
	
	/**
	 * 发起一个辩题
	 * @param request
	 * @throws IOException 
	 */
	@RequestMapping("insertTheis")
	public void insertTheis(HttpServletRequest request) throws IOException {
		JSONObject jb = JsonRead.receivePost(request);
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
