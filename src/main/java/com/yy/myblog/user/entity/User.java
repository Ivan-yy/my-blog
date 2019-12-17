package com.yy.myblog.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Ivan yu
 * @since 2019-12-17
 * @version ${version}
 */
@Data
public class User implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String account;

    private String password;

    private String name;

    private String sex;

    private Date createTime;

    private Date updateTime;


}
