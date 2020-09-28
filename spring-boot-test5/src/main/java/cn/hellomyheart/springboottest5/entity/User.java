package cn.hellomyheart.springboottest1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @description
 * @className: User
 * @package: cn.hellomyheart.springboottest4.entity
 * @author: Stephen Shen
 * @date: 2020/9/28 上午11:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 558909502986187214L;

    private Integer id;
    private String username;
    private String password;
    private Date birthday;
}
