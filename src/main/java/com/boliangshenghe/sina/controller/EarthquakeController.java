package com.boliangshenghe.sina.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boliangshenghe.sina.entity.Earthquake;
import com.boliangshenghe.sina.entity.WeiboSource;
import com.boliangshenghe.sina.service.EarthquakeService;
import com.boliangshenghe.sina.service.WeiboSourceService;
import com.boliangshenghe.sina.util.JxlUtil;
import com.boliangshenghe.sina.util.WeiboJsonUtil;

@Controller
@RequestMapping("/earthquake")
public class EarthquakeController {
	
	@Autowired
	private EarthquakeService earthquakeService;
	
	@Autowired
	private WeiboSourceService WeiboSourceService;
	
	@RequestMapping("")
	public String all(){
		System.out.println("all");
		return "redirect:/earthquake/index";
	}
	
	@RequestMapping("/index")
	public String index(Model model){
		List<Earthquake> earthquakeList = JxlUtil.getEarthquakeList();
		for (Earthquake earthquake : earthquakeList) {
			earthquakeService.insertSelective(earthquake);
		}
		return "index";
	}
	
	@RequestMapping("/weibodata")
	public String weibodata(Model model){
		List<WeiboSource> weiboSourceList = WeiboJsonUtil.reader();
		for (WeiboSource weiboSource : weiboSourceList) {
			WeiboSourceService.insertSelective(weiboSource);
		}
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
