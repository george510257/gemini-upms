package com.gls.gemini.upms.boot.web.service;

import com.gls.gemini.sdk.core.vo.RoleVo;
import com.gls.gemini.starter.mybatis.base.BaseServiceImpl;
import com.gls.gemini.upms.boot.web.converter.RoleInfoConverter;
import com.gls.gemini.upms.boot.web.entity.RoleInfoEntity;
import com.gls.gemini.upms.boot.web.mapper.RoleInfoMapper;
import com.gls.gemini.upms.sdk.vo.RoleInfoVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 角色信息表 服务实现类
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Slf4j
@Service
public class RoleInfoService extends BaseServiceImpl<RoleInfoConverter, RoleInfoMapper, RoleInfoVo, RoleInfoEntity> {
    /**
     * 根据用户id获取角色信息
     *
     * @param userId 用户id
     * @return 角色信息
     */
    public List<RoleVo> listByUserId(Long userId) {
        return baseMapper.listByUserId(userId);
    }

    /**
     * 根据用户id获取角色信息
     *
     * @param userId 用户id
     * @return 角色信息
     */
    public RoleVo getRoleByUserId(Long userId) {
        return baseMapper.getRoleByUserId(userId);
    }
}
