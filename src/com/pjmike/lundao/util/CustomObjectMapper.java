package com.pjmike.lundao.util;
import java.io.IOException;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
  
import org.codehaus.jackson.JsonGenerator;  
import org.codehaus.jackson.JsonProcessingException;  
import org.codehaus.jackson.map.JsonSerializer;  
import org.codehaus.jackson.map.ObjectMapper;  
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.module.SimpleModule;
import org.codehaus.jackson.map.ser.CustomSerializerFactory;  
  
/** 
 * @description 解决Date类型返回json格式为自定义格式 
 * @author aokunsang 
 * @date 2013-5-28 
 */  
public class CustomObjectMapper extends ObjectMapper {  
  
    public CustomObjectMapper(){  
    	SimpleModule sm = new SimpleModule(null, null);
    	sm.addSerializer(Date.class, new JsonSerializer<Date>() {
    	@Override
    	public void serialize(Date value, JsonGenerator jsonGenerator, SerializerProvider provider)
    	throws IOException {
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	jsonGenerator.writeString(sdf.format(value));
    	}
    	});
    	this.registerModule(sm);
    }  
}  