package com.gls.gemini.upms.sdk.feign;

import com.gls.gemini.sdk.core.feign.BaseFeign;
import com.gls.gemini.upms.sdk.vo.DemoVo;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * demo feign
 */
@FeignClient(name = "gemini-upms", contextId = "demo", path = "/demo")
public interface DemoFeign extends BaseFeign<DemoVo> {
}
