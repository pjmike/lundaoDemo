package com.pjmike.lundao.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pjmike.lundao.po.Thesis;
import com.pjmike.lundao.po.ThesisCollection;
import com.pjmike.lundao.service.Impl.ThesisServiceImpl;
import com.pjmike.lundao.service.util.JsonRead;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/user")

public class MyCollectionController {
	@Autowired
	ThesisServiceImpl thesisServiceImpl;
	/**
	 * 收藏论点
	 * @param request
	 * @throws IOException
	 */
	@RequestMapping(value="/collectThesis",method=RequestMethod.GET)
	public void  collectThesis(HttpServletRequest request) throws IOException {
		
		JSONObject json = JsonRead.receivePost(request);
		int userid = json.getInt("id");
		int thesisid = json.getInt("thesisId");
		thesisServiceImpl.collectionThesis(thesisid, userid);
	}
	/**
	 * 打开收藏页面
	 * @param request
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping(value="/getCollectThesis",method=RequestMethod.GET)
	@ResponseBody
	public List<ThesisCollection> getCollectThesis(HttpServletRequest request) throws IOException {
		
		JSONObject json = JsonRead.receivePost(request);
		int id = json.getInt("id");
		return thesisServiceImpl.selectAllCollectionThesis(id);
	}
	/**
	 * 点击收藏页面的叉叉
	 * @throws IOException 
	 */
	@RequestMapping(value="/deleteCollectThesis",method=RequestMethod.GET)
	public void deleteCollectThesis(HttpServletRequest request) throws IOException {
		JSONObject json = JsonRead.receivePost(request);
		int id = json.getInt("id");
		thesisServiceImpl.updateColleThesisIsshow(id);
	}
}
