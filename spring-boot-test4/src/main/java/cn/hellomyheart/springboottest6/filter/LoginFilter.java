package cn.hellomyheart.springboottest6.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description 登录过滤器
 * @className: LoginFilter
 * @package: cn.hellomyheart.springboottest2.filter
 * @author: Stephen Shen
 * @date: 2020/9/27 下午9:32
 */
//指定拦截路径
@WebFilter(urlPatterns = "/filter/**")
//还需要这个注解，创建SpringBean对象
@Component
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("LoginFilter");
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        filterChain.doFilter(request,response);
    }
}
