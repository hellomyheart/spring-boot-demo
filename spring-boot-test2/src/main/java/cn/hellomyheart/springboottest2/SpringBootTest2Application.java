package cn.hellomyheart.springboottest2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
//使用下面的注解后，Servlet、Filter、Listener可以直接通过@WebServlet、@WebFilter、@WebListener注解自动注册
@ServletComponentScan
public class SpringBootTest2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTest2Application.class, args);
    }

}
