package com.pjmike.lundao.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pjmike.lundao.po.PeriodCal;
import com.pjmike.lundao.po.PeriodicalAttention;
import com.pjmike.lundao.po.PeriodicalCustom;
import com.pjmike.lundao.service.Impl.PeriodServiceImpl;
import com.pjmike.lundao.service.util.JsonRead;

import net.sf.json.JSONObject;

/**
 * 期刊控制类
 * @author pjmike
 *
 */
@RestController
@RequestMapping("/period")
public class PeriodicalController {
	/**
	 * 自动注入periodServiceImpl
	 */
	@Autowired
	PeriodServiceImpl periodServiceImpl;
	@Autowired
	RedisTemplate<Object, Object> redisTemplate;
	/**
	 * 每周集锦
	 * @return
	 */
	@RequestMapping("/collection")
	public List<PeriodCal>  Periodicalcollection() {
		List<PeriodCal> periodCals = periodServiceImpl.selectPeriodical();
		return periodCals;
	}
	/**
	 * 期刊详情页
	 * 同时增加阅读数
	 * @param id
	 * @return
	 */
	@RequestMapping("/mainPage/{id}")
	public PeriodicalCustom PeriodicalMainPage(@PathVariable("id")int id) {
		PeriodicalCustom periodicalCustoms = periodServiceImpl.selectPeriodiCalAndCatalog(id);
		String key = "period:readCount:"+id;
		//使用redis自增阅读数
		redisTemplate.opsForValue().increment(key, 1);
		int readCount =(int)redisTemplate.opsForValue().get(key);
		System.out.println(readCount);
		if (periodicalCustoms!=null) {
			periodicalCustoms.setPeriodicalRead(readCount);
		}
		return periodicalCustoms;
	}
	/**
	 * 对期刊收藏
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/Collection")
	public ModelAndView PeriodCollection(HttpServletRequest request) throws IOException {
		JSONObject json = JsonRead.receivePost(request);
		int userid = (int) json.get("userid");
		int periodId = (int) json.get("periodId");
		boolean isAttention = (boolean) json.get("isAttention");
		PeriodicalAttention periodicalAttention = new PeriodicalAttention();
		periodicalAttention.setUserid(userid);
		periodicalAttention.setPeriodicalId(periodId);
		periodicalAttention.setIs_Attention(isAttention);
		return null;
	}
	@RequestMapping("/addReadCount")
	public ModelAndView PeriodaddReadCount() {
		
		return null;
	}
 }
