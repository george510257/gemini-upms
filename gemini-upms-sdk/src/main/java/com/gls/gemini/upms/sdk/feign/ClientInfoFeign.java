package com.gls.gemini.upms.sdk.feign;

import com.gls.gemini.common.core.domain.Result;
import com.gls.gemini.sdk.core.feign.BaseFeign;
import com.gls.gemini.upms.sdk.vo.ClientInfoVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 客户端信息表 Feign
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@FeignClient(name = "gemini-upms", contextId = "clientInfo", path = "/clientInfo")
public interface ClientInfoFeign extends BaseFeign<ClientInfoVo> {
    /**
     * 根据客户端id获取客户端信息
     *
     * @param clientId 客户端id
     * @return 客户端信息
     */
    @PostMapping("/getByClientId")
    Result<ClientInfoVo> getByClientId(@RequestParam String clientId);
}
