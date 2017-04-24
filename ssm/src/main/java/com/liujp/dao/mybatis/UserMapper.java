package com.liujp.dao.mybatis;

import com.liujp.model.User;


public interface UserMapper {  
      
    int insert(User record);  
      
    User selectById(Integer userid);  
      
}  