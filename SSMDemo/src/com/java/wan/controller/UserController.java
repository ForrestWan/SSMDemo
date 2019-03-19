package com.java.wan.controller;

import com.java.wan.entity.User;
import com.java.wan.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value="/user")
public class UserController {
    @Resource(name = "userService")
    UserService userservice;

    @RequestMapping(value = "/list")
    public ModelAndView list()
    {
        ModelAndView mv=new ModelAndView();
        UserService userService = null;
        List<User> userList=userService.getUser();
        mv.addObject("userList",userList);
        mv.setViewName("/show");
        return mv;
    }
    
}
