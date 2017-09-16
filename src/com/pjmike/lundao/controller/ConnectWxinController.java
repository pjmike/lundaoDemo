package com.pjmike.lundao.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pjmike.lundao.connect.ConnectWenxin;
import com.pjmike.lundao.po.OpenId;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.service.Impl.UserServiceImpl;
import com.pjmike.lundao.service.util.JsonRead;

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
	 * @throws IOException 
	 * 
	 */
	@RequestMapping("/connect")
	public ModelAndView connect(HttpServletRequest request,HttpServletResponse response) throws IOException {
		JSONObject json = JsonRead.receivePost(request);
		/*String nickname = json.getString("nickname");
		String imgurl = json.getString("Icon");*/
		
		String code = json.getString("code");
		String nickname = json.getString("nickname");
		String Icon = json.getString("Icon");
		System.out.println(code);
		System.out.println("\n");
		//获取用户名和头像路径地址
		/*try {
			//防止中文乱码
			String userNameDecode = new String(nickname.getBytes("ISO-8859-1"),"utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
//		JSONObject obj = new JSONObject().fromObject("user");
		
		
		
		//添加用户信息
		/*if (nickname != null && imgurl != null) {
			User user = new User();
			user.setNickname(nickname);
			user.setIcon(imgurl);
			userServiceImpl.insertUser(user);
		}*/
		
		//appid为小程序ID
		String appid = "wx729dd86a0f029999";
		//secret为小程序密钥(AppSecret)
		String secret= "e89fad08534ea1be4327ef71d6445c33";
		
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
	/*	String open_id = "{\"openid\":"+openid+"}";
		JSONObject js = new JSONObject().fromObject(open_id);*/
		OpenId open = new OpenId();
		open.setOpenid(openid);
		String uid = UUID.randomUUID().toString();
		StringBuffer sb = new StringBuffer();
		sb.append(openid);
		sb.append(","+session_key);
		/*
		HttpSession session = request.getSession();
		session.setAttribute(uid, sb.toString());
		session.setMaxInactiveInterval(900);*/
		
		User userdemo = userServiceImpl.selectUser(openid);
		if (userdemo != null) {
			String id = "{\"id\":"+userdemo.getId()+"}";
			JSONObject jb = new JSONObject().fromObject(id);
			response.getWriter().print(jb);
			return null;
		} else {			
			User user = new User();
			user.setOpenid(openid);
			user.setNickname(nickname);
			user.setIcon(Icon);
			userServiceImpl.insertUser(user);
			String id = "{\"id\":"+user.getId()+"}";
			JSONObject jb = new JSONObject().fromObject(id);
			response.getWriter().print(jb);
		}
		return null;
	}
}