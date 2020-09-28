package cn.hellomyheart.springboottest4.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @description
 * @className: MyInterCeptorConfig
 * @package: cn.hellomyheart.springboottest2.interceptor
 * @author: Stephen Shen
 * @date: 2020/9/27 下午10:12
 */
@Configuration
public class MyInterCeptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //设置拦截器并指定拦截路径
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/interceptor/*");
        //添加自定义拦截器
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
