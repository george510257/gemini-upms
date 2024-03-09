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
 * 授权信息表 实体类
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_authorization_info")
public class AuthorizationInfoEntity extends BaseEntity {

    public static final String COL_CLIENT_ID = "client_id";
    public static final String COL_USER_ID = "user_id";
    public static final String COL_AUTHORIZATION_GRANT_TYPE = "authorization_grant_type";
    public static final String COL_AUTHORIZED_SCOPES = "authorized_scopes";
    public static final String COL_ATTRIBUTES = "attributes";
    public static final String COL_STATE = "state";
    public static final String COL_AUTHORIZATION_CODE_VALUE = "authorization_code_value";
    public static final String COL_AUTHORIZATION_CODE_ISSUED_AT = "authorization_code_issued_at";
    public static final String COL_AUTHORIZATION_CODE_EXPIRES_AT = "authorization_code_expires_at";
    public static final String COL_AUTHORIZATION_CODE_METADATA = "authorization_code_metadata";
    public static final String COL_ACCESS_TOKEN_VALUE = "access_token_value";
    public static final String COL_ACCESS_TOKEN_ISSUED_AT = "access_token_issued_at";
    public static final String COL_ACCESS_TOKEN_EXPIRES_AT = "access_token_expires_at";
    public static final String COL_ACCESS_TOKEN_METADATA = "access_token_metadata";
    public static final String COL_ACCESS_TOKEN_TYPE = "access_token_type";
    public static final String COL_ACCESS_TOKEN_SCOPES = "access_token_scopes";
    public static final String COL_REFRESH_TOKEN_VALUE = "refresh_token_value";
    public static final String COL_REFRESH_TOKEN_ISSUED_AT = "refresh_token_issued_at";
    public static final String COL_REFRESH_TOKEN_EXPIRES_AT = "refresh_token_expires_at";
    public static final String COL_REFRESH_TOKEN_METADATA = "refresh_token_metadata";
    public static final String COL_OIDC_ID_TOKEN_VALUE = "oidc_id_token_value";
    public static final String COL_OIDC_ID_TOKEN_ISSUED_AT = "oidc_id_token_issued_at";
    public static final String COL_OIDC_ID_TOKEN_EXPIRES_AT = "oidc_id_token_expires_at";
    public static final String COL_OIDC_ID_TOKEN_METADATA = "oidc_id_token_metadata";
    public static final String COL_USER_CODE_VALUE = "user_code_value";
    public static final String COL_USER_CODE_ISSUED_AT = "user_code_issued_at";
    public static final String COL_USER_CODE_EXPIRES_AT = "user_code_expires_at";
    public static final String COL_USER_CODE_METADATA = "user_code_metadata";
    public static final String COL_DEVICE_CODE_VALUE = "device_code_value";
    public static final String COL_DEVICE_CODE_ISSUED_AT = "device_code_issued_at";
    public static final String COL_DEVICE_CODE_EXPIRES_AT = "device_code_expires_at";
    public static final String COL_DEVICE_CODE_METADATA = "device_code_metadata";
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
     * 授权
     */
    private String authorizationGrantType;
    /**
     * 授权作用域
     */
    private Set<String> authorizedScopes;
    /**
     * 属性
     */
    private Map<String, Object> attributes;
    /**
     * 状态
     */
    private String state;
    /**
     * 授权码值
     */
    private String authorizationCodeValue;
    /**
     * 授权码发放时间
     */
    private Date authorizationCodeIssuedAt;
    /**
     * 授权码过期时间
     */
    private Date authorizationCodeExpiresAt;
    /**
     * 授权码元数据
     */
    private Map<String, Object> authorizationCodeMetadata;
    /**
     * 访问token值
     */
    private String accessTokenValue;
    /**
     * 访问token发放时间
     */
    private Date accessTokenIssuedAt;
    /**
     * 访问token过期时间
     */
    private Date accessTokenExpiresAt;
    /**
     * 访问token元数据
     */
    private Map<String, Object> accessTokenMetadata;
    /**
     * 访问token类型
     */
    private String accessTokenType;
    /**
     * 访问token作用域
     */
    private String accessTokenScopes;
    /**
     * 刷新token值
     */
    private String refreshTokenValue;
    /**
     * 刷新token发放时间
     */
    private Date refreshTokenIssuedAt;
    /**
     * 刷新token过期时间
     */
    private Date refreshTokenExpiresAt;
    /**
     * 刷新token元数据
     */
    private Map<String, Object> refreshTokenMetadata;
    /**
     * oidc id token值
     */
    private String oidcIdTokenValue;
    /**
     * oidc id token发放时间
     */
    private Date oidcIdTokenIssuedAt;
    /**
     * oidc id token过期时间
     */
    private Date oidcIdTokenExpiresAt;
    /**
     * oidc id token元数据
     */
    private Map<String, Object> oidcIdTokenMetadata;
    /**
     * 用户code值
     */
    private String userCodeValue;
    /**
     * 用户code发放时间
     */
    private Date userCodeIssuedAt;
    /**
     * 用户code过期时间
     */
    private Date userCodeExpiresAt;
    /**
     * 用户code元数据
     */
    private Map<String, Object> userCodeMetadata;
    /**
     * 设备code值
     */
    private String deviceCodeValue;
    /**
     * 设备code发放时间
     */
    private Date deviceCodeIssuedAt;
    /**
     * 设备code过期时间
     */
    private Date deviceCodeExpiresAt;
    /**
     * 设备code元数据
     */
    private Map<String, Object> deviceCodeMetadata;
}
