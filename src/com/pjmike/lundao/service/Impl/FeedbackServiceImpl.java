package com.pjmike.lundao.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjmike.lundao.mapper.FeedbackMapper;
import com.pjmike.lundao.po.Feedback;
@Service
public class FeedbackServiceImpl implements FeedbackService {
	@Autowired
	FeedbackMapper feedbackMapper;
	@Override
	public int insertfeedback(Feedback feedback) {
		return feedbackMapper.insertfeedback(feedback);
	}

}
