package com.gls.gemini.upms.sdk.feign;

import com.gls.gemini.sdk.core.feign.BaseFeign;
import com.gls.gemini.upms.sdk.vo.DictInfoVo;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 字典信息表 Feign
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@FeignClient(name = "gemini-upms", contextId = "dictInfo", path = "/dictInfo")
public interface DictInfoFeign extends BaseFeign<DictInfoVo> {
}
