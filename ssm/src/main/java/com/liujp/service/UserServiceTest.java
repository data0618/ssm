package com.liujp.service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liujp.model.User;

public class UserServiceTest {  
	  
    private UserService userService;  
      
    @Before  
    public void before(){  
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:conf/context-mybatis.xml");  
        userService = (UserService)applicationContext.getBean("userService");  
    }  
      
    @Test  
    public void testUserService(){  
        User user  = new User();  
        user.setUsername("admin");  
        user.setPassword("123456");  
        int userid = userService.insertUser(user);  
        System.out.println(userid);  
        User u = userService.selectById(1);  
        System.out.println(u);  
    }  
}  