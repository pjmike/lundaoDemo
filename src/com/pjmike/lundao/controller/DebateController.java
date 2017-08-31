package com.pjmike.lundao.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pjmike.lundao.po.Debatetopic;
import com.pjmike.lundao.po.Debatetopicextend;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.service.Impl.DebateServiceImpl;
import com.pjmike.lundao.service.util.JsonRead;

import net.sf.json.JSONObject;


@Controller
@RequestMapping("/debate")
public class DebateController {
	@Autowired
	private DebateServiceImpl debateServiceImpl;
	/*
	 * 按主键查找辩题，返回json辩题
	 */
	
	@RequestMapping("/findbyId")
	public  @ResponseBody Debatetopicextend debateFindbyId(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		JSONObject json = JsonRead.receivePost(request);
		int userid = json.getInt("id");
		int topicId = json.getInt("topicId");
		User user = new User();
		user.setId(userid);
		Debatetopicextend debatetopic = debateServiceImpl.selectByPrimaryKey(topicId,user);
		return debatetopic;
	}
	
	/*
	 * 
	 * 获取全部辩题不含论点
	 */
	
	@RequestMapping("/alldebate")
	public  @ResponseBody List<Debatetopic> debateby(HttpServletRequest request) throws IOException {
		User user =null;
		BufferedReader br = new BufferedReader(new InputStreamReader((ServletInputStream)request.getInputStream()
						,"utf-8"));
		String line = null;
		StringBuffer sb = new StringBuffer();
		while((line = br.readLine()) != null) {
		sb.append(line);
		}
		
	
		if (sb != null && sb.toString().length()>0) {
			JSONObject json = JsonRead.receivePost(request);
			int id = json.getInt("id");
			if(id>0) {
				user = new User();
				user.setId(id);
			}
		}
		
		List<Debatetopic> DebatetopicList = new ArrayList<>();
		
		DebatetopicList = debateServiceImpl.selectListby(user);
		return DebatetopicList;
	}
	/*
	 * 
	 *点赞操作
	 */
	@RequestMapping("/updateVote")
	public void updateVote(HttpServletRequest request, int topicid) throws UnsupportedEncodingException, IOException {
		JSONObject json = JsonRead.receivePost(request);
		int userid = json.getInt("id");
		int topicId = json.getInt("topicId");
		boolean statusLike = json.getBoolean("islike");
		if(statusLike) {
			debateServiceImpl.insetLike(topicid, userid);
			
		} else {
			debateServiceImpl.giveupLike(topicid, userid);
		}
		
	}

	/**
	 * 点击关注
	 * @throws IOException 
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping("updateAttention")
	public void updateAttention(HttpServletRequest request) throws UnsupportedEncodingException, IOException {
		JSONObject json = JsonRead.receivePost(request);
		
		int userid = json.getInt("id");
		int topicId = json.getInt("topicId");
		boolean isAttention = json.getBoolean("isAttention");
		if(isAttention) {
			debateServiceImpl.insertAttention(topicId, userid);
		} else {
			debateServiceImpl.deleteAttention(topicId, userid);
		}
	}
}
