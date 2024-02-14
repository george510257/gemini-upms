package com.gls.gemini.upms.boot.web.service;

import com.gls.gemini.starter.mybatis.base.BaseServiceImpl;
import com.gls.gemini.upms.boot.web.converter.DemoConverter;
import com.gls.gemini.upms.boot.web.entity.DemoEntity;
import com.gls.gemini.upms.boot.web.mapper.DemoMapper;
import com.gls.gemini.upms.sdk.vo.DemoVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DemoService extends BaseServiceImpl<DemoConverter, DemoMapper, DemoVo, DemoEntity> {

    /**
     * 批量新增
     *
     * @param demoVos 视图
     */
    @Transactional(rollbackFor = Exception.class)
    public void saveBatch(List<DemoVo> demoVos) {
        List<DemoEntity> demoEntities = converter.convertList(demoVos);
        this.saveBatch(demoEntities);
    }
}
