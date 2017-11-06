package com.pjmike.lundao.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;

public class SerializeUtil {
	public static String serialize(Object obj) {
		 String serStr = null;
	        try {
	            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();  
	            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);  
	            objectOutputStream.writeObject(obj);    
	            serStr = byteArrayOutputStream.toString("ISO-8859-1");  
	            serStr = java.net.URLEncoder.encode(serStr, "UTF-8");  
	              
	            objectOutputStream.close();  
	            byteArrayOutputStream.close();
	        } catch (UnsupportedEncodingException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        return serStr;
	}
	public static Object deserialize(String serStr) {
		Object newObj = null;
        try {
            String redStr = java.net.URLDecoder.decode(serStr, "UTF-8");  
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(redStr.getBytes("ISO-8859-1"));  
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);   
            newObj = objectInputStream.readObject();
            objectInputStream.close();  
            byteArrayInputStream.close();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return newObj;
	}
}
