package com.gls.gemini.upms.sdk.vo;

import com.gls.gemini.common.core.base.BaseVo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;


@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@Schema(title = "demo", description = "样例vo")
public class DemoVo extends BaseVo {

    @Schema(title = "名称", description = "名称")
    private String name;

    @Schema(title = "描述", description = "描述")
    private String description;

    @Schema(title = "状态", description = "状态 0:正常 1:禁用")
    private Integer status;
}
