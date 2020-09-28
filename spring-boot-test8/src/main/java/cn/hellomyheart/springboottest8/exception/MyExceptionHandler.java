package cn.hellomyheart.springboottest8.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @description 全局异常处理类
 * @className: MyExceptionHandler
 * @package: cn.hellomyheart.springboottest2.exception
 * @author: Stephen Shen
 * @date: 2020/9/27 下午9:09
 */
//拦截异常
@RestControllerAdvice
public class MyExceptionHandler {

    //处理指定异常
    @ExceptionHandler(value = Exception.class)
    public Object exceptionHandler(Exception e, HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        map.put("msg",e.getMessage());
        map.put("url",request.getRequestURL());
        System.out.println("Exception.class"+map);
        return map;
    }

    @ExceptionHandler(value = MyException.class)
    public Object myException(MyException e, HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        map.put("msg",e.getMessage());
        map.put("url",request.getRequestURL());

        System.out.println("MyException.class"+map);
        return map;
    }
}
