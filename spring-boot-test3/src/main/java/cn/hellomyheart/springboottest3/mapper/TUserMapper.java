package cn.hellomyheart.springboottest3.mapper;

import cn.hellomyheart.springboottest3.entity.TUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description
 * @className: TUserMapper
 * @package: cn.hellomyheart.springboottest3.mapper
 * @author: Stephen Shen
 * @date: 2020/9/27 下午11:50
 */
@Repository
public interface TUserMapper {
    public List<TUser> findAll();
}
