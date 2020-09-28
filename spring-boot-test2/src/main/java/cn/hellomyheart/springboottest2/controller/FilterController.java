package cn.hellomyheart.springboottest2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @className: FilterController
 * @package: cn.hellomyheart.springboottest2.controller
 * @author: Stephen Shen
 * @date: 2020/9/27 下午9:38
 */
@RestController
@RequestMapping("/filter")
public class FilterController {
    @RequestMapping("/login")
    public String login(){
        System.out.println("登录");
        return "login Success";
    }
}
