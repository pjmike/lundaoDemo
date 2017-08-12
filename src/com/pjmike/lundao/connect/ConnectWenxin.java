package com.pjmike.lundao.connect;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;


/**
 * @author pjmike
 * 实现与微信服务器上并获取数据
 */
public class ConnectWenxin {
	public static String GET(String url){
        String result = "";
        BufferedReader in = null;
        InputStream is = null;
        InputStreamReader isr = null;
        try {
            URL realUrl = new URL(url);
            URLConnection conn = realUrl.openConnection();
            conn.connect();
            Map<String, List<String>> map = conn.getHeaderFields();
            is = conn.getInputStream();
            isr = new InputStreamReader(is);
            in = new BufferedReader(isr);
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            //异常记录
        }finally{
            try {
                if(in!=null){
                    in.close();
                }
                if(is!=null){
                    is.close();
                }
                if(isr!=null){
                    isr.close();
                }
            } catch (Exception e2) {
                //异常记录
            }
        }
        return result;
    }


}
