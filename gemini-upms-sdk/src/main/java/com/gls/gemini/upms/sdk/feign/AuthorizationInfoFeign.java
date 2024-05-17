package com.gls.gemini.upms.sdk.feign;

import com.gls.gemini.common.core.domain.Result;
import com.gls.gemini.sdk.core.feign.BaseFeign;
import com.gls.gemini.upms.sdk.vo.AuthorizationInfoVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * 授权信息表 Feign
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@FeignClient(name = "gemini-upms", contextId = "authorizationInfo", path = "/authorizationInfo")
public interface AuthorizationInfoFeign extends BaseFeign<AuthorizationInfoVo> {
    /**
     * 根据token获取授权信息
     *
     * @param token token
     * @return 授权信息
     */
    @PostMapping("/getByToken")
    Result<List<AuthorizationInfoVo>> getByToken(String token);
}
