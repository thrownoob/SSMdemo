package com.on.web.serviceImp;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.on.web.dao.UserDAO;
import com.on.web.mod.User;
import com.on.web.service.Userservice;
@Service("userService")
public class UserserviceImp implements Userservice{
     
	@Resource
	private UserDAO userdao;
	public User getUserforid(String userid) {
		// TODO Auto-generated method stub
		return this.userdao.selectByPrimaryKey(userid);
	}

}
