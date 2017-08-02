package com.pjmike.lundao.controller;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller implements EnvironmentAware{
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("msg", "go go go");
		return "msg";
	}
	private Environment environment;
	@Override
	public void setEnvironment(Environment environment) {
		// TODO Auto-generated method stub
		this.environment = environment;
		
	}
	
}
