package com.gls.gemini.upms.boot.web.controller;

import com.gls.gemini.boot.core.base.BaseController;
import com.gls.gemini.upms.boot.web.service.ClientInfoService;
import com.gls.gemini.upms.sdk.feign.ClientInfoFeign;
import com.gls.gemini.upms.sdk.vo.ClientInfoVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 客户端信息表 控制器
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Slf4j
@RestController
@RequestMapping("/clientInfo")
@Tag(name = "clientInfo", description = "客户端信息表")
public class ClientInfoController extends BaseController<ClientInfoService, ClientInfoVo> implements ClientInfoFeign {
    /**
     * 根据客户端id获取客户端信息
     *
     * @param clientId 客户端id
     * @return 客户端信息
     */
    @Override
    @Operation(summary = "根据客户端id获取客户端信息", description = "根据客户端id获取客户端信息")
    @Parameter(name = "clientId", description = "客户端id")
    public ClientInfoVo getByClientId(String clientId) {
        return this.service.getByClientId(clientId);
    }
}