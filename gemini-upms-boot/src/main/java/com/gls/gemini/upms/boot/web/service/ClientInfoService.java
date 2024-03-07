package com.gls.gemini.upms.boot.web.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gls.gemini.starter.mybatis.base.BaseServiceImpl;
import com.gls.gemini.upms.boot.web.converter.ClientInfoConverter;
import com.gls.gemini.upms.boot.web.entity.ClientInfoEntity;
import com.gls.gemini.upms.boot.web.mapper.ClientInfoMapper;
import com.gls.gemini.upms.sdk.vo.ClientInfoVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 客户端信息表 服务实现类
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Slf4j
@Service
public class ClientInfoService extends BaseServiceImpl<ClientInfoConverter, ClientInfoMapper, ClientInfoVo, ClientInfoEntity> {
    /**
     * 根据客户端id获取客户端信息
     *
     * @param clientId 客户端id
     * @return 客户端信息
     */
    public ClientInfoVo getByClientId(String clientId) {
        QueryWrapper<ClientInfoEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(ClientInfoEntity.COL_CLIENT_ID, clientId);
        ClientInfoEntity clientInfoEntity = this.getOne(queryWrapper);
        return this.converter.reverse(clientInfoEntity);
    }
}
