package com.gls.gemini.upms.boot.web.service;

import com.gls.gemini.starter.mybatis.base.BaseServiceImpl;
import com.gls.gemini.upms.boot.web.converter.RoleInfoConverter;
import com.gls.gemini.upms.boot.web.entity.RoleInfoEntity;
import com.gls.gemini.upms.boot.web.mapper.RoleInfoMapper;
import com.gls.gemini.upms.sdk.vo.RoleInfoVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 角色信息表 服务实现类
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 * @date 2024-02-19
 */
@Slf4j
@Service
public class RoleInfoService extends BaseServiceImpl<RoleInfoConverter, RoleInfoMapper, RoleInfoVo, RoleInfoEntity> {
}
