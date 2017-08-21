package com.pjmike.lundao.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pjmike.lundao.po.Thesis;
import com.pjmike.lundao.service.Impl.ThesisServiceImpl;
import com.pjmike.lundao.service.util.JsonRead;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/user")
public class MyCollectionController {
	@Autowired
	ThesisServiceImpl thesisServiceImpl;
	@RequestMapping(value="/collectThesis",method=RequestMethod.GET)
	public void  collectThesis(HttpServletRequest request) throws IOException {
		
		JSONObject json = JsonRead.receivePost(request);
		int userid = json.getInt("id");
		int thesisid = json.getInt("thesisId");
		thesisServiceImpl.collectionThesis(thesisid, userid);
	}
	@RequestMapping(value="getCollectThesis",method=RequestMethod.GET)
	public List<Thesis> getCollectThesis(HttpServletRequest request) {
		
		String ids = request.getParameter("id");
		int id = Integer.parseInt(ids);
		return thesisServiceImpl.selectAllCollectionThesis(id);
	}
}
