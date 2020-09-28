package cn.hellomyheart.springboottest1.controller;

import cn.hellomyheart.springboottest1.entity.TUser;
import cn.hellomyheart.springboottest1.service.TUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping("/findByPage")
    public PageInfo findByPage(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "2") Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<TUser> users = tUserService.findAll();
        PageInfo pageInfo = new PageInfo(users);
        return pageInfo;
    }
}
