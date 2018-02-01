package cn.zyf.controller;

import cn.zyf.domain.User;
import cn.zyf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by ZYF_JOKER on 2018/1/18.
 */
@Controller
@RequestMapping({"/user"})
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping({"/getUser"})
    @ResponseBody
    public String getUser(){
        User user = new User();
        return "1";
    }
    @RequestMapping({"/getUserAll"})
    @ResponseBody
    public User getUserAll(Long id){
        return userService.findById(id);
    }

}
