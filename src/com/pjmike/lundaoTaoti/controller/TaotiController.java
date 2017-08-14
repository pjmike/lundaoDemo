package com.pjmike.lundaoTaoti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pjmike.lundaoTaoti.po.Taoti;
import com.pjmike.lundaoTaoti.service.Impl.TaotiServiceImpl;

@Controller
public class TaotiController {
	@Autowired
	TaotiServiceImpl taotiServiceImpl;
	@RequestMapping("returnOneThesis")
	public Taoti returnOneThesis(int id) {
		return taotiServiceImpl.selectOne(id);
	}
}
