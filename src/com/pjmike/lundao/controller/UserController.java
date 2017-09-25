package com.pjmike.lundao.controller;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.druid.util.StringUtils;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.po.UserCustom;
import com.pjmike.lundao.service.Impl.UserServiceImpl;
import com.pjmike.lundao.service.util.JsonRead;

import net.sf.json.JSONObject;
@Controller
public class UserController {
	@Autowired
	private UserServiceImpl userServiceImpl;
	/*@RequestMapping("/user/adduser")
	public String addUser(Model model,User user) throws Exception {

		
		System.out.println("用户注册："+user.getUsername()+user.getPassword());
		
		//验证用户登录
		user = userServiceImpl.checkLogin(user.getUsername(), user.getPassword());
		if(user!=null) {
			model.addAttribute("msg","恭喜你登录成功");
		} else {
			
			int result = userServiceImpl.addUser(user);
			if(result > 0) {
				model.addAttribute("msg", "恭喜你注册成功"+user.getUsername());
			} else {
				model.addAttribute("服务器失败，注册失败");
			}
		}
		
		
		//注册页面
		
		int result = userServiceImpl.addUser(user);
		if(result > 0) {
			model.addAttribute("msg", "恭喜你注册成功"+user.getUsername());
		} else {
			model.addAttribute("服务器失败，注册失败");
		}
		return "msg";
		
		//验证登录
		user = userServiceImpl.checkLogin(user.getUsername(), user.getPassword());
		if(user!=null) {
			model.addAttribute("user",user);
			return "success";	
		}       
		return "fail";
		
		
		
		 * 
		 * StringUtils是什么？？？？？
		 
		if(StringUtils.isEmpty(user.getMobile()) ||StringUtils.isEmpty(user.getPassword())){
			model.addAttribute("msg","注册表为空，注册失败");
			return "msg";
		}
	
		if(null != userServiceImpl.checkLogin(user.getMobile(),user.getPassword())) {
			model.addAttribute("msg","你已经注册过了，请勿重新注册");
			return "msg";
		} else {
			int result = userServiceImpl.addUser(user);
			if(result > 0) {
				model.addAttribute("msg", "恭喜你注册成功"+user.getMobile());
			} else {
				model.addAttribute("服务器失败，注册失败");
			}
			return "msg";
		}
	}*/
	@RequestMapping("/index")
	public String index() {
		
		return "index";
	}
	@RequestMapping("/signin")
	public ModelAndView signin(HttpServletRequest request) throws IOException {
		JSONObject json = JsonRead.receivePost(request);
		String nickname = json.getString("nickname");
		int password = json.getInt("password");
		
		User user = userServiceImpl.findUserByname(nickname);
		if (user == null || user.getPassword().equals(password)) {
			return null;
		} 
		
		
		return null;
	}
	
	
	@RequestMapping(value="/photoupLoad",method=RequestMethod.POST)
	public ModelAndView photoupLoad(MultipartFile file,HttpServletRequest request) throws IllegalStateException, IOException {
		//获取项目的webroot
		String pathroot = request.getSession().getServletContext().getRealPath("");
		String path = "";
		String originalfilename = file.getOriginalFilename();
		//存储图片
		if (file != null && originalfilename != null && originalfilename.length() >0 ) {
			//新的图片名称
			String newFilename = UUID.randomUUID() + originalfilename.substring(originalfilename.lastIndexOf("."));
			path = "/img"+newFilename;
			File picfile = new File(pathroot+path);
			//将文件写入
			file.transferTo(picfile);
			//将图片新名称写入数据库
			User user = new User();
			user.setIcon(newFilename);
		}
		return null;
	
	}
	
}
