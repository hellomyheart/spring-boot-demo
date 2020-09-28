package cn.hellomyheart.springboottest8.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @description
 * @className: YmlController
 * @package: cn.hellomyheart.springboottest1.controller
 * @author: Stephen Shen
 * @date: 2020/9/27 下午8:51
 */
@RestController
@ConfigurationProperties(prefix = "yangl.test")
public class YmlController {
    private String name;

    private String[] arr;

    private List<String> list1;

    private List<Map<String,String>> list2;

    private Map<String,String> map;


    @RequestMapping("/yml")
    public void  yml(){

        System.out.println(name);
        System.out.println(Arrays.toString(arr));
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(map);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public List<String> getList1() {
        return list1;
    }

    public void setList1(List<String> list1) {
        this.list1 = list1;
    }

    public List<Map<String, String>> getList2() {
        return list2;
    }

    public void setList2(List<Map<String, String>> list2) {
        this.list2 = list2;
    }

    public Map<String, String> getMap() {
        return map;
    }


    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}
