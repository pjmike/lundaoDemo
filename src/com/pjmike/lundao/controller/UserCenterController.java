package com.pjmike.lundao.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pjmike.lundao.po.User;
import com.pjmike.lundao.po.UserCustom;
import com.pjmike.lundao.service.Impl.NotifyServiceImpl;
import com.pjmike.lundao.service.Impl.UserServiceImpl;
import com.pjmike.lundao.service.util.JsonRead;
import com.pjmike.lundao.util.Action;
import com.pjmike.lundao.util.TargetType;
import com.pjmike.lundao.po.Askquestion;
import com.pjmike.lundao.po.AskquestionExtend;
import com.pjmike.lundao.po.AttentionOther;
import com.pjmike.lundao.po.Debatetopic;
import com.pjmike.lundao.po.Thesis;
import com.pjmike.lundao.po.ThesisExtend;

import net.sf.json.JSONObject;


/**
 * @author pjmike
 *
 */
@Controller
public class UserCenterController {
	@Autowired
	UserServiceImpl userServiceImpl;
	@Autowired
	NotifyServiceImpl notifyServiceImpl;
	
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
			notifyServiceImpl.subscribe(id, toUid, TargetType.USER, Action.ATTENTION);
			notifyServiceImpl.createInformation(toUid, TargetType.USER, Action.ATTENTION, id, toUid);
		}
		return null;
	}
	/**用户的发言
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/myReplyes")
	public List<AskquestionExtend> myReplyes(HttpServletRequest request) throws IOException {
		JSONObject json = JsonRead.receivePost(request);
		int id = json.getInt("userid");
		List<AskquestionExtend> asks = userServiceImpl.selectMyReplyes(id);
		return asks;
	}
	/**用户的论点
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/userThesis")
	public List<Thesis> userThesis(HttpServletRequest request) throws IOException {
		JSONObject json = JsonRead.receivePost(request);
		int id = json.getInt("userid");
		List<Thesis> thesises = userServiceImpl.selectMyThesis(id);
		return thesises;
	}
	/**
	 * 用户的辩题
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/userDebateTopic")
	public List<Debatetopic> userDebateTopic(@RequestBody User user) throws IOException {
		/*JSONObject json = JsonRead.receivePost(request);
		int id = json.getInt("userid");*/
		/*if (map.containsKey("userid")) {
			Integer id = Integer.parseInt(map.get("userid"));
			List<Debatetopic> debates = userServiceImpl.selectMyDebate(id);
			return debates;
		}*/
		if (user.getId() > 0) {
			List<Debatetopic> debates = userServiceImpl.selectMyDebate(user.getId());
			return debates;
		}
		return null;
	}
}
