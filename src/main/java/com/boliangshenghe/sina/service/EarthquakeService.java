package com.boliangshenghe.sina.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boliangshenghe.sina.entity.Earthquake;
import com.boliangshenghe.sina.repository.EarthquakeMapper;

@Service
public class EarthquakeService {

	@Autowired
	EarthquakeMapper earthquakeMapper;
	
	public int insertSelective(Earthquake earthquake) {
        return earthquakeMapper.insertSelective(earthquake);
    }
	
    public Earthquake selectByPrimaryKey(Integer id){
    	return earthquakeMapper.selectByPrimaryKey(id);
    }
    
    public  int updateByPrimaryKeySelective(Earthquake record){
    	return earthquakeMapper.updateByPrimaryKeySelective(record);
    }
    
    /*public List<Earthquake> selectEarthquakeList(Earthquake record){
    	return earthquakeMapper.selectEarthquakeList(record);
    }
    
    public PageBean<Earthquake> getEarthquakeByPage(Earthquake record,Integer pageNo) {
        PageHelper.startPage(pageNo,CommonUtils.PAGESIZE);
        List<Earthquake> list = this.earthquakeMapper.selectEarthquakeList(record);
        return new PageBean<Earthquake>(list);
    }*/
    
    
   
}
