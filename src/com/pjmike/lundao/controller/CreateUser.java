package com.pjmike.lundao.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pjmike.lundao.po.User;
import com.pjmike.lundao.service.Impl.UserServiceImpl;
import com.pjmike.lundao.service.util.JsonRead;

import net.sf.json.JSONObject;

@Controller
public class CreateUser {
	@Autowired
	UserServiceImpl userServiceImpl;
	@RequestMapping("/createUser")
	public ModelAndView createUser(HttpServletRequest request,HttpServletResponse response) throws IOException {
		JSONObject json = JsonRead.receivePost(request);
		String nickname = json.getString("nickname");
		String Icon = json.getString("Icon");
		String openid = json.getString("openid");
		User userdemo = userServiceImpl.selectUser(openid);
		if (userdemo != null) {
			String id = "{\"id\":"+userdemo.getId()+"}";
			JSONObject jb = new JSONObject().fromObject(id);
			response.getWriter().print(jb);
			return null;
		} else {			
			User user = new User();
			user.setNickname(nickname);
			user.setIcon(Icon);
			user.setOpenid(openid);
			userServiceImpl.insertUser(user);
			String id = "{\"id\":"+user.getId()+"}";
			JSONObject jb = new JSONObject().fromObject(id);
			response.getWriter().print(jb);
		}
		return null;
		
	}
}
