package com.pjmike.lundao.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pjmike.lundao.po.Feedback;
import com.pjmike.lundao.service.Impl.FeedbackServiceImpl;
import com.pjmike.lundao.service.util.JsonRead;

import net.sf.json.JSONObject;

@Controller
public class FeedbackController {
	@Autowired
	FeedbackServiceImpl feedbackServiceImpl;
	
	/**
	 * 接收用户的反馈
	 * @param id
	 * @param feedback
	 * @throws IOException 
	 */
	@RequestMapping("/feedback")
	public ModelAndView feedback(HttpServletRequest request) throws IOException {
		Feedback feedback2 = new Feedback();
		JSONObject json = JsonRead.receivePost(request);
		String feedback = json.getString("feedback");
		int id = json.getInt("id");
		feedback2.setFeedback(feedback);
		feedback2.setUserid(id);
		feedbackServiceImpl.insertfeedback(feedback2);
		return null;
	}
}
