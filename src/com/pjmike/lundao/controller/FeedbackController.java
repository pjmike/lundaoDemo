package com.pjmike.lundao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pjmike.lundao.po.Feedback;
import com.pjmike.lundao.service.Impl.FeedbackServiceImpl;

@Controller
public class FeedbackController {
	@Autowired
	FeedbackServiceImpl feedbackServiceImpl;
	
	/**
	 * 接收用户的反馈
	 * @param id
	 * @param feedback
	 */
	@RequestMapping("/feedback")
	public void feedback(int id,String feedback) {
		Feedback feedback2 = new Feedback();
		feedback2.setFeedback(feedback);
		feedback2.setUserid(id);
		feedbackServiceImpl.insertfeedback(feedback2);
	}
}
