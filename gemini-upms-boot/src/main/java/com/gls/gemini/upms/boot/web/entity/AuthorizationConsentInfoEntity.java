package com.gls.gemini.upms.boot.web.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gls.gemini.starter.mybatis.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.util.Set;

/**
 * 授权同意信息表 实体类
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_authorization_consent_info")
public class AuthorizationConsentInfoEntity extends BaseEntity {

    public static final String COL_CLIENT_ID = "client_id";
    public static final String COL_USER_ID = "user_id";
    public static final String COL_AUTHORITIES = "authorities";
    @Serial
    private static final long serialVersionUID = 1L;
    /**
     * 客户端id
     */
    private Long clientId;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 权限
     */
    private Set<String> authorities;
}
