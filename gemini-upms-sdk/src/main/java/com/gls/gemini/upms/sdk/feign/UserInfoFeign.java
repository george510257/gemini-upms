package com.gls.gemini.upms.sdk.feign;

import com.gls.gemini.sdk.core.feign.BaseFeign;
import com.gls.gemini.upms.sdk.vo.UserInfoVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用户信息表 Feign
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@FeignClient(name = "gemini-upms", contextId = "userInfo", path = "/userInfo")
public interface UserInfoFeign extends BaseFeign<UserInfoVo> {
    /**
     * 根据用户名获取用户信息
     *
     * @param username 用户名
     * @return 用户信息
     */
    @PostMapping("/loadUserByUsername")
    UserDetails loadUserByUsername(@RequestParam String username);
}
