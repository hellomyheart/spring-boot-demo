package cn.hellomyheart.springboottest7.quartz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description
 * @className: MyQuartz
 * @package: cn.hellomyheart.springboottest7.quartz
 * @author: Stephen Shen
 * @date: 2020/9/28 下午7:57
 */
@Component
public class MyQuartz {
    @Scheduled(cron = "0/5 * * * * ? ")
    public void printCurrentTime() {
        System.out.println("Current Time is:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
