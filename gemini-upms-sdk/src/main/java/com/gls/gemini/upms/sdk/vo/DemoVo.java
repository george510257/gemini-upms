package com.gls.gemini.upms.sdk.vo;

import com.gls.gemini.common.core.base.BaseVo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;


@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@Schema(title = "demo", description = "样例vo")
public class DemoVo extends BaseVo {

    @Schema(title = "名称", description = "名称")
    private String name;

    @Schema(title = "标题", description = "标题")
    private String title;

    @Schema(title = "生日", description = "生日")
    private Date birthday;
}
