package com.gls.gemini.upms.sdk.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.gls.gemini.sdk.core.vo.BaseVo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 字典信息表 Vo
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Schema(title = "dictInfo", description = "字典信息表Vo")
public class DictInfoVo extends BaseVo {

    /**
     * 字典编码
     */
    @ExcelProperty(value = "字典编码")
    @Schema(title = "字典编码", description = "字典编码")
    private String code;
    /**
     * 字典名称
     */
    @ExcelProperty(value = "字典名称")
    @Schema(title = "字典名称", description = "字典名称")
    private String name;
    /**
     * 字典描述
     */
    @ExcelProperty(value = "字典描述")
    @Schema(title = "字典描述", description = "字典描述")
    private String description;
    /**
     * 字典类型id 0:公共字典类型
     */
    @ExcelProperty(value = "字典类型id 0:公共字典类型")
    @Schema(title = "字典类型id 0:公共字典类型", description = "字典类型id 0:公共字典类型")
    private Long typeId;
    /**
     * 父字典id 0:无父字典
     */
    @ExcelProperty(value = "父字典id 0:无父字典")
    @Schema(title = "父字典id 0:无父字典", description = "父字典id 0:无父字典")
    private Long parentId;
    /**
     * 排序
     */
    @ExcelProperty(value = "排序")
    @Schema(title = "排序", description = "排序")
    private Integer sort;
}
