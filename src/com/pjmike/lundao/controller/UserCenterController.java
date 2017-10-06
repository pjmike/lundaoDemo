package com.pjmike.lundao.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pjmike.lundao.po.User;
import com.pjmike.lundao.po.UserCustom;
import com.pjmike.lundao.service.Impl.UserServiceImpl;
import com.pjmike.lundao.service.util.JsonRead;
import com.pjmike.lundao.po.AttentionOther;

import net.sf.json.JSONObject;

/**
 * @author pjmike
 * 用户个人中心设置
 */
/**
 * @author pjmike
 *
 */
@Controller
public class UserCenterController {
	@Autowired
	UserServiceImpl userServiceImpl;
	
	/**
	 * 编辑用户的个人资料
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/editUser")
	public ModelAndView editUser(HttpServletRequest request) throws IOException {
		JSONObject json = JsonRead.receivePost(request);
		int userid = json.getInt("userid");
		String userName = json.getString("nickname");
		String gender = json.getString("gender");
		String emailNumber = json.getString("emailNumber");
		String locations = json.getString("locations");
		String educations = json.getString("educations");
		String userSignature = json.getString("userSignature");
		User user = userServiceImpl.findUserById(userid);
		user.setNickname(userName);
		user.setGender(gender);
		user.setLocations(locations);
		user.setEducations(educations);
		user.setEmailNumber(emailNumber);
		user.setUserSignature(userSignature);
		userServiceImpl.updateUserInformation(user);
		return null;
		
	}
	/**
	 * 用户个人用户信息页面
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/getUser")
	public UserCustom getUser(HttpServletRequest request) throws IOException {
		JSONObject json = JsonRead.receivePost(request);
		int id = json.getInt("userid");
		UserCustom user = userServiceImpl.findUser(id);
		return user;
	}
	/**
	 * 关注他人
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/AttentionOther")
	public ModelAndView AttentionOther(HttpServletRequest request) throws IOException {
		JSONObject json = JsonRead.receivePost(request);
		int id = json.getInt("userid");
		int toUid = json.getInt("otherId");
		boolean status = json.getBoolean("isAttention");
		Integer count = userServiceImpl.AttentionedPeople(id, toUid);
		if (count > 0) {
			AttentionOther atttentionOther = new AttentionOther();
			atttentionOther.setFrom_uid(id);
			atttentionOther.setTo_uid(toUid);
			atttentionOther.setStatus(status);
			userServiceImpl.updateAttentionPeopleStatus(atttentionOther);
		} else {
			userServiceImpl.AttentionOther(id, toUid);
		}
		return null;
	}
}
