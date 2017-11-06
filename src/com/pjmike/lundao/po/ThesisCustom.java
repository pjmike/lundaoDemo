package com.pjmike.lundao.po;

/**
 * 搜索查询用户的信息
 * @author pjmike
 *
 */
public class ThesisCustom {
	private Integer thesisid;
	
	private Integer complete;
    private String title;
    private String content;
    private String title1;
    public String getTitle1() {
		return title1;
	}
	public void setTitle1(String title1) {
		this.title1 = title1;
	}
	private boolean isAttention;
	public Integer getThesisid() {
		return thesisid;
	}
	public void setThesisid(Integer thesisid) {
		this.thesisid = thesisid;
	}
	public Integer getComplete() {
		return complete;
	}
	public void setComplete(Integer complete) {
		this.complete = complete;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean isAttention() {
		return isAttention;
	}
	public void setAttention(boolean isAttention) {
		this.isAttention = isAttention;
	}
}
