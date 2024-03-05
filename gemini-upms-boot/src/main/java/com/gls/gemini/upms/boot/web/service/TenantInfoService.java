package com.gls.gemini.upms.boot.web.service;

import com.gls.gemini.starter.mybatis.base.BaseServiceImpl;
import com.gls.gemini.upms.boot.web.converter.TenantInfoConverter;
import com.gls.gemini.upms.boot.web.entity.TenantInfoEntity;
import com.gls.gemini.upms.boot.web.mapper.TenantInfoMapper;
import com.gls.gemini.upms.sdk.vo.TenantInfoVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 租户信息表 服务实现类
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Slf4j
@Service
public class TenantInfoService extends BaseServiceImpl<TenantInfoConverter, TenantInfoMapper, TenantInfoVo, TenantInfoEntity> {
}
