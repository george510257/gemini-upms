package com.gls.gemini.upms.boot.web.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gls.gemini.starter.mybatis.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/**
 * 客户端信息表 实体类
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_client_info")
public class ClientInfoEntity extends BaseEntity {

    public static final String COL_CLIENT_ID = "client_id";
    public static final String COL_CLIENT_ID_ISSUED_AT = "client_id_issued_at";
    public static final String COL_CLIENT_SECRET = "client_secret";
    public static final String COL_CLIENT_SECRET_EXPIRES_AT = "client_secret_expires_at";
    public static final String COL_CLIENT_NAME = "client_name";
    public static final String COL_CLIENT_AUTHENTICATION_METHODS = "client_authentication_methods";
    public static final String COL_AUTHORIZED_GRANT_TYPES = "authorized_grant_types";
    public static final String COL_REDIRECT_URIS = "redirect_uris";
    public static final String COL_POST_LOGOUT_REDIRECT_URIS = "post_logout_redirect_uris";
    public static final String COL_SCOPES = "scopes";
    public static final String COL_CLIENT_SETTINGS = "client_settings";
    public static final String COL_TOKEN_SETTINGS = "token_settings";
    public static final String COL_ADDITIONAL_INFORMATION = "additional_information";
    @Serial
    private static final long serialVersionUID = 1L;
    /**
     * 客户端id
     */
    private String clientId;
    /**
     * 客户端id发放时间
     */
    private Date clientIdIssuedAt;
    /**
     * 客户端密钥
     */
    private String clientSecret;
    /**
     * 客户端密钥过期时间
     */
    private Date clientSecretExpiresAt;
    /**
     * 客户端名称
     */
    private String clientName;
    /**
     * 客户端认证方式
     */
    private Set<String> clientAuthenticationMethods;
    /**
     * 授权类型
     */
    private Set<String> authorizedGrantTypes;
    /**
     * 重定向地址
     */
    private Set<String> redirectUris;
    /**
     * 登出重定向地址
     */
    private Set<String> postLogoutRedirectUris;
    /**
     * 作用域
     */
    private Set<String> scopes;
    /**
     * 客户端设置
     */
    private Map<String, Object> clientSettings;
    /**
     * token设置
     */
    private Map<String, Object> tokenSettings;
    /**
     * 附加信息
     */
    private Map<String, Object> additionalInformation;
}
