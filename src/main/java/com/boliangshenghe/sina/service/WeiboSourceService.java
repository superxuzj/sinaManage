package com.boliangshenghe.sina.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boliangshenghe.sina.entity.WeiboSource;
import com.boliangshenghe.sina.repository.WeiboSourceMapper;

@Service
public class WeiboSourceService {

	@Autowired
	WeiboSourceMapper weiboSourceMapper;
	
	public int insertSelective(WeiboSource WeiboSource) {
        return weiboSourceMapper.insertSelective(WeiboSource);
    }
	
    public WeiboSource selectByPrimaryKey(Integer id){
    	return weiboSourceMapper.selectByPrimaryKey(id);
    }
    
    public  int updateByPrimaryKeySelective(WeiboSource record){
    	return weiboSourceMapper.updateByPrimaryKeySelective(record);
    }
    
    /*public List<WeiboSource> selectWeiboSourceList(WeiboSource record){
    	return WeiboSourceMapper.selectWeiboSourceList(record);
    }
    
    public PageBean<WeiboSource> getWeiboSourceByPage(WeiboSource record,Integer pageNo) {
        PageHelper.startPage(pageNo,CommonUtils.PAGESIZE);
        List<WeiboSource> list = this.WeiboSourceMapper.selectWeiboSourceList(record);
        return new PageBean<WeiboSource>(list);
    }*/
    
    
   
}
