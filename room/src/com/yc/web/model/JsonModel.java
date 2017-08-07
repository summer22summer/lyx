package com.yc.web.model;

import java.io.Serializable;
import java.util.List;

import com.yc.bean.House;

public class JsonModel<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8339928920251792494L;
	
	private int code;
	private String msg;
	private Object obj;
	
	private Integer total;//总记录数
	private Integer pages;//当前为第几页
	private Integer pageSize;//每页xx条
	private List<T> rows ;//纪录集合

		public JsonModel(int code,String msg,Object obj){
			super();
			this.code=code;
			this.msg=msg;
			this.obj=obj;
		}
		
		public JsonModel(){
			super();
			
		}
		
		public int getCode(){
			return code;
		}
		
		public void setCode(int code){
			this.code=code;
		}
	
		public String getMsg(){
			return msg;
		}
		public void setMsg(String msg){
			this.msg=msg;
		}

		public void setRows(List<House> list) {
			// TODO Auto-generated method stub
			
		}

		public void setTotal(int total2) {
			// TODO Auto-generated method stub
			
		}

		public void setPages(int parseInt) {
			// TODO Auto-generated method stub
			
		}

		  void setPageSize(int parseInt) {
			// TODO Auto-generated method stub
			
		}

}
