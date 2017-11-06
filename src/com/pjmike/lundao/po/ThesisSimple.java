package com.pjmike.lundao.po;

import java.util.Date;

public class ThesisSimple {
	 private Integer thesisid;
	 private String tdescription;
	 private Integer tLike;
		private Integer tAttention;
		private Date tPublishtime;
		public Integer getThesisid() {
			return thesisid;
		}
		public void setThesisid(Integer thesisid) {
			this.thesisid = thesisid;
		}
		public String getTdescription() {
			return tdescription;
		}
		public void setTdescription(String tdescription) {
			this.tdescription = tdescription;
		}
		public Integer gettLike() {
			return tLike;
		}
		public void settLike(Integer tLike) {
			this.tLike = tLike;
		}
		public Integer gettAttention() {
			return tAttention;
		}
		public void settAttention(Integer tAttention) {
			this.tAttention = tAttention;
		}
		public Date gettPublishtime() {
			return tPublishtime;
		}
		public void settPublishtime(Date tPublishtime) {
			this.tPublishtime = tPublishtime;
		}
}
