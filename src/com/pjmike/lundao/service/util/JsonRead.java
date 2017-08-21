package com.pjmike.lundao.service.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

public class JsonRead {
	public static JSONObject receivePost(HttpServletRequest request) throws IOException {
		//读取请求内容
		BufferedReader br = new BufferedReader(new InputStreamReader((ServletInputStream)request.getInputStream()
												,"utf-8"));
		String line = null;
		StringBuffer sb = new StringBuffer();
		while((line = br.readLine()) != null) {
			sb.append(line);
		}
		//将json字符串转换为json对象
		JSONObject json = JSONObject.fromObject(sb.toString());
		return json;
		
	}
}
