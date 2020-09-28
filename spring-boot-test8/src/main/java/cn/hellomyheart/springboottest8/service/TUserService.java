package cn.hellomyheart.springboottest8.service;

import cn.hellomyheart.springboottest8.entity.TUser;

import java.util.List;

/**
 * @description
 * @className: TUserService
 * @package: cn.hellomyheart.springboottest3.service
 * @author: Stephen Shen
 * @date: 2020/9/28 上午12:02
 */
public interface TUserService {
    public List<TUser> findAll();
}
