package com.gls.gemini.upms.sdk.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.gls.gemini.sdk.core.vo.BaseVo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 组织信息表 Vo
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Schema(title = "organizationInfo", description = "组织信息表Vo")
public class OrganizationInfoVo extends BaseVo {

    /**
     * 组织编码
     */
    @ExcelProperty(value = "组织编码")
    @Schema(title = "组织编码", description = "组织编码")
    private String code;
    /**
     * 组织名称
     */
    @ExcelProperty(value = "组织名称")
    @Schema(title = "组织名称", description = "组织名称")
    private String name;
    /**
     * 组织描述
     */
    @ExcelProperty(value = "组织描述")
    @Schema(title = "组织描述", description = "组织描述")
    private String description;
    /**
     * 组织类型 1:公司 2:部门 3:其他
     */
    @ExcelProperty(value = "组织类型 1:公司 2:部门 3:其他")
    @Schema(title = "组织类型 1:公司 2:部门 3:其他", description = "组织类型 1:公司 2:部门 3:其他")
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
