package com.lyx.bean;

public class RequestInfo {
	private int id;
	private int pwd;
	private String valCode;
	private String term;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPwd() {
		return pwd;
	}
	public void setPwd(int pwd) {
		this.pwd = pwd;
	}
	public String getValCode() {
		return valCode;
	}
	public void setValCode(String valCode) {
		this.valCode = valCode;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	@Override
	public String toString() {
		return "RequestInfo [id=" + id + ", pwd=" + pwd + ", valCode=" + valCode + ", term=" + term + "]";
	}
	
	
	
	
}
