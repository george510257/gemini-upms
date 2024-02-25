package com.gls.gemini.upms.sdk.feign;

import com.gls.gemini.sdk.core.feign.BaseFeign;
import com.gls.gemini.upms.sdk.vo.DemoVo;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * demo数据 Feign
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@FeignClient(name = "gemini-upms", contextId = "demo", path = "/demo")
public interface DemoFeign extends BaseFeign<DemoVo> {
}
