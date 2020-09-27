package cn.hellomyheart.springboottest3.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description
 * @className: MyInterceptor
 * @package: cn.hellomyheart.springboottest2.interceptor
 * @author: Stephen Shen
 * @date: 2020/9/27 下午9:59
 */
public class MyInterceptor implements HandlerInterceptor {

    //进入controller方法之前调用
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle");
        return true;//true表示放行，false表示不放行
    }

    //调用完controller之后，视图渲染之前
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle");
    }
    //页面跳转之后，整个流程执行之后，一般用于资源清理操作
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion");
    }
}
