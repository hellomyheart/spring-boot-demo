package cn.hellomyheart.springboottest8.mapper;

/**
 * @description
 * @className: DemoDAO
 * @package: cn.hellomyheart.springboottest8.mapper
 * @author: Stephen Shen
 * @date: 2020/9/28 下午9:37
 */

import cn.hellomyheart.springboottest8.entity.TestEntity;

import java.util.List;

/**
 * 假设这个是你的DAO存储。当然还要这个类让spring管理，当然你不用需要存储，也不需要这个类。
 **/
public class DemoDAO {
    public void save(List<TestEntity> list) {
        // 如果是mybatis,尽量别直接调用多次insert,自己写一个mapper里面新增一个方法batchInsert,所有数据一次性插入
    }
}