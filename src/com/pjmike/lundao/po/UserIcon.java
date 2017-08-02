package com.pjmike.lundao.po;

public class UserIcon {
	private int IconId;
	private String Icon;
	private String backIcon;
	public int getIconId() {
		return IconId;
	}
	public void setIconId(int iconId) {
		IconId = iconId;
	}
	public String getIcon() {
		return Icon;
	}
	public void setIcon(String icon) {
		Icon = icon;
	}
	public String getBackIcon() {
		return backIcon;
	}
	public void setBackIcon(String backIcon) {
		this.backIcon = backIcon;
	}
	@Override
	public String toString() {
		return "UserIcon [IconId=" + IconId + ", Icon=" + Icon + ", backIcon=" + backIcon + ", getIconId()="
				+ getIconId() + ", getIcon()=" + getIcon() + ", getBackIcon()=" + getBackIcon() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
