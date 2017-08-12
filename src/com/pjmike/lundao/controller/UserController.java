package com.pjmike.lundao.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.util.StringUtils;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.po.UserCustom;
import com.pjmike.lundao.service.Impl.UserServiceImpl;
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
	public String signin() {
		return "signin";
	}
	
	/*//用户注册
	@RequestMapping(value="/user/adduser",method={RequestMethod.POST})
	 public @ResponseBody User loginupJson(Model model,User user) throws Exception {
		 //@responseBody将user转成json输出
		int result = userServiceImpl.addUser(user);
		if(result > 0) {
			model.addAttribute("msg", "恭喜你注册成功"+user.getMobile());
		} else {
			model.addAttribute("服务器失败，注册失败");
		}
		user = userServiceImpl.findUserBymobile(user.getMobile());
		return user;
	 }
	
	//用户登录信息
	@RequestMapping(value="/user/signin",method={RequestMethod.POST})
	 public @ResponseBody User signInJson(HttpSession session,Model model,User user) throws Exception {
		 //@responseBody将user转成json输出
		//设置session
		session.setAttribute("user", user);
		
		user = userServiceImpl.findUserBymobile(user.getMobile());
		return user;
	 }
	
	//获取用户信息
	@RequestMapping(value="/user",method={RequestMethod.GET})
	public @ResponseBody User findUserById(Model model,User user,int id) throws Exception { 
		user = userServiceImpl.findUserById(id);
		return user;
	}
	
	//更新用户信息
	@RequestMapping(value="/user/id",method={RequestMethod.GET})
	public @ResponseBody User updateUserById(Model model,User user) throws Exception { 
		user = userServiceImpl.updateUserById(user);
		return user;
	}*/
}
