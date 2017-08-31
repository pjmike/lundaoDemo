package com.pjmike.lundao.controller;


import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.JsonObject;
import com.pjmike.lundao.po.Askquestion;
import com.pjmike.lundao.po.AskquestionExtend;
import com.pjmike.lundao.po.ReplyExtend;
import com.pjmike.lundao.po.Supplement;
import com.pjmike.lundao.po.Thesis;
import com.pjmike.lundao.po.ThesisExtend;
import com.pjmike.lundao.po.ThesisSupplement;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.service.Impl.AskquesServiceImpl;
import com.pjmike.lundao.service.Impl.DebateServiceImpl;
import com.pjmike.lundao.service.Impl.ThesisServiceImpl;
import com.pjmike.lundao.service.Impl.ThesisServiceImpl2;
import com.pjmike.lundao.service.Impl.ThesisServiceImpl3;
import com.pjmike.lundao.service.util.JsonRead;
import com.rabbitmq.tools.json.JSONReader;

import net.sf.json.JSONObject;

/**
 * @author DELL
 * 对论点的操作
 *
 */
@Controller
@RequestMapping("/thesis")
public class ThesisController {
	
	
	@Autowired
	DebateServiceImpl debateServiceImpl;
	
	@Autowired
	ThesisServiceImpl thesisServiceImpl;
	@Autowired
	ThesisServiceImpl3 thesisServiceImpl3;
	@Autowired
	AskquesServiceImpl askquesServiceImpl;
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/thesisbyid")
	@ResponseBody
	public ThesisExtend selectBythesisId(HttpServletRequest request,HttpServletResponse response) throws Exception,ClassCastException {
		JSONObject json = JsonRead.receivePost(request);
		int thesisid = json.getInt("thesisId");
		int userid = json.getInt("id");
		User user = null;
		if (userid>0) {
			user = new User();
			user.setId(userid);
		}
		ThesisExtend thesis = thesisServiceImpl.selectBythesisId(thesisid,user);
		return thesis;
	}
	@RequestMapping("/replyRightScroll")
	@ResponseBody
	public AskquestionExtend testReply(HttpServletRequest request) throws IOException {
		JSONObject json = JsonRead.receivePost(request);
		int CommentId = json.getInt("commentId");
		int id = json.getInt("id");
		int Fromuid = json.getInt("fromUid");
		int replyid = json.getInt("replyId");
		int touid = json.getInt("toUid");
		int userid = json.getInt("userid");
		User user = null;
		if(userid >0 ) {
			user = new User();
			user.setId(userid);
		}
		ReplyExtend reply = new ReplyExtend();
		reply.setCommentId(CommentId);
		reply.setFromUid(Fromuid);
		reply.setId(id);
		reply.setReplyId(replyid);
		reply.setToUid(touid);
		
		AskquestionExtend ask = thesisServiceImpl3.selectReply(reply,user);
		
		return ask;
	}
	@RequestMapping("/replyLeftScroll")
	@ResponseBody
	public AskquestionExtend testReplyCallBack(HttpServletRequest request) throws IOException {
		JSONObject json = JsonRead.receivePost(request);
		int CommentId = json.getInt("commentId");
		int id = json.getInt("id");
		int Fromuid = json.getInt("fromUid");
		int replyid = json.getInt("replyId");
		int touid = json.getInt("toUid");
		int userid = json.getInt("userid");
		User user = null;
		if(userid > 0) {
			user = new User();
			user.setId(userid);
		}
		ReplyExtend reply = new ReplyExtend();
		reply.setCommentId(CommentId);
		reply.setFromUid(Fromuid);
		reply.setId(id);
		reply.setReplyId(replyid);
		reply.setToUid(touid);
		AskquestionExtend ask = askquesServiceImpl.findReply(reply, user);
		return ask;
	}
	/**
	 * 查询某一具体论点的简介与题目
	 * @param id
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/oneThesis")
	@ResponseBody
	public Thesis oneThesis(HttpServletRequest request) throws IOException {
		JSONObject json = JsonRead.receivePost(request);
		int id = json.getInt("thesisId");
		return thesisServiceImpl.selectOne(id);
	}
	
	/**
	 * 
	 * @param request
	 * 做增添论点的功能
	 * @throws IOException 
	 */
	@RequestMapping("/insertthesis")
	public void insertthesis(HttpServletRequest request) throws IOException {
		JSONObject json = JsonRead.receivePost(request);
		int tDebateid = json.getInt("tDebateid");
		String tDescription = json.getString("tDescription");
		int tfromuid = json.getInt("tfromuid");
		String tState = json.getString("tState");
		Thesis thesis = new Thesis();
		thesis.setTfromuid(tfromuid);
		thesis.settDebateid(tDebateid);
		thesis.setTdescription(tDescription);
		thesis.setTstate(tState);
		thesisServiceImpl.insert(thesis);
	}
	/**
	 * 关注与取消论点
	 * @throws IOException 
	 */
	@RequestMapping("/thesisAttention")
	public void thesisAttention(HttpServletRequest request) throws IOException {
		JSONObject json = JsonRead.receivePost(request);
		int id = json.getInt("id");
		User user = new User();
		user.setId(id);
		int thesisid = json.getInt("thesisId");
		if(thesisid >0 && user !=null) {
			thesisServiceImpl.insertAttention(thesisid, user);
		}
	}
	
	/**
	 * 提交完善版本
	 * @throws IOException 
	 */
	@RequestMapping("/submitSupplement")
	public void submitSupplement(HttpServletRequest request) throws IOException {
		JSONObject json = JsonRead.receivePost(request);
		int thesisId = json.getInt("thesisId");
		int userId = json.getInt("userId");
		String nickname = json.getString("nickname");
		String Icon = json.getString("Icon");
		String supplement = json.getString("supplement");
		Supplement su = new Supplement();
		su.setIcon(Icon);
		su.setNickname(nickname);
		su.setSupplement(supplement);
		su.setThesisId(thesisId);
		su.setUserid(userId);
		thesisServiceImpl.insertsupplement(su);
	}
	/**
	 * 返回所有的完善版本
	 * @throws IOException 
	 */
	@RequestMapping("/returnAllSupplement")
	@ResponseBody
	public List<ThesisSupplement> returnAllSupplement(HttpServletRequest request) throws IOException {
		//object为前端传过来的属性名
		JSONObject jb = JsonRead.receivePost(request);	
		Supplement supplement = new Supplement();
		supplement.setNickname(jb.getString("nickname"));
		supplement.setIcon(jb.getString("Icon"));
		supplement.setThesisId(jb.getInt("thesisId"));
		
		return thesisServiceImpl.selectAllSupplement(supplement);
	}
}
