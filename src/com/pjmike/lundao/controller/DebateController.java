package com.pjmike.lundao.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pjmike.lundao.po.Debatetopic;
import com.pjmike.lundao.po.Debatetopicextend;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.service.Impl.DebateServiceImpl;


@Controller
public class DebateController {
	@Autowired
	private DebateServiceImpl debateServiceImpl;
	
	/*
	 * 按主键查找辩题，返回json辩题
	 */
	@RequestMapping("/debateFindbyId")
	public  @ResponseBody Debatetopicextend debateFindbyId(HttpServletRequest request, int id,Debatetopicextend debatetopic) {
		
		debatetopic = debateServiceImpl.selectByPrimaryKey(id);
		HttpSession session = request.getSession();
		session.setAttribute("debatetopic", debatetopic);
		return debatetopic;
	}
	/*
	 * 返回所有的辩题
	 */
	@RequestMapping("/debate")
	public  @ResponseBody List<Debatetopicextend> debate(HttpServletRequest request) {
		List<Debatetopicextend> DebatetopicList = debateServiceImpl.selectList();
		HttpSession session = request.getSession();
		session.setAttribute("DebatetopicList", DebatetopicList);
		return DebatetopicList;
	}
	/*
	 * 
	 * 获取全部辩题不带论点
	 */
	
	@RequestMapping("/debateby")
	public  @ResponseBody List<Debatetopic> debateby(HttpServletRequest request) {
		List<Debatetopic> DebatetopicList = debateServiceImpl.selectListby();
		HttpSession session = request.getSession();
		session.setAttribute("DebatetopicList", DebatetopicList);
		return DebatetopicList;
	}
	
	/*
	 * 跟新辩题的关注量
	 */
	@RequestMapping("/updateMark")
	public  @ResponseBody Debatetopic updateMark(HttpServletRequest request, int id,Debatetopic debatetopic) {
		//首先查找该辩题
		debatetopic = debateServiceImpl.selectByPrimaryKey(id);
		//设置user
		User user = (User) request.getAttribute("user");
		if(debatetopic != null) {
			int vote = debatetopic.getAttention();
			debatetopic.setAttention(vote+1);
			debateServiceImpl.updateByPrimaryKey(debatetopic,user);
		}
		HttpSession session = request.getSession();
		session.setAttribute("debatetopic", debatetopic);
		return debatetopic;
	}
	
	/*
	 * 
	 * 跟新辩题的点赞量？？？？？未解决？？？
	 */
	@RequestMapping("/updateVote")
	public  @ResponseBody Debatetopic updateVote(HttpServletRequest request, int topicid,Debatetopic debatetopic) {
		//首先查找该辩题
		debatetopic = debateServiceImpl.selectByPrimaryKey(topicid);
		if(debatetopic != null) {
			int vote = debatetopic.getLike();
			debatetopic.setAttention(vote+1);
			debateServiceImpl.updateByPrimaryKeyWithLike(debatetopic);
			
		}
		HttpSession session = request.getSession();
		session.setAttribute("debatetopic", debatetopic);
		return debatetopic;
	}
	/*
	 * 
	 *跟新辩题的不喜欢量
	 */
	@RequestMapping("/updatedlike")
	public  @ResponseBody Debatetopic updatedlike(HttpServletRequest request, int topicid,Debatetopic debatetopic) {
		//首先查找该辩题
		debatetopic = debateServiceImpl.selectByPrimaryKey(topicid);
		if(debatetopic != null) {
			int vote = debatetopic.getDislike();
			debatetopic.setAttention(vote+1);
		}
		HttpSession session = request.getSession();
		session.setAttribute("debatetopic", debatetopic);
		return debatetopic;
	}
	
	
	/*
	 * 根据已登录用户是否点击关注按钮来
	 * 返回给前端辩题的关注状态?????
	 * 
	 */
//	 @RequestMapping("")
	 
}
