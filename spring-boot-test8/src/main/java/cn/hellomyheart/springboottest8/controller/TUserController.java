package cn.hellomyheart.springboottest8.controller;

import cn.hellomyheart.springboottest8.entity.TUser;
import cn.hellomyheart.springboottest8.service.TUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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
//@Api(description = "用户接口")
@Api(tags = "用户接口")
@RestController
@RequestMapping("/user")
public class TUserController {

    @Autowired
    private TUserService tUserService;

    @ApiOperation("查询所有用户")
    @RequestMapping("/findAll")
    public List<TUser> findAll(){
        List<TUser> users = tUserService.findAll();
        return users;
    }
    @ApiOperation("分页查询所有用户")
    @RequestMapping("/findByPage")
//    public PageInfo findByPage(@RequestParam(defaultValue = "1") @ApiParam("页码") Integer pageNum, @RequestParam(defaultValue = "2") @ApiParam("页容量") Integer pageSize){
    public PageInfo findByPage(@RequestParam() @ApiParam("页码") Integer pageNum, @RequestParam() @ApiParam("页容量") Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<TUser> users = tUserService.findAll();
        PageInfo pageInfo = new PageInfo(users);
        return pageInfo;
    }
}
