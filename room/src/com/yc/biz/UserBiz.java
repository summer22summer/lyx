package com.yc.biz;

import com.yc.bean.User;

public interface UserBiz {
	//注册用户
	public boolean register(User user);
	//用户名是否存在
	public boolean validate(User user);
	// 根据id查用户
	public User getUserById(Integer id);
	
	//登录
	public User login(User user);

}
