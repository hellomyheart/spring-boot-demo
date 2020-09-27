package cn.hellomyheart.springboottest3.controller;

import cn.hellomyheart.springboottest3.entity.TUser;
import cn.hellomyheart.springboottest3.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description
 * @className: TUserController
 * @package: cn.hellomyheart.springboottest3.controller
 * @author: Stephen Shen
 * @date: 2020/9/28 上午12:04
 */
@RestController
@RequestMapping("/user")
public class TUserController {

    @Autowired
    private TUserService tUserService;

    @RequestMapping("/findAll")
    public List<TUser> findAll(){
        List<TUser> users = tUserService.findAll();
        return users;
    }
}
