package com.gls.gemini.upms.boot.web.service;

import com.gls.gemini.starter.mybatis.base.BaseServiceImpl;
import com.gls.gemini.upms.boot.web.converter.TenantTypeConverter;
import com.gls.gemini.upms.boot.web.entity.TenantTypeEntity;
import com.gls.gemini.upms.boot.web.mapper.TenantTypeMapper;
import com.gls.gemini.upms.sdk.vo.TenantTypeVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 租户类型表 服务实现类
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Slf4j
@Service
public class TenantTypeService extends BaseServiceImpl<TenantTypeConverter, TenantTypeMapper, TenantTypeVo, TenantTypeEntity> {
}
