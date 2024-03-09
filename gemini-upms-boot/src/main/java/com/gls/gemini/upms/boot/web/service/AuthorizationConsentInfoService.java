package com.gls.gemini.upms.boot.web.service;

import com.gls.gemini.starter.mybatis.base.BaseServiceImpl;
import com.gls.gemini.upms.boot.web.converter.AuthorizationConsentInfoConverter;
import com.gls.gemini.upms.boot.web.entity.AuthorizationConsentInfoEntity;
import com.gls.gemini.upms.boot.web.mapper.AuthorizationConsentInfoMapper;
import com.gls.gemini.upms.sdk.vo.AuthorizationConsentInfoVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 授权同意信息表 服务实现类
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Slf4j
@Service
public class AuthorizationConsentInfoService extends BaseServiceImpl<AuthorizationConsentInfoConverter, AuthorizationConsentInfoMapper, AuthorizationConsentInfoVo, AuthorizationConsentInfoEntity> {
}
