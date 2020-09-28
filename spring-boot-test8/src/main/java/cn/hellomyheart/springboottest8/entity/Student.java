package cn.hellomyheart.springboottest8.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description
 * @className: Student
 * @package: cn.hellomyheart.springboottest4.entity
 * @author: Stephen Shen
 * @date: 2020/9/28 上午10:30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {

    private static final long serialVersionUID = 1836102577486614035L;
    private Integer id;
    private String name;
    private Integer age;
    private String address;

}
