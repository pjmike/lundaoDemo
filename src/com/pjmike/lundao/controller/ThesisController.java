package com.pjmike.lundao.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pjmike.lundao.po.Supplement;
import com.pjmike.lundao.po.Thesis;
import com.pjmike.lundao.po.ThesisExtend;
import com.pjmike.lundao.po.ThesisSupplement;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.service.Impl.DebateServiceImpl;
import com.pjmike.lundao.service.Impl.ThesisServiceImpl;
import com.pjmike.lundao.service.Impl.ThesisServiceImpl2;

import net.sf.json.JSONObject;

/**
 * @author DELL
 * 对论点的操作
 *
 */
@Controller
public class ThesisController {
	
	
	@Autowired
	DebateServiceImpl debateServiceImpl;
	
	@Autowired
	ThesisServiceImpl thesisServiceImpl;
	@Autowired
	ThesisServiceImpl2 thesisServiceImpl2;
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/thesisbyid")
	@ResponseBody
	public ThesisExtend selectBythesisId(HttpServletRequest request) throws Exception,ClassCastException {
		
		String thesisid = request.getParameter("thesisId");
		String userid = request.getParameter("id");
		
		int id = Integer.parseInt(thesisid);
		int uid = 0;
		if(userid!=null) {
			uid = Integer.parseInt(userid);
		}
		User user = null;
		if (uid>0) {
			user = new User();
			user.setId(uid);
		}
		
		return thesisServiceImpl.selectBythesisId(id,user);
	}
	/**
	 * 查询某一具体论点的简介与题目
	 * @param id
	 * @return
	 */
	@RequestMapping("/oneThesis")
	@ResponseBody
	public Thesis oneThesis(int id) {
		return thesisServiceImpl.selectOne(id);
	}
	
	/**
	 * 
	 * @param request
	 * 做增添论点的功能
	 */
	@RequestMapping("/insertthesis")
	public void insertthesis(@RequestBody Thesis thesis,HttpServletRequest request) {
		
		
		thesisServiceImpl.insert(thesis);
	}
	/**
	 * 关注与取消论点
	 */
	@RequestMapping("/thesisAttention")
	public void thesisAttention(HttpServletRequest request,int thesisid) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		Thesis thesis = thesisServiceImpl.selectOne(thesisid);
		if(thesis != null && user !=null) {
			thesisServiceImpl.insertAttention(thesisid, user);
		}
	}
	
	/**
	 * 提交完善版本
	 */
	@RequestMapping("/submitSupplement")
	public void submitSupplement(@RequestBody Supplement supplement) {
		thesisServiceImpl.insertsupplement(supplement);
	}
	/**
	 * 返回所有的完善版本
	 */
	@RequestMapping("/returnAllSupplement")
	@ResponseBody
	public List<ThesisSupplement> returnAllSupplement(HttpServletRequest request) {
		//object为前端传过来的属性名
		JSONObject jb = new JSONObject().fromObject(request.getParameter("object"));
		
		Supplement supplement = new Supplement();
		supplement.setNickname(jb.getString("nickname"));
		supplement.setIcon(jb.getString("Icon"));
		supplement.setThesisId(jb.getInt("thesisId"));
		
		return thesisServiceImpl.selectAllSupplement(supplement);
	}
}
