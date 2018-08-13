package com.boliangshenghe.sina.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import weibo4j.Oauth;
import weibo4j.http.AccessToken;
import weibo4j.model.WeiboException;


@Controller
@RequestMapping("/wbapi")
public class WeiboAPIController {
	
	/*@RequestMapping("/")
	public String all(){
		return "redirect:/index";
	}*/
	
	@RequestMapping("/user")
	public String user(Model model,HttpServletRequest request,
			HttpServletResponse response){
		Oauth oauth = new Oauth();
		AccessToken at = null;
		try {
			at = oauth.getAccessTokenByCode("");
		} catch (WeiboException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(at.getAccessToken());
		return "index";
	}
	
/*	@RequestMapping("/page")
	public String hello(User user,Model model,@RequestParam(defaultValue = "1", value = "pageNo") Integer pageNo){
		user.setType("1");
		PageBean<User> page =  userService.getUserByPage(user,pageNo,10);
		System.out.println(page.getTotal());
		model.addAttribute("page", page);
		model.addAttribute("hello", "sdfds");
		System.out.println("1");
		return "hello";
	}*/
}
