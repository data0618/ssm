package com.liujp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  
public class HelloWorldController {  
  
    @RequestMapping("/hello")  
    public String helloWorld(Model model) {  
  
        String message = "Hello World, Spring 3.1!";  
        model.addAttribute("message", message);  
        return "hello";  
    }  
  
}  