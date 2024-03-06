package com.gls.gemini.upms.sdk.feign;

import com.gls.gemini.sdk.core.feign.BaseFeign;
import com.gls.gemini.upms.sdk.vo.ClientInfoVo;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 客户端信息表 Feign
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@FeignClient(name = "gemini-upms", contextId = "clientInfo", path = "/clientInfo")
public interface ClientInfoFeign extends BaseFeign<ClientInfoVo> {
}