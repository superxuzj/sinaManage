package com.boliangshenghe.sina.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.boliangshenghe.sina.entity.WeiboSource;

public class WeiboJsonUtil {

	public static List<WeiboSource> reader() {
		String filePath = "d:\\132911772.log";
		List<WeiboSource> weiboSourceList = new ArrayList<WeiboSource>();
		try {
			File file = new File(filePath);
			if (file.isFile() && file.exists()) {
				InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
				BufferedReader br = new BufferedReader(isr);
				String lineTxt = null;
				while ((lineTxt = br.readLine()) != null) {
					WeiboSource weiboSource = JSONObject.parseObject(lineTxt, WeiboSource.class);
					weiboSource.setContent(filterEmoji(weiboSource.getContent()));
					if (weiboSource != null && StringUtils.isNotBlank(weiboSource.getMid()))
						weiboSourceList.add(weiboSource);
					// System.out.println(weiboSource.getContent());
				}
				br.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find the file specified!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error reading file content!");
			e.printStackTrace();
		}
		return weiboSourceList;
	}

	/**
  * 将emoji表情替换成空串
  *  
  * @param source
  * @return 过滤后的字符串
  */
   public static String filterEmoji(String source) {
	   if (source != null && source.length() > 0) {
		   return source.replaceAll("[\ud800\udc00-\udbff\udfff\ud800-\udfff]", "");
	   } else {
		   return source;
	   }
   }

   public static String reader1() {
		String filePath = "d:\\132911772.log";
		List<WeiboSource> weiboSourceList = new ArrayList<WeiboSource>();
		try {
			File file = new File(filePath);
			if (file.isFile() && file.exists()) {
				InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
				BufferedReader br = new BufferedReader(isr);
				String lineTxt = null;
				while ((lineTxt = br.readLine()) != null) {
					System.out.println(lineTxt);
					WeiboSource weiboSource = JSONObject.parseObject(lineTxt, WeiboSource.class);
					weiboSource.setContent(filterEmoji(weiboSource.getContent()));
					System.out.println(weiboSource.getBlogUrl());
					// System.out.println(weiboSource.getContent());
				}
				br.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find the file specified!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error reading file content!");
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		String filePath = "d:\\132911772.log";
		String txtStr = reader1();
		// System.out.println(txtStr);

		/*
		 * if (txtStr != null) { process(txtStr); } else {
		 * System.out.println("Read the content is empty!"); }
		 */
		System.out.println("--- end ---");
	}
}
