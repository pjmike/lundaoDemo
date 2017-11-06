package com.pjmike.lundao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pjmike.lundao.po.DebateTopicCustom;
import com.pjmike.lundao.po.Thesis;
import com.pjmike.lundao.po.ThesisCustom;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.po.UserSelected;
import com.pjmike.lundao.service.Impl.DebateServiceImpl;
import com.pjmike.lundao.service.Impl.ThesisServiceImpl;
import com.pjmike.lundao.service.Impl.UserServiceImpl;
import com.pjmike.lundaoTaoti.po.Taoti;
import com.pjmike.lundaoTaoti.service.Impl.TaotiServiceImpl;

@RestController
@RequestMapping("/select")
public class SelectController {
	@Autowired
	UserServiceImpl userServiceImpl;
	@Autowired
	DebateServiceImpl debateServiceImpl;
	@Autowired
	ThesisServiceImpl thesisServiceImpl;
	@Autowired
	TaotiServiceImpl taotiServiceImpl;
	/**
	 * 模糊搜索用户信息
	 * @param name
	 * @return
	 */
	@RequestMapping("/user/{string}")
	public List<UserSelected> selectUser(@PathVariable("string")String name) {
		List<UserSelected> userSelected = userServiceImpl.selectUsersByString(name);
		for (UserSelected u : userSelected) {
			Integer count = userServiceImpl.myFans(u.getId());
			u.setAttention(count);
		}
		return userSelected;
	}
	/**
	 * 搜索辩题信息
	 * @param name
	 * @return
	 */
	@RequestMapping("/debateTopic/{string}")
	public List<DebateTopicCustom> selectDebateTopic(@PathVariable("string")String name) {
		List<DebateTopicCustom> debateTopicCustoms = debateServiceImpl.selectDebateTopic(name);
		for (DebateTopicCustom d : debateTopicCustoms) {
			if (d.getContent().length()>40) {
				d.setTitle1(d.getContent().substring(0, 40));
			} else { 
				d.setTitle1(d.getContent());
			}
		}
        return debateTopicCustoms;
	}
	/**
	 * 搜索论点
	 * @param name
	 * @return
	 */
	@RequestMapping("/thesis/{string}")
	public List<ThesisCustom> selectThesis(@PathVariable("string")String name) {
		List<ThesisCustom> thesisCustoms = thesisServiceImpl.selectThesisCustom(name);
		for (ThesisCustom t : thesisCustoms) {
			if (t.getContent().length()>40) {
					t.setTitle1(t.getContent().substring(0, 40));
			} else {
				t.setTitle1(t.getContent());
			}
		}
		return thesisCustoms;
	}
	@RequestMapping("/taoti/{string")
	public List<Taoti> selectTaoti(@PathVariable("string")String name) {
		List<Taoti> taotis = taotiServiceImpl.selectTaoti(name);
		return taotis;
	}
}
