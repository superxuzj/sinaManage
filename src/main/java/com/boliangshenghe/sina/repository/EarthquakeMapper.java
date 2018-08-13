package com.boliangshenghe.sina.repository;

import com.boliangshenghe.sina.entity.Earthquake;

public interface EarthquakeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Earthquake record);

    int insertSelective(Earthquake record);

    Earthquake selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Earthquake record);

    int updateByPrimaryKey(Earthquake record);
}