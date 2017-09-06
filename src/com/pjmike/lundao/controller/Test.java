package com.pjmike.lundao.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Test {
	@RequestMapping("/test")
	public ModelAndView test(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		System.out.println("打印");
		String path = "/WEB-INF/php/getOpenId(1).php";
		 request.getRequestDispatcher(path).forward(request, response); 
		return null;
		
	}
}
