package com.pjmike.lundao.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pjmike.lundao.po.User;
import com.pjmike.lundao.po.UserCustom;
import com.pjmike.lundao.po.UserFans;
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
@RestController
@RequestMapping("/user")
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
		int userid = (int) json.get("userid");
		String userName = (String) json.get("nickname");
		String gender = (String) json.get("gender");
		String emailNumber = (String) json.get("emailNumber");
		String locations = (String) json.get("locations");
		String educations = (String) json.get("educations");
		String userSignature = (String) json.get("userSignature");
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
	@RequestMapping("/getUser/{fromUid}/{toUid}")
	public UserCustom getUser(HttpServletRequest request,@PathVariable("fromUid")int fromUid,@PathVariable("toUid")int toUid) throws IOException {
	/*	String useidd = request.getParameter("userid");
		String touid = request.getParameter(")
	/*	JSONObject json = JsonRead.receivePost(request);
		int id = json.getInt("userid");*/
		UserCustom user = userServiceImpl.findUser(fromUid,toUid);
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
		int id = (int) json.get("userid");
		int toUid = (int) json.get("otherid");
		boolean status = (boolean) json.get("isAttention");
		Integer count = userServiceImpl.AttentionedPeople(id, toUid);
		if (count > 0) {
			AttentionOther atttentionOther = new AttentionOther();
			atttentionOther.setFrom_uid(id);
			atttentionOther.setTo_uid(toUid);
			atttentionOther.setStatus(status);
//			userServiceImpl.updateAttentionPeopleStaus(atttentionOther);
		} else {
			userServiceImpl.AttentionOther(id, toUid);
//			notifyServiceImpl.subscribe(id, toUid, TargetType.USER, Action.ATTENTION);
//			notifyServiceImpl.createInformation(toUid, TargetType.USER, Action.ATTENTION, id, toUid);
		}
		return null;
	}
	/**用户的发言
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/myReplyes/{userid}")
	public List<AskquestionExtend> myReplyes(@PathVariable("userid")int userid,HttpServletRequest request) throws IOException {
		/*JSONObject json = JsonRead.receivePost(request);
		int id = (int) json.get("userid");*/
		List<AskquestionExtend> asks = userServiceImpl.selectMyReplyes(userid);
		return asks;
	}
	/**用户的论点
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/userThesis/{userid}")
	public List<Thesis> userThesis(@PathVariable("userid")int userid,HttpServletRequest request) throws IOException {
		/*JSONObject json = JsonRead.receivePost(request);
		int id = json.getInt("userid");*/
		List<Thesis> thesises = userServiceImpl.selectMyThesis(userid);
		return thesises;
	}
	/**
	 * 用户的辩题
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/userDebateTopic/{userid}")
	public List<Debatetopic> userDebateTopic(@PathVariable("userid")int userid) throws IOException {
		/*JSONObject json = JsonRead.receivePost(request);
		int id = json.getInt("userid");*/
		/*if (map.containsKey("userid")) {
			Integer id = Integer.parseInt(map.get("userid"));
			List<Debatetopic> debates = userServiceImpl.selectMyDebate(id);
			return debates;
		}*/
		if (userid> 0) {
			List<Debatetopic> debates = userServiceImpl.selectMyDebate(userid);
			return debates;
		}
		return null;
	}
	/**
	 * 我的粉丝信息
	 * @param user
	 * @return
	 */
	@RequestMapping("/myFans/{userid}")
	public List<UserFans> myFans(@PathVariable("userid")int userid) {
		List<UserFans> myfans = userServiceImpl.findmyFansInformation(userid);
		return myfans;
	}
}
