package com.xue.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginSecurityController {
	
	@RequestMapping("/")
	public String index(){
		
		return "home";
	}
	
	@RequestMapping("/login")
	public String login(){
		
		return "login";
	}
	
	/**
	 * @PreAuthorize作用:判断用户是否有指定权限，没有就不能访问
	 */
	
	
	@RequestMapping("/admin")
	@ResponseBody
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String admin(){
		
		return "此权限为admin所有！";
	}
	
	@RequestMapping("/user")
	@ResponseBody
	@PreAuthorize("hasRole('ROLE_USER')")
	public String user(){
		
		return "此权限为user所有！";
	}


}
