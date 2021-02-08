package com.xxx.controller;

import com.mysql.cj.Session;
import com.xxx.domain.User;
import com.xxx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/toLogin")
    public String toLogin()
    {
        return "login";
    }

    @RequestMapping("/login")
    public String login(String username, String psw, HttpServletRequest request)
    {
        request.getSession().setAttribute("username",username);
        request.getSession().setAttribute("psw",psw);
        return "forward:/favorite/showAllFar";
    }

    @RequestMapping("/toAddUser")
    public String toAddUser()
    {
        return "addUser";
    }

    @RequestMapping("/addUser")
    public String addUser(User user,HttpServletRequest request)
    {
        userService.insertUser(user);
        request.getSession().setAttribute("username",user.getUserName());
        request.getSession().setAttribute("psw",user.getUserPassword());
        request.getSession().setAttribute("userId",user.getUserId());
        return "forward/favorite/showAllFar";
    }
}
