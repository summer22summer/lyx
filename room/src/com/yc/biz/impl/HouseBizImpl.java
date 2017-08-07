package com.yc.biz.impl;

import java.util.List;
import java.util.Map;

import com.yc.bean.House;
import com.yc.biz.HouseBiz;
import com.yc.dao.BaseDao;
import com.yc.web.model.JsonModel;

@Service
public class HouseBizImpl implements HouseBiz{
	@Resource(name="baseDao")
	private BaseDao baseDao; 
	@Override
	public House getHouseBean(House hb) {
		this.baseDao.find(hb,"findHouseCondition");
	}

	@Override
	public boolean addHouse(House house) {
		try{
			bd.save(house,"saveHouse")
			return true;
		}catch(RuntimeException e){
			e.printStackTrace();
			throw new RuntimeException("添加房源失败", e);
		}
		
	}

	@Override
	public boolean updateHouse(House house) {
		try{
			bd.update(house,"updateHouse")
			return true;
		}catch(RuntimeException e){
			e.printStackTrace();
			throw new RuntimeException("更新房源失败", e);
		}
		
	}

	@Override
	public boolean delHouse(int id) {
		
			baseDao.del(House.class, "","delSingleHouse");
			return true;
		
	}

	@Override
	public boolean delHouse(List<Integer> ids) {
		baseDao.del(House, sqlId);
	}

	@Override
	public JsonModel<House> searHouse(Map<String, Object> map) {
		List<House> list=baseDao.findList(House.class,map,"findHouseCondition",0,0);
		int total=baseDao.getCount(House.class,map,"findHouseConditionCount");
		JsonModel<House>jsonModel=new JsonModel=new JsonModel<House>();
		jsonModel.setRows(list);
		jsonModel.setTotal(total);
		jsonModel.setPages(Integer.parseInt(map.get("pages").toString()));
		jsonModel.setPageSize(Integer.parseInt(map.get("pageSize").toString()));
		
		
		return null;
	}
	
	public HouseBean searchHouse(Map<String,Object>map){
		HouseBean hb=new HouseBean();
		int currPage=(int)map.get("currPage");
		int sizePage=(int)map.get("sizePage");
		int count=bd.getCount(House.class,map,"findHouseConditionCount");
		int total=count%sizePage==0? count /sizePage:count/sizePage+1;
		hb.setTotal(total);
		int offset=(currPage-1)*sizePage;
		List<House> hs=bd.findList(House.class,map,"findHouseCondition",offset,sizePage);
		hb.setHouse(hs);
		hb.setCurrPage(currPage);
		return hb;
		
	}
	
	

}
