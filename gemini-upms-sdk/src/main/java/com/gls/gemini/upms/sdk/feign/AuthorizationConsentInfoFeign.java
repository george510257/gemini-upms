package com.gls.gemini.upms.sdk.feign;

import com.gls.gemini.common.core.domain.Result;
import com.gls.gemini.sdk.core.feign.BaseFeign;
import com.gls.gemini.upms.sdk.vo.AuthorizationConsentInfoVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 授权同意信息表 Feign
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@FeignClient(name = "gemini-upms", contextId = "authorizationConsentInfo", path = "/authorizationConsentInfo")
public interface AuthorizationConsentInfoFeign extends BaseFeign<AuthorizationConsentInfoVo> {
    /**
     * 根据客户端id和用户id查询授权同意信息
     *
     * @param clientId 客户端id
     * @param userId   用户id
     * @return 授权同意信息
     */
    @GetMapping("/findByClientIdAndUserId/{clientId}/{userId}")
    Result<AuthorizationConsentInfoVo> findByClientIdAndUserId(@PathVariable("clientId") Long clientId, @PathVariable("userId") Long userId);
}
