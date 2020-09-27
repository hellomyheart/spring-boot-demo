package cn.hellomyheart.springboottest1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @description
 * @className: UserController
 * @package: cn.hellomyheart.springboottest1.controller
 * @author: Stephen Shen
 * @date: 2020/9/27 下午8:15
 */
@RestController
public class UserController {


    @RequestMapping("/hello")
    public String login(){
        return "hello";
    }
}
