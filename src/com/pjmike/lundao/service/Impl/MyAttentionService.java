package com.pjmike.lundao.service.Impl;

import java.util.List;

import com.pjmike.lundao.po.Askquestion;
import com.pjmike.lundao.po.Debatetopic;
import com.pjmike.lundao.po.Thesis;

public interface MyAttentionService {
	
	
	
	
	 /**
	  * 返回用户所关注的提问及异议
	  * @param id
	  * @return
	  */
	 List<Askquestion> selecrAllAttentionAskqustion(int id);
	 /**返回用户关注的辩题
	     * @param id
	     * @return
	     */
	 List<Debatetopic> selectAlldebateAttentioned(int id);
	 
	 /**返回用户关注的论点
	     * @param id
	     * @return
	     */
	    List<Thesis> selectAllThesisAttentioned(int id);
}
