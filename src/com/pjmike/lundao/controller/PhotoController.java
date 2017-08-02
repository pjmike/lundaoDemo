package com.pjmike.lundao.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.pjmike.lundao.po.UserIcon;
import com.pjmike.lundao.service.Impl.UserPicServiceImpl;

@Controller
public class PhotoController {
	
	@Autowired
	private UserPicServiceImpl userPicServiceImpl;
	//上传用户头像
	/*@RequestMapping("/IconSubmit")
	public @ResponseBody String IconSubmit(Model model,UserIcon userIcon,MultipartFile user_pic) throws IllegalStateException, IOException {
		//原始名称
		String originalFilename = user_pic.getOriginalFilename();
		String newFileName = null;
		if(user_pic != null && originalFilename !=null && originalFilename.length()>0) {
			//存储图片的物理路径-->服务器上的存储路径？？？
			String pic_path = "D:\\photo\\Icon";
		
			//新的图片名称
			 newFileName = UUID.randomUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
			File newFile = new File(pic_path+newFileName);
			//将内存中的数据写入到磁盘
			user_pic.transferTo(newFile);
			//将新图片写入userIcon中去
			userIcon.setIcon(newFileName);
		}
		userPicServiceImpl.addUserIcon(userIcon);
		return "/photo/"+newFileName;
	}
	
	
	//上传用户名片背景
	@RequestMapping("/backIcon")
	public @ResponseBody UserIcon backIcon(Model model,UserIcon userIcon,MultipartFile user_pic) throws IllegalStateException, IOException {
		//原始名称
		String originalFilename = user_pic.getOriginalFilename();
		if(user_pic != null && originalFilename !=null && originalFilename.length()>0) {
			//存储图片的物理路径
			String pic_path = "D:\\photo\\backIcon";
			
			//新的图片名称
			String newFileName = UUID.randomUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
			File newFile = new File(pic_path+newFileName);
			//将内存中的数据写入到磁盘
			user_pic.transferTo(newFile);
			//将新图片写入userIcon中去
			userIcon.setIcon(newFileName);
		}
		userPicServiceImpl.addUserBackIcon(userIcon);
		return userIcon;
	}*/
	//上传用户头像2
		@RequestMapping("/IconSubmit2")
		public @ResponseBody String IconSubmit2(HttpServletRequest request,UserIcon userIcon,MultipartFile user_pic) throws IllegalStateException, IOException {
			//原始名称
			//获得物理路径webapp所在路径  
	        String pathRoot = request.getSession().getServletContext().getRealPath("");  
	        String path="";  
	        if(user_pic!=null){  
	            //生成uuid作为文件名称  
	            String uuid = UUID.randomUUID().toString().replaceAll("-","");  
	            //获得文件类型（可以判断如果不是图片，禁止上传）  
	            String contentType=user_pic.getContentType();  
	            //获得文件后缀名称  
	            String imageName=contentType.substring(contentType.indexOf("/")+1);  
	            path="/static/images/Icon"+uuid+"."+imageName;  
	            user_pic.transferTo(new File(pathRoot+path));  
	            userIcon.setIcon(pathRoot+path);
	        } 
	        if(userIcon.getIconId() == 0) {
	        	
	        	userPicServiceImpl.addUserIcon(userIcon);
	        } else {
	        	userPicServiceImpl.updateIcon(userIcon);
	        }
			request.setAttribute("imagesPath", path); 
			return path;
		}
		//上传用户背景2
				@RequestMapping("/backIcon2")
				public @ResponseBody String backIcon2(HttpServletRequest request,UserIcon userIcon,MultipartFile user_pic) throws IllegalStateException, IOException {
					//原始名称
					//获得物理路径webapp所在路径  
			        String pathRoot = request.getSession().getServletContext().getRealPath("");  
			        String path="";  
			        if(user_pic!=null){  
			            //生成uuid作为文件名称  
			            String uuid = UUID.randomUUID().toString().replaceAll("-","");  
			            //获得文件类型（可以判断如果不是图片，禁止上传）  
			            String contentType=user_pic.getContentType();  
			            //获得文件后缀名称  
			            String imageName=contentType.substring(contentType.indexOf("/")+1);  
			            path="/static/images/backIcon"+uuid+"."+imageName;  
			            user_pic.transferTo(new File(pathRoot+path));  
			            userIcon.setBackIcon(pathRoot+path);
			        } 
			        if(userIcon.getIconId() == 0) {
			        	
			        	userPicServiceImpl.addUserBackIcon(userIcon);
			        } else {
			        	userPicServiceImpl.updateBackIcon(userIcon);
			        }
					request.setAttribute("imagesPath", path); 
					return path;
				}
		
	//返回头像
	@RequestMapping("/Iconget")
	public void Iconget(HttpServletRequest request,HttpServletResponse response) {
		
	}
}
