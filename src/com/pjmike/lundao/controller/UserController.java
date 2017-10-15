package com.pjmike.lundao.controller;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.druid.util.StringUtils;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.po.UserCustom;
import com.pjmike.lundao.service.Impl.NotifyServiceImpl;
import com.pjmike.lundao.service.Impl.UserServiceImpl;
import com.pjmike.lundao.service.util.JsonRead;
import com.pjmike.lundao.util.Error;
import com.pjmike.lundao.util.Md5Util;
import com.pjmike.lundao.util.RedisTokenManager;
import com.pjmike.lundao.util.TokenManager;
import com.pjmike.lundao.util.TokenModel;
import com.pjmike.lundao.util.UserNotFoundException;

import net.sf.json.JSONObject;
/**用户注册与登录实现
 * @author pjmike
 *
 */
@Controller
public class UserController {
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@Autowired
	private RedisTokenManager tokenManager;
	
	@Autowired
	private NotifyServiceImpl notifyServiceImpl;
	
	/**
	 * @return
	 */
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	/**用户注册
	 * @param user
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/signup")
	public ModelAndView signup(@RequestBody User user,HttpServletResponse response) throws IOException {
		/*JSONObject json = JsonRead.receivePost(request);
		long mobile = json.get
		String password = json.getString("password");
		User user = new User();*/
		String md5password = Md5Util.generateMD5(user.getPassword());
		user.setMobile(user.getMobile());
		user.setPassword(md5password);
        User user1 = userServiceImpl.findUserBymobile(user.getMobile());
        response.setCharacterEncoding("UTF-8");
        PrintWriter p = response.getWriter();
		if (user1 != null) {
			p.write("error");
		} else {
			userServiceImpl.insertUserbyMobile(user);
			p.write("signUpSuccess");
		}
		return null;
	}
	/**用户登录
	 * @param user
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/signin")
	public ModelAndView signin(@RequestBody User user,HttpServletResponse response) throws Exception {
		/*JSONObject json = JsonRead.receivePost(request);
		int mobile = json.getInt("mobile");
		String password = json.getString("password");
		String md5password = Md5Util.generateMD5(password);*/
		long mobile = user.getMobile();
		String md5password = Md5Util.generateMD5(user.getPassword());
		User user1 = userServiceImpl.findUserBymobile(mobile);
		
		if (user1 == null || !user1.getPassword().equals(md5password)) {
			throw new UserNotFoundException(mobile);
		} 
		//生成Token
		TokenModel tokenmodel = tokenManager.createToken(user.getId());
		String userNote = "{\"id\":"+user1.getId()+",\"auth_token\":"+tokenmodel.getToken()+"}";
		response.setCharacterEncoding("UTF-8");
		response.getWriter().println(userNote);
		notifyServiceImpl.pullRemind(user1);
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
	
	@ExceptionHandler(UserNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public @ResponseBody Error UserNotFound(UserNotFoundException e) {
		long userid = e.getMobile();
		return new Error(404, "User ["+userid+"] not Found");
	}
}
