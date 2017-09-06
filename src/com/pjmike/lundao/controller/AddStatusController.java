package com.pjmike.lundao.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.sf.json.JSONObject;

@Controller
public class AddStatusController {
	@RequestMapping(value="/changeStatus",method=RequestMethod.GET)
	public ModelAndView changeStatus(HttpServletRequest request) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader((ServletInputStream)request.getInputStream()
				,"utf-8"));
		String line = "";
		StringBuffer sb = new StringBuffer();
		while((line = br.readLine()) != null) {
			sb.append(line);
		}
		JSONObject json = new JSONObject().fromObject(sb.toString());
		int userid = json.getInt("id");
//		int topicId = json.getInt(")
		return null;
		
	}
}
