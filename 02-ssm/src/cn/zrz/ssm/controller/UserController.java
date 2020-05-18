package cn.zrz.ssm.controller;

import cn.zrz.ssm.pojo.User;
import cn.zrz.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public String list(Model model){
        System.out.println("你好世界");
        List<User> users = userService.selectList();
        for (User user : users) {
            System.out.println(user);
        }
        return "hi";
    }
}
