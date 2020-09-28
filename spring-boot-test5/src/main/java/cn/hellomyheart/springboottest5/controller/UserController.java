package cn.hellomyheart.springboottest5.controller;

import cn.hellomyheart.springboottest5.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;

/**
 * @description
 * @className: UserController
 * @package: cn.hellomyheart.springboottest5.controller
 * @author: Stephen Shen
 * @date: 2020/9/28 上午11:21
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("findAll")
    public String findAll(Model model){
        ArrayList<User> users = new ArrayList<>();

        users.add(new User(1001, "张三", "123", new Date()));
        users.add(new User(1002, "李四", "456", new Date()));
        users.add(new User(1003, "王五", "789", new Date()));

        model.addAttribute("users",users);
        return "/list";
    }

    @RequestMapping("findById")
    public String findById(Model model, String uid) {
        System.out.println(uid);

        if (uid.equals("1001")) {
            User user = new User(1001, "张三", "123", new Date());
            model.addAttribute("user", user);
        }

        return "/queryOne";

    }
}
