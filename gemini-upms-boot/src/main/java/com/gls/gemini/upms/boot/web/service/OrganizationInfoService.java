package com.gls.gemini.upms.boot.web.service;

import com.gls.gemini.sdk.core.dto.OrganizationDto;
import com.gls.gemini.starter.mybatis.base.BaseServiceImpl;
import com.gls.gemini.upms.boot.web.converter.OrganizationInfoConverter;
import com.gls.gemini.upms.boot.web.entity.OrganizationInfoEntity;
import com.gls.gemini.upms.boot.web.mapper.OrganizationInfoMapper;
import com.gls.gemini.upms.sdk.vo.OrganizationInfoVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 组织信息表 服务实现类
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Slf4j
@Service
public class OrganizationInfoService extends BaseServiceImpl<OrganizationInfoConverter, OrganizationInfoMapper, OrganizationInfoVo, OrganizationInfoEntity> {
    /**
     * 根据用户id获取组织信息
     *
     * @param userId 用户id
     * @return 组织信息
     */
    public List<OrganizationDto> listByUserId(Long userId) {
        return baseMapper.listByUserId(userId);
    }

    public OrganizationDto getOrganizationByUserId(Long userId) {
        return baseMapper.getOrganizationByUserId(userId);
    }
}
