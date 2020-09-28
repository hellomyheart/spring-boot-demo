package cn.hellomyheart.springboottest8.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
@ApiModel("用户")
@Data
public class TUser implements Serializable {
    /**
     *
     */
    @ApiModelProperty("id")
    private Integer id;

    /**
     *
     */
    @ApiModelProperty("银行卡号")
    private String bankCode;

    /**
     *
     */
    @ApiModelProperty("密码")
    private String password;

    /**
     *
     */
    @ApiModelProperty("余额")
    private Double balance;

    /**
     *
     */
    @ApiModelProperty("状态")
    private Integer status;

    /**
     *
     */
    @ApiModelProperty("头像路径")
    private String imagePath;

    private static final long serialVersionUID = -782645993297090845L;
}

