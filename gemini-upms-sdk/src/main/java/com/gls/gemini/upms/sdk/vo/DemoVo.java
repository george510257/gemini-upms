package com.gls.gemini.upms.sdk.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.gls.gemini.common.core.base.BaseVo;
import com.gls.gemini.upms.sdk.excel.converter.StatusConverter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
@Schema(title = "demo", description = "样例vo")
@ExcelIgnoreUnannotated
public class DemoVo extends BaseVo {

    @ExcelProperty(value = "名称")
    @Schema(title = "名称", description = "名称")
    private String name;

    @ExcelProperty(value = "描述")
    @Schema(title = "描述", description = "描述")
    private String description;

    @ExcelProperty(value = "状态", converter = StatusConverter.class)
    @Schema(title = "状态", description = "状态 0:正常 1:禁用")
    private Integer status;
}
