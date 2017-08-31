package com.pjmike.lundao.po;

import java.util.List;

public class Debatetopicextend extends Debatetopic{
	private List<Thesis> thesisList;
	private String title1;
	public String getTitle1() {
		return title1;
	}

	public void setTitle1(String title1) {
		this.title1 = title1;
	}

	public List<Thesis> getThesisList() {
		return thesisList;
	}

	public void setThesisList(List<Thesis> thesisList) {
		this.thesisList = thesisList;
	}
}
