package com.gls.gemini.upms.sdk.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.gls.gemini.sdk.core.vo.BaseVo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 角色类型表 Vo
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Schema(title = "roleType", description = "角色类型表Vo")
public class RoleTypeVo extends BaseVo {

    /**
     * 角色类型编码
     */
    @ExcelProperty(value = "角色类型编码")
    @Schema(title = "角色类型编码", description = "角色类型编码")
    private String code;
    /**
     * 角色类型名称
     */
    @ExcelProperty(value = "角色类型名称")
    @Schema(title = "角色类型名称", description = "角色类型名称")
    private String name;
    /**
     * 角色类型描述
     */
    @ExcelProperty(value = "角色类型描述")
    @Schema(title = "角色类型描述", description = "角色类型描述")
    private String description;
}