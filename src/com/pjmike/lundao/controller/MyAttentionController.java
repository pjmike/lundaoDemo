package com.pjmike.lundao.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonView;
import com.pjmike.lundao.po.AskquAttention;
import com.pjmike.lundao.po.AskquestionAttention;
import com.pjmike.lundao.po.DebateAndThesis;
import com.pjmike.lundao.po.DebateTopicSimple;
import com.pjmike.lundao.po.Debatetopic;
import com.pjmike.lundao.po.MyAttentionData;
import com.pjmike.lundao.po.Thesis;
import com.pjmike.lundao.po.ThesisSimple;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.po.UserSimple;
import com.pjmike.lundao.service.Impl.AskquesServiceImpl;
import com.pjmike.lundao.service.Impl.DebateServiceImpl;
import com.pjmike.lundao.service.Impl.UserAttentionServiceImpl;
import com.pjmike.lundao.service.Impl.UserServiceImpl;
import com.pjmike.lundao.service.util.JsonRead;

import net.sf.json.JSONObject;

/**
 * @author pjmike
 *
 */
@RestController
@RequestMapping("/user")
public class MyAttentionController {
	@Autowired
	AskquesServiceImpl askquesServiceImpl;
	@Autowired
	UserAttentionServiceImpl userAttentionServiceImpl;
	@Autowired
	UserServiceImpl userServiceImpl;
	/**
	 * 用户的关注页面
	 * @param request
	 * @return
	 * @throws IOException
	 */
	/*@RequestMapping(value="/myAttention")
	public MyAttentionData AttentionAskquestion(HttpServletRequest request) throws IOException {
		JSONObject json = JsonRead.receivePost(request);
		int id = json.getInt("id");
		List<AskquAttention> asks = askquesServiceImpl.selecrAllAttentionAskqustion(id);
		MyAttentionData myAttentionData = new MyAttentionData();
		myAttentionData.setAskquestions(asks);
		List<DebateAndThesis> debateandthesis = new ArrayList<>();
		
		List<Debatetopic> debates = userAttentionServiceImpl.selectAlldebateAttentioned(id);
		List<Thesis> thesises = userAttentionServiceImpl.selectAllThesisAttentioned(id);
		List<User> myAttentionUsers = userServiceImpl.selectMyUserFormotion(id);
		for(Debatetopic d:debates) {
			DebateAndThesis deb = new DebateAndThesis();
			deb.setBtState(0);
			deb.setTitle(d.getDescribtion());
			deb.setContentSummary(d.getContent());
			deb.setId(d.getTopicid());
			deb.setViewNum(d.getView());
			debateandthesis.add(deb);
		}
		for(Thesis t:thesises) {
			DebateAndThesis deb = new DebateAndThesis();
			deb.setBtState(1);
			deb.setContentSummary(t.getTstate());
			deb.setTitle(t.getTdescription());
			deb.setId(t.getThesisid());
			deb.setViewNum(t.gettView());
			debateandthesis.add(deb);
		}
		myAttentionData.setDebateAndThesis(debateandthesis);
		myAttentionData.setAttentionPeople(myAttentionUsers);
		
		return myAttentionData;
	}*/
	/**
	 * 用户关注的论点
	 * @param user
	 * @return
	 */
	@RequestMapping("/myAttentionThesis/{userid}")
	public List<ThesisSimple> myAttentionThesis(@PathVariable("userid")int userid) {
		List<ThesisSimple> thesises = userAttentionServiceImpl.selectAllThesisAttentioned(userid);
		return thesises;
		
	}
	/**
	 * 用户关注的辩题
	 * @param user
	 * @return
	 */
	@RequestMapping("/myAttentionDebate/{userid}")
	@ResponseBody
	public List<DebateTopicSimple> myAttentionDebate(@PathVariable("userid")int userid) {
		List<DebateTopicSimple> debates = userAttentionServiceImpl.selectAlldebateAttentioned(userid);
		return debates;
	}
	/**
	 * 用户关注的用户
	 * @param user
	 * @return
	 */
	@RequestMapping("/myAttentionUser/{userid}")
	public List<UserSimple> myAttentionUser(@PathVariable("userid")int userid) {
		//原用户信息
		List<User> myAttentionUsers = userServiceImpl.selectMyUserFormotion(userid);
		List<UserSimple> userSimples = new ArrayList<UserSimple>();
		for (User u : myAttentionUsers) {
			UserSimple us = new UserSimple();
			us.setIcon(u.getIcon());
			us.setId(u.getId());
			us.setNickname(u.getNickname());
			us.setUserSignature(u.getUserSignature());
			userSimples.add(us);
		}
		return userSimples;
	}
}
