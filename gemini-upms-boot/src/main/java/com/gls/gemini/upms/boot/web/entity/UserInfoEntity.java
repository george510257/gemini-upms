package com.gls.gemini.upms.boot.web.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gls.gemini.starter.mybatis.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;

/**
 * 用户信息表 实体类
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 * @date 2024-02-17
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_user_info")
public class UserInfoEntity extends BaseEntity {

    public static final String COL_USERNAME = "username";
    public static final String COL_PASSWORD = "password";
    public static final String COL_NAME = "name";
    public static final String COL_NICKNAME = "nickname";
    public static final String COL_EMAIL = "email";
    public static final String COL_MOBILE = "mobile";
    public static final String COL_AVATAR = "avatar";
    public static final String COL_STATUS = "status";
    @Serial
    private static final long serialVersionUID = 1L;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 姓名
     */
    private String name;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 状态 0:正常 1:禁用
     */
    private Boolean status;
}
