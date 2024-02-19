package com.gls.gemini.upms.sdk.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.gls.gemini.sdk.core.vo.BaseVo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 角色信息表 Vo
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 * @date 2024-02-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Schema(title = "roleInfo", description = "角色信息表Vo")
public class RoleInfoVo extends BaseVo {

    /**
     * 角色编码
     */
    @ExcelProperty(value = "角色编码")
    @Schema(title = "角色编码", description = "角色编码")
    private String code;
    /**
     * 角色名称
     */
    @ExcelProperty(value = "角色名称")
    @Schema(title = "角色名称", description = "角色名称")
    private String name;
    /**
     * 角色描述
     */
    @ExcelProperty(value = "角色描述")
    @Schema(title = "角色描述", description = "角色描述")
    private String description;
    /**
     * 角色类型 1:超级管理员 2:管理员 3:普通用户 4:其他
     */
    @ExcelProperty(value = "角色类型 1:超级管理员 2:管理员 3:普通用户 4:其他")
    @Schema(title = "角色类型 1:超级管理员 2:管理员 3:普通用户 4:其他", description = "角色类型 1:超级管理员 2:管理员 3:普通用户 4:其他")
    private Boolean type;
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
