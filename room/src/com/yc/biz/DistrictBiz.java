package com.yc.biz;

import java.util.List;

import com.yc.bean.District;
import com.yc.bean.Street;

public interface DistrictBiz {
	//查询所有的区
	public List<District> getDistrictList();
	//根据区id查所有的街道
	public List<Street> getStreetByDistrictId();
	
	

}
