package com.gls.gemini.upms.sdk.feign;

import com.gls.gemini.sdk.core.feign.BaseFeign;
import com.gls.gemini.upms.sdk.vo.AuthorizationConsentInfoVo;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 授权同意信息表 Feign
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@FeignClient(name = "gemini-upms", contextId = "authorizationConsentInfo", path = "/authorizationConsentInfo")
public interface AuthorizationConsentInfoFeign extends BaseFeign<AuthorizationConsentInfoVo> {
}
