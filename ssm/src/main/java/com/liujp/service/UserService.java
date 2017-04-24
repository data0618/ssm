package com.liujp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liujp.dao.mybatis.UserMapper;
import com.liujp.model.User;

@Service  
public class UserService {  
      
    @Autowired  
    private UserMapper userMapper;  
      
    public int insertUser(User user){  
        return userMapper.insert(user);  
    }  
      
    public User selectById(int userId){  
        return userMapper.selectById(userId);  
    }  
      
}  