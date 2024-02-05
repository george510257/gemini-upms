package com.gls.gemini.upms.boot.web.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gls.gemini.starter.mybatis.base.BaseMybatisService;
import com.gls.gemini.upms.boot.web.converter.DemoConverter;
import com.gls.gemini.upms.boot.web.entity.DemoEntity;
import com.gls.gemini.upms.boot.web.mapper.DemoMapper;
import com.gls.gemini.upms.sdk.vo.DemoVo;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class DemoService extends ServiceImpl<DemoMapper, DemoEntity> implements BaseMybatisService<DemoConverter, DemoMapper, DemoVo, DemoEntity> {

    @Resource
    private DemoConverter demoConverter;

    @Override
    public DemoConverter getConverter() {
        return this.demoConverter;
    }

    @Override
    public DemoMapper getMapper() {
        return this.getBaseMapper();
    }
}
