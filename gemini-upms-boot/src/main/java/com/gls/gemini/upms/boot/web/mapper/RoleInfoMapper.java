package com.gls.gemini.upms.boot.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gls.gemini.sdk.core.vo.RoleVo;
import com.gls.gemini.upms.boot.web.entity.RoleInfoEntity;

import java.util.List;

/**
 * 角色信息表 Mapper
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
public interface RoleInfoMapper extends BaseMapper<RoleInfoEntity> {
    /**
     * 根据用户id获取角色信息
     *
     * @param userId 用户id
     * @return 角色信息
     */
    List<RoleVo> listByUserId(Long userId);
}
