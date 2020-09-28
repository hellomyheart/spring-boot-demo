package cn.hellomyheart.springboottest7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringBootDemoTest7Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoTest7Application.class, args);
    }

}
