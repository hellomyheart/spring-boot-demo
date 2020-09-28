package cn.hellomyheart.springboottest3.controller;

import cn.hellomyheart.springboottest3.exception.MyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @className: ExceptionController
 * @package: cn.hellomyheart.springboottest1.controller
 * @author: Stephen Shen
 * @date: 2020/9/27 下午9:03
 */
@RestController
public class ExceptionController {

    @RequestMapping("/exception")
    public String exception() {
        int i = 1 / 0;
        return "exception";
    }

    @RequestMapping("/myexception")
    public String myexception() throws MyException {
        throw new MyException("出现了异常");
    }
}
