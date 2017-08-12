package com.pjmike.lundao.controller;

import java.io.UnsupportedEncodingException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pjmike.lundao.connect.ConnectWenxin;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.service.Impl.UserServiceImpl;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/*
 * @author pjmike
 *与小程序通信获取code值
 *
 */
@Controller
public class ConnectWxinController {
	@Autowired
	UserServiceImpl userServiceImpl;
	/**
	 * 
	 */
	@RequestMapping("/connect")
	public String connect(HttpServletRequest request) {
		//获取用户名和头像路径地址
		String nickname = request.getParameter("username");
		try {
			//防止中文乱码
			String userNameDecode = new String(nickname.getBytes("ISO-8859-1"),"utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		JSONObject obj = new JSONObject().fromObject("user");
		
		String imgurl = request.getParameter("img");
		String code = request.getParameter("code");
		
		//添加用户信息
		if (nickname != null && imgurl != null) {
			User user = new User();
			user.setNickname(nickname);
			user.setIcon(imgurl);
			userServiceImpl.insertUser(user);
		}
		
		//appid为小程序ID
		String appid = null;
		//secret为小程序密钥(AppSecret)
		String secret= null;
		
		String url = "https://api.weixin.qq.com/sns/jscode2session?appid="+appid+"&secret="+secret+"&js_code="+code+"&grant_type=authorization_code";
		String openidskey = ConnectWenxin.GET(url);
		
		//解析获得的openid+session_key JSON字符串
		JSONArray jsonArray = new JSONArray();
		JSONObject obj = new JSONObject().fromObject(openidskey);
		String openid = null;
		String session_key = null;
		if(obj.getString("openid")!=null && obj.getString("session_key")!=null) {
		 openid = obj.getString("openid");
		 session_key = obj.getString("session_key");
		}
		String uid = UUID.randomUUID().toString();
		StringBuffer sb = new StringBuffer();
		sb.append(openid);
		sb.append(","+session_key);
		
		HttpSession session = request.getSession();
		session.setAttribute(uid, sb.toString());
		session.setMaxInactiveInterval(900);
		
		return uid;
		
	}
}
