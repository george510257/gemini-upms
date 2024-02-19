package com.gls.gemini.upms.sdk.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.gls.gemini.sdk.core.vo.BaseVo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户信息表 Vo
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 * @date 2024-02-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Schema(title = "userInfo", description = "用户信息表Vo")
public class UserInfoVo extends BaseVo {

    /**
     * 用户名
     */
    @ExcelProperty(value = "用户名")
    @Schema(title = "用户名", description = "用户名")
    private String username;
    /**
     * 密码
     */
    @ExcelProperty(value = "密码")
    @Schema(title = "密码", description = "密码")
    private String password;
    /**
     * 姓名
     */
    @ExcelProperty(value = "姓名")
    @Schema(title = "姓名", description = "姓名")
    private String name;
    /**
     * 昵称
     */
    @ExcelProperty(value = "昵称")
    @Schema(title = "昵称", description = "昵称")
    private String nickname;
    /**
     * 邮箱
     */
    @ExcelProperty(value = "邮箱")
    @Schema(title = "邮箱", description = "邮箱")
    private String email;
    /**
     * 手机号
     */
    @ExcelProperty(value = "手机号")
    @Schema(title = "手机号", description = "手机号")
    private String mobile;
    /**
     * 头像
     */
    @ExcelProperty(value = "头像")
    @Schema(title = "头像", description = "头像")
    private String avatar;
    /**
     * 状态 0:正常 1:禁用
     */
    @ExcelProperty(value = "状态 0:正常 1:禁用")
    @Schema(title = "状态 0:正常 1:禁用", description = "状态 0:正常 1:禁用")
    private Boolean status;
}
