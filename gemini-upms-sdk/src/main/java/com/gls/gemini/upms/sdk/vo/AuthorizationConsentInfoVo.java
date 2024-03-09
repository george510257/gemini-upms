package com.gls.gemini.upms.sdk.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.gls.gemini.sdk.core.vo.BaseVo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

/**
 * 授权同意信息表 Vo
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Schema(title = "authorizationConsentInfo", description = "授权同意信息表Vo")
public class AuthorizationConsentInfoVo extends BaseVo {

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
     * 权限
     */
    @ExcelProperty(value = "权限")
    @Schema(title = "权限", description = "权限")
    private Set<String> authorities;
}
