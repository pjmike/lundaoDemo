package com.pjmike.lundao.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pjmike.lundao.po.AskquAttention;
import com.pjmike.lundao.po.AskquestionAttention;
import com.pjmike.lundao.po.DebateAndThesis;
import com.pjmike.lundao.po.Debatetopic;
import com.pjmike.lundao.po.MyAttentionData;
import com.pjmike.lundao.po.Thesis;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.service.Impl.AskquesServiceImpl;
import com.pjmike.lundao.service.Impl.DebateServiceImpl;
import com.pjmike.lundao.service.Impl.UserAttentionServiceImpl;
import com.pjmike.lundao.service.Impl.UserServiceImpl;
import com.pjmike.lundao.service.util.JsonRead;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/user")
public class MyAttentionController {
	@Autowired
	AskquesServiceImpl askquesServiceImpl;
	@Autowired
	UserAttentionServiceImpl userAttentionServiceImpl;
	@Autowired
	UserServiceImpl userServiceImpl;
	@RequestMapping(value="/myAttention")
	@ResponseBody
	public MyAttentionData AttentionAskquestion(HttpServletRequest request) throws IOException {
		JSONObject json = JsonRead.receivePost(request);
		int id = json.getInt("id");
		List<AskquAttention> asks = askquesServiceImpl.selecrAllAttentionAskqustion(id);
		MyAttentionData myAttentionData = new MyAttentionData();
		myAttentionData.setAskquestions(asks);
		List<DebateAndThesis> debateandthesis = new ArrayList<>();
		
		List<Debatetopic> debates = userAttentionServiceImpl.selectAlldebateAttentioned(id);
		List<Thesis> thesises = userAttentionServiceImpl.selectAllThesisAttentioned(id);
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
		return myAttentionData;
	}
}
