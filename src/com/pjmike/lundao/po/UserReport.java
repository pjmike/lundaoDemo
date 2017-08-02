package com.pjmike.lundao.po;

public class UserReport {
	private int reportCount;
	private String reportReasons;
	public int getReportCount() {
		return reportCount;
	}
	public void setReportCount(int reportCount) {
		this.reportCount = reportCount;
	}
	public String getReportReasons() {
		return reportReasons;
	}
	public void setReportReasons(String reportReasons) {
		this.reportReasons = reportReasons;
	}
	@Override
	public String toString() {
		return "UserReport [reportCount=" + reportCount + ", reportReasons=" + reportReasons + "]";
	}
	
}
