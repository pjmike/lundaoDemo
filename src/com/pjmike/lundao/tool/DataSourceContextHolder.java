package com.pjmike.lundao.tool;

public class DataSourceContextHolder {
	private static final ThreadLocal<String> dataSourceTypes = new ThreadLocal<String>();
	public static String get() {
		return dataSourceTypes.get();
	}
	  
	public static void set(String dataSourceType){
	        dataSourceTypes.set(dataSourceType);
	}
	    
	public static void reset(){
	        dataSourceTypes.set("Lundao");
	}
}
