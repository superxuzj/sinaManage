package com.boliangshenghe.sina.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boliangshenghe.sina.util.HttpClientUtils;


@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String all(){
		return "redirect:/index";
	}
	
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("name", "superu");
		String urlbusi = "https://api.weibo.com/oauth2/authorize";
		Map<String, String> param = new HashMap<String,String>();
		param.put("client_id", "796906391");
		param.put("display", "default");
		param.put("redirect_uri", "https://api.weibo.com/oauth2/default.html");
		String str = HttpClientUtils.doPost(urlbusi, param);
		System.out.println(str);
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
