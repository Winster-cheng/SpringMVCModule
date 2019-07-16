package com.module.controller;

import com.module.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Auther: peilongcheng
 * @Date: 2019/7/16 14:41
 * @Description:
 */
@Controller
public class UserController {
    @Autowired
    User user;

    @RequestMapping(value="/getUser")
    public ModelAndView getUser() {
        ModelAndView mv = new ModelAndView("user");
        user.setName("hehe");
        user.setSex("女");
        mv.addObject("user",user);
        return mv;
    }

    @RequestMapping(value = "/user")
    @ResponseBody
    public Object jsonUser() {
        user.setName("hehe");
        user.setSex("女");
        return user;
    }
}
