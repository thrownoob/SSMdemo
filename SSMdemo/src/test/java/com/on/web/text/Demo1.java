package com.on.web.text;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.on.web.dao.UserDAO;
import com.on.web.mod.User;
import com.on.web.service.Userservice;
import com.on.web.serviceImp.UserserviceImp;
@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class Demo1 {
   private static Logger logger =Logger.getLogger(Demo1.class);
   @Resource
   private Userservice userService=null;
   

	@Test
	public void test() {
		
		User user=userService.getUserforid("1");
		logger.info(JSON.toJSONString(user));
	}

}