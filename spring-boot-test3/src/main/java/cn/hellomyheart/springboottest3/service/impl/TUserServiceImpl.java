package cn.hellomyheart.springboottest1.service.impl;

import cn.hellomyheart.springboottest1.entity.TUser;
import cn.hellomyheart.springboottest1.mapper.TUserMapper;
import cn.hellomyheart.springboottest1.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description
 * @className: TUserServiceImpl
 * @package: cn.hellomyheart.springboottest3.service.impl
 * @author: Stephen Shen
 * @date: 2020/9/28 上午12:03
 */
@Service
public class TUserServiceImpl implements TUserService {

    @Autowired
    private TUserMapper tUserMapper;

    @Override
    public List<TUser> findAll() {
        return tUserMapper.findAll();
    }
}
