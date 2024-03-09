package com.gls.gemini.upms.sdk.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.gls.gemini.sdk.core.vo.BaseVo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.Map;
import java.util.Set;

/**
 * 授权信息表 Vo
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Schema(title = "authorizationInfo", description = "授权信息表Vo")
public class AuthorizationInfoVo extends BaseVo {

    /**
     * 客户端id
     */
    @ExcelProperty(value = "客户端id")
    @Schema(title = "客户端id", description = "客户端id")
    private Long clientId;
    /**
     * 用户id
     */
    @ExcelProperty(value = "用户id")
    @Schema(title = "用户id", description = "用户id")
    private Long userId;
    /**
     * 授权
     */
    @ExcelProperty(value = "授权")
    @Schema(title = "授权", description = "授权")
    private String authorizationGrantType;
    /**
     * 授权作用域
     */
    @ExcelProperty(value = "授权作用域")
    @Schema(title = "授权作用域", description = "授权作用域")
    private Set<String> authorizedScopes;
    /**
     * 属性
     */
    @ExcelProperty(value = "属性")
    @Schema(title = "属性", description = "属性")
    private Map<String, Object> attributes;
    /**
     * 状态
     */
    @ExcelProperty(value = "状态")
    @Schema(title = "状态", description = "状态")
    private String state;
    /**
     * 授权码值
     */
    @ExcelProperty(value = "授权码值")
    @Schema(title = "授权码值", description = "授权码值")
    private String authorizationCodeValue;
    /**
     * 授权码发放时间
     */
    @ExcelProperty(value = "授权码发放时间")
    @Schema(title = "授权码发放时间", description = "授权码发放时间")
    private Date authorizationCodeIssuedAt;
    /**
     * 授权码过期时间
     */
    @ExcelProperty(value = "授权码过期时间")
    @Schema(title = "授权码过期时间", description = "授权码过期时间")
    private Date authorizationCodeExpiresAt;
    /**
     * 授权码元数据
     */
    @ExcelProperty(value = "授权码元数据")
    @Schema(title = "授权码元数据", description = "授权码元数据")
    private Map<String, Object> authorizationCodeMetadata;
    /**
     * 访问token值
     */
    @ExcelProperty(value = "访问token值")
    @Schema(title = "访问token值", description = "访问token值")
    private String accessTokenValue;
    /**
     * 访问token发放时间
     */
    @ExcelProperty(value = "访问token发放时间")
    @Schema(title = "访问token发放时间", description = "访问token发放时间")
    private Date accessTokenIssuedAt;
    /**
     * 访问token过期时间
     */
    @ExcelProperty(value = "访问token过期时间")
    @Schema(title = "访问token过期时间", description = "访问token过期时间")
    private Date accessTokenExpiresAt;
    /**
     * 访问token元数据
     */
    @ExcelProperty(value = "访问token元数据")
    @Schema(title = "访问token元数据", description = "访问token元数据")
    private Map<String, Object> accessTokenMetadata;
    /**
     * 访问token类型
     */
    @ExcelProperty(value = "访问token类型")
    @Schema(title = "访问token类型", description = "访问token类型")
    private String accessTokenType;
    /**
     * 访问token作用域
     */
    @ExcelProperty(value = "访问token作用域")
    @Schema(title = "访问token作用域", description = "访问token作用域")
    private String accessTokenScopes;
    /**
     * 刷新token值
     */
    @ExcelProperty(value = "刷新token值")
    @Schema(title = "刷新token值", description = "刷新token值")
    private String refreshTokenValue;
    /**
     * 刷新token发放时间
     */
    @ExcelProperty(value = "刷新token发放时间")
    @Schema(title = "刷新token发放时间", description = "刷新token发放时间")
    private Date refreshTokenIssuedAt;
    /**
     * 刷新token过期时间
     */
    @ExcelProperty(value = "刷新token过期时间")
    @Schema(title = "刷新token过期时间", description = "刷新token过期时间")
    private Date refreshTokenExpiresAt;
    /**
     * 刷新token元数据
     */
    @ExcelProperty(value = "刷新token元数据")
    @Schema(title = "刷新token元数据", description = "刷新token元数据")
    private Map<String, Object> refreshTokenMetadata;
    /**
     * oidc id token值
     */
    @ExcelProperty(value = "oidc id token值")
    @Schema(title = "oidc id token值", description = "oidc id token值")
    private String oidcIdTokenValue;
    /**
     * oidc id token发放时间
     */
    @ExcelProperty(value = "oidc id token发放时间")
    @Schema(title = "oidc id token发放时间", description = "oidc id token发放时间")
    private Date oidcIdTokenIssuedAt;
    /**
     * oidc id token过期时间
     */
    @ExcelProperty(value = "oidc id token过期时间")
    @Schema(title = "oidc id token过期时间", description = "oidc id token过期时间")
    private Date oidcIdTokenExpiresAt;
    /**
     * oidc id token元数据
     */
    @ExcelProperty(value = "oidc id token元数据")
    @Schema(title = "oidc id token元数据", description = "oidc id token元数据")
    private Map<String, Object> oidcIdTokenMetadata;
    /**
     * 用户code值
     */
    @ExcelProperty(value = "用户code值")
    @Schema(title = "用户code值", description = "用户code值")
    private String userCodeValue;
    /**
     * 用户code发放时间
     */
    @ExcelProperty(value = "用户code发放时间")
    @Schema(title = "用户code发放时间", description = "用户code发放时间")
    private Date userCodeIssuedAt;
    /**
     * 用户code过期时间
     */
    @ExcelProperty(value = "用户code过期时间")
    @Schema(title = "用户code过期时间", description = "用户code过期时间")
    private Date userCodeExpiresAt;
    /**
     * 用户code元数据
     */
    @ExcelProperty(value = "用户code元数据")
    @Schema(title = "用户code元数据", description = "用户code元数据")
    private Map<String, Object> userCodeMetadata;
    /**
     * 设备code值
     */
    @ExcelProperty(value = "设备code值")
    @Schema(title = "设备code值", description = "设备code值")
    private String deviceCodeValue;
    /**
     * 设备code发放时间
     */
    @ExcelProperty(value = "设备code发放时间")
    @Schema(title = "设备code发放时间", description = "设备code发放时间")
    private Date deviceCodeIssuedAt;
    /**
     * 设备code过期时间
     */
    @ExcelProperty(value = "设备code过期时间")
    @Schema(title = "设备code过期时间", description = "设备code过期时间")
    private Date deviceCodeExpiresAt;
    /**
     * 设备code元数据
     */
    @ExcelProperty(value = "设备code元数据")
    @Schema(title = "设备code元数据", description = "设备code元数据")
    private Map<String, Object> deviceCodeMetadata;
}
