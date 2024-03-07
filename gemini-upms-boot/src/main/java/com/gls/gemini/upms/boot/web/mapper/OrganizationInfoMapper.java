package com.gls.gemini.upms.boot.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gls.gemini.sdk.core.vo.OrganizationVo;
import com.gls.gemini.upms.boot.web.entity.OrganizationInfoEntity;

import java.util.List;

/**
 * 组织信息表 Mapper
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
public interface OrganizationInfoMapper extends BaseMapper<OrganizationInfoEntity> {
    /**
     * 根据用户id获取组织信息
     *
     * @param userId 用户id
     * @return 组织信息
     */
    List<OrganizationVo> listByUserId(Long userId);
}
