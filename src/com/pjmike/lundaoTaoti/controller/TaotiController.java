package com.pjmike.lundaoTaoti.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pjmike.lundao.service.util.JsonRead;
import com.pjmike.lundaoTaoti.po.Taoti;
import com.pjmike.lundaoTaoti.service.Impl.TaotiServiceImpl;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/taoti")
public class TaotiController {
	@Autowired
	TaotiServiceImpl taotiServiceImpl;
	/**
	 * 查询出一个淘题信息
	 * @param id
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/OneThesis")
	@ResponseBody
	public Taoti returnOneThesis(HttpServletRequest request) throws IOException {
		JSONObject json = JsonRead.receivePost(request);
		int taotId = json.getInt("taotiId");
		int userid = json.getInt("userid");
		return taotiServiceImpl.selectOne(taotId,userid);
		
	}
	/**
	 * 查询出所有淘题信息
	 * @param request
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/allTaoti")
	@ResponseBody
	public List<Taoti> allTaoti(HttpServletRequest request) throws IOException {
		JSONObject jsonObject = JsonRead.receivePost(request);
		int id = jsonObject.getInt("userid");
		
		return taotiServiceImpl.selectAllTaoti(id);
		
	}
	/**
	 * 增加或减少淘题的期望值
	 * @param request
	 * @throws IOException 
	 */
	@RequestMapping("/upAndDownCommentNum")
	public ModelAndView upAndDownCommentNum(HttpServletRequest request) throws IOException {
		JSONObject jb = JsonRead.receivePost(request);
		int userid = jb.getInt("userid");
		int taoTiId = jb.getInt("taotiId");
		boolean commented = jb.getBoolean("commented");
		Taoti taoti = new Taoti();
		taoti.setCommented(commented);
		taoti.setTaotiId(taoTiId);
		taoti.setUserid(userid);
		Integer count = taotiServiceImpl.selectTaoticommented(taoti);
		if (count == 1) {
			taotiServiceImpl.updateCommented(taoti);
		} else {
			taotiServiceImpl.insertCommented(taoti);
		}
		taotiServiceImpl.upAndDownCommentNum(taoti);
		return null;
	}
	
	/**
	 * 发起一个辩题
	 * @param request
	 * @throws IOException 
	 */
	@RequestMapping("/insertTheis")
	public ModelAndView insertTheis(HttpServletRequest request) throws IOException {
		JSONObject jb = JsonRead.receivePost(request);
		int userid = jb.getInt("userid");
		String nickname = jb.getString("nickname");
		String Icon = jb.getString("Icon");
		String title = jb.getString("describtion");
		String content = jb.getString("content");
		String backgroud = jb.getString("backgroud");
		String lebels = jb.getString("labels");
		System.out.println(lebels);
		System.out.println(content);
		if (title !=null && title.length() >0 && content !=null &&content.length()>0&&
				backgroud !=null&&backgroud.length()>0 && lebels != null&&lebels.length()>0) {
			
			Taoti taoti = new Taoti();
			taoti.setBackground(backgroud);
			taoti.setContent(content);
			taoti.setTitle(title);
			taoti.setLabels(lebels);
			taoti.setNickname(nickname);
			taoti.setIcon(Icon);
			taoti.setUserid(userid);
			taotiServiceImpl.insertTheis(taoti);
		}
		
		return null;
	}
}
