package com.liujp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liujp.model.User;
import com.liujp.service.UserService;

@Controller  
public class UserCtroller {  
      
    @Autowired  
    private UserService userService;   
  
    @RequestMapping("/getuser")  
    public String getUser(Model model){  
        User user = userService.selectById(1);  
        model.addAttribute("user", user);  
        return "user";  
    }  
}  