package com.gls.gemini.upms.sdk.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.gls.gemini.sdk.core.vo.BaseVo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户组织关系表 Vo
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Schema(title = "userOrganizationRelation", description = "用户组织关系表Vo")
public class UserOrganizationRelationVo extends BaseVo {

    /**
     * 用户id
     */
    @ExcelProperty(value = "用户id")
    @Schema(title = "用户id", description = "用户id")
    private Long userId;
    /**
     * 组织id
     */
    @ExcelProperty(value = "组织id")
    @Schema(title = "组织id", description = "组织id")
    private Long organizationId;
}
