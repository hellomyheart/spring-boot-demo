package cn.hellomyheart.springboottest1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @className: RedisController
 * @package: cn.hellomyheart.springboottest6.controller
 * @author: Stephen Shen
 * @date: 2020/9/28 下午3:33
 */
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/get")
    public String get() {
        //redisTemplate.opsForValue();//操作字符串
        //redisTemplate.opsForList();//操作List
        //redisTemplate.opsForSet();//操作Set
        //redisTemplate.opsForZSet();//操作ZSet
        //redisTemplate.opsForHash();//操作Map

        redisTemplate.opsForValue().set("cm", "17");
        String cm = (String) redisTemplate.opsForValue().get("cm");
        stringRedisTemplate.opsForValue().set("cm2","18");
        String cm2 = stringRedisTemplate.opsForValue().get("cm2");
        System.out.println("cm:"+cm+",cm2:"+cm2);
        return "success";
    }


}
