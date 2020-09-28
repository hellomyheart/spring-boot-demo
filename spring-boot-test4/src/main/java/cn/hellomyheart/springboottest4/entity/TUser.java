package cn.hellomyheart.springboottest1.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class TUser implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private String bankCode;

    /**
     *
     */
    private String password;

    /**
     *
     */
    private Double balance;

    /**
     *
     */
    private Integer status;

    /**
     *
     */
    private String imagePath;

    private static final long serialVersionUID = -782645993297090845L;
}

