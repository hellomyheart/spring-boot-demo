package cn.hellomyheart.springboottest5.controller;

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

    @Value("${name}")
    private String name;

    @Value("${user.username}")
    private String username;

    @Value("${user.password}")
    private String password;

    @Value("${array}")
    private String [] array;

    @RequestMapping("/hello")
    public String login(){
        return "hello"+username+",array"+ Arrays.toString(array);
    }
}
