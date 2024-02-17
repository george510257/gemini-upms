package com.gls.gemini.upms.sdk.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.gls.gemini.sdk.core.vo.BaseVo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 权限信息表 Vo
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 * @date 2024-02-17
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Schema(title = "permissionInfo", description = "权限信息表Vo")
public class PermissionInfoVo extends BaseVo {

    /**
     * 权限编码
     */
    @ExcelProperty(value = "权限编码")
    @Schema(title = "权限编码", description = "权限编码")
    private String code;
    /**
     * 权限名称
     */
    @ExcelProperty(value = "权限名称")
    @Schema(title = "权限名称", description = "权限名称")
    private String name;
    /**
     * 权限描述
     */
    @ExcelProperty(value = "权限描述")
    @Schema(title = "权限描述", description = "权限描述")
    private String description;
    /**
     * 权限类型 1:菜单 2:按钮 3:接口 4:其他
     */
    @ExcelProperty(value = "权限类型 1:菜单 2:按钮 3:接口 4:其他")
    @Schema(title = "权限类型 1:菜单 2:按钮 3:接口 4:其他", description = "权限类型 1:菜单 2:按钮 3:接口 4:其他")
    private Boolean type;
    /**
     * 权限url
     */
    @ExcelProperty(value = "权限url")
    @Schema(title = "权限url", description = "权限url")
    private String url;
    /**
     * 权限请求方式
     */
    @ExcelProperty(value = "权限请求方式")
    @Schema(title = "权限请求方式", description = "权限请求方式")
    private String method;
    /**
     * 父id
     */
    @ExcelProperty(value = "父id")
    @Schema(title = "父id", description = "父id")
    private Long pid;
    /**
     * 层级
     */
    @ExcelProperty(value = "层级")
    @Schema(title = "层级", description = "层级")
    private Boolean level;
    /**
     * 排序
     */
    @ExcelProperty(value = "排序")
    @Schema(title = "排序", description = "排序")
    private Integer sort;
    /**
     * 状态 0:正常 1:禁用
     */
    @ExcelProperty(value = "状态 0:正常 1:禁用")
    @Schema(title = "状态 0:正常 1:禁用", description = "状态 0:正常 1:禁用")
    private Boolean status;
}
