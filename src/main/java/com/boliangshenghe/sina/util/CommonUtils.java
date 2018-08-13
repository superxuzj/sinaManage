package com.boliangshenghe.sina.util;

import javax.servlet.http.HttpServletResponse;

/**
 * 静态常量工具类
 * @author xuzj
 *
 */
public class CommonUtils {

	//高德 key liang
	public static final String GAODEKEY = "9380c464b9a4a9ecc686cd57ff994f0c";
	
	public static final String DEFAUTPWD = "qwe123!@#";//默认密码
	
	public static final Integer PAGESIZE = 10;//分页 每页条数
	
	public static final String REQUEST_KEY_REQUEST = "request";// 当前请求
	
	public static final String HEAD ="Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36";
	
	public static final Integer TIMEOUT = 5000;
	
	public static final String SUCONTENT = "[]";
	
	public static final String SUBTEXT = "现场工作队由0家单位组成，共计0人";
	public static final String TEXT = "无";
	public static final String FLIGHTS = "[[{ name: '北京', value: 100 }, { name: '北京' }]]";
	
	public static final String USERID = "sessionuserid";
	public static final String USERNAME = "sessionusername";
	public static final String REALNAME = "sessionrealname";
	public static final String ROLEID = "sessionroleid";
	public static final String CID = "sessioncid";
	public static final String COMPANY = "sessioncompany";
	public static final String ISLOGIN = "islogin";
	
	
	private static final String CACHE_CONTROL = "Cache-Control";
	private static final String PRAGMA = "Pragma";
	private static final String HTTP_NO_CACHE = "no-store,no-cache,must-revalidate";
	private static final String IE_HTTP_NO_CACHE = "post-check=0, pre-check=0";
	private static final String STANDARD_HTTP_NO_CACHE = "no-cache";
	 /**no-cache*/
    public static final void addNoCacheHeader(final HttpServletResponse response){
		response.setHeader(CACHE_CONTROL, HTTP_NO_CACHE); 
		response.addHeader(CACHE_CONTROL, IE_HTTP_NO_CACHE); 
		response.setHeader(PRAGMA, STANDARD_HTTP_NO_CACHE); 
    }

	public static final Integer HTTP_OK = 200;

	public static final String STATIC_URI = "/outteamstatic";
	
	public static final String HUABEI = "华北";
    
}
