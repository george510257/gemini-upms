package com.gls.gemini.upms.boot.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gls.gemini.sdk.core.vo.PermissionVo;
import com.gls.gemini.upms.boot.web.entity.PermissionInfoEntity;

import java.util.List;

/**
 * 权限信息表 Mapper
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
public interface PermissionInfoMapper extends BaseMapper<PermissionInfoEntity> {
    /**
     * 根据用户id获取权限信息
     *
     * @param userId 用户id
     * @return 权限信息
     */
    List<PermissionVo> listByUserId(Long userId);
}
