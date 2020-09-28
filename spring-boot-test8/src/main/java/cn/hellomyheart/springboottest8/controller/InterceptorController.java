package cn.hellomyheart.springboottest8.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @className: InterceptorController
 * @package: cn.hellomyheart.springboottest2.controller
 * @author: Stephen Shen
 * @date: 2020/9/27 下午10:17
 */
@RestController
public class InterceptorController {

    @RequestMapping("/interceptor/test")
    public String test(){
        System.out.println("拦截器生效");
        return "success";
    }
}
