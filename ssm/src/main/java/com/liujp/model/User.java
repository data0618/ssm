package com.liujp.model;

import java.util.Date;  

public class User {  
    private Integer userid;  
  
    private String username;  
  
    private String password;  
  
    private String firstName;  
  
    private String lastName;  
  
    private Date birthday;  
  
    private Integer age;  
  
    public Integer getUserid() {  
        return userid;  
    }  
  
    public void setUserid(Integer userid) {  
        this.userid = userid;  
    }  
  
    public String getUsername() {  
        return username;  
    }  
  
    public void setUsername(String username) {  
        this.username = username;  
    }  
  
    public String getPassword() {  
        return password;  
    }  
  
    public void setPassword(String password) {  
        this.password = password;  
    }  
  
    public String getFirstName() {  
        return firstName;  
    }  
  
    public void setFirstName(String firstName) {  
        this.firstName = firstName;  
    }  
  
    public String getLastName() {  
        return lastName;  
    }  
  
    public void setLastName(String lastName) {  
        this.lastName = lastName;  
    }  
  
    public Date getBirthday() {  
        return birthday;  
    }  
  
    public void setBirthday(Date birthday) {  
        this.birthday = birthday;  
    }  
  
    public Integer getAge() {  
        return age;  
    }  
  
    public void setAge(Integer age) {  
        this.age = age;  
    }  
  
    @Override  
    public String toString() {  
        return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", firstName="  
                + firstName + ", lastName=" + lastName + ", birthday=" + birthday + ", age=" + age + "]";  
    }  
      
      
}  