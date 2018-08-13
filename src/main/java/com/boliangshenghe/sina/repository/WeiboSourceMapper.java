package com.boliangshenghe.sina.repository;

import com.boliangshenghe.sina.entity.WeiboSource;

public interface WeiboSourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WeiboSource record);

    int insertSelective(WeiboSource record);

    WeiboSource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WeiboSource record);

    int updateByPrimaryKey(WeiboSource record);
}