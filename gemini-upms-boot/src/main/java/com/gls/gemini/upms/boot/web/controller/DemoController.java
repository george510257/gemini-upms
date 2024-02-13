package com.gls.gemini.upms.boot.web.controller;

import cn.hutool.json.JSONUtil;
import com.gls.gemini.common.core.base.BaseController;
import com.gls.gemini.starter.excel.annotation.ExcelResponse;
import com.gls.gemini.starter.excel.annotation.ExcelSheet;
import com.gls.gemini.upms.boot.kafka.KafkaProducer;
import com.gls.gemini.upms.boot.web.service.DemoService;
import com.gls.gemini.upms.sdk.vo.DemoVo;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/demo")
@Tag(name = "demo", description = "样例")
public class DemoController implements BaseController<DemoService, DemoVo> {

    @Resource
    private DemoService demoService;
    @Resource
    private KafkaProducer kafkaProducer;

    @Parameter(name = "demoVo", description = "样例vo", required = true, schema = @Schema(implementation = DemoVo.class))
    @PostMapping("/hello")
    public DemoVo hello(@RequestBody DemoVo demoVo) {
        log.info("demoVo {}", JSONUtil.toJsonStr(demoVo));
        kafkaProducer.send("test", JSONUtil.toJsonStr(demoVo));
        return demoVo;
    }

    @Override
    public DemoService getService() {
        return this.demoService;
    }


    @PostMapping("/download")
    @ExcelResponse(fileName = "样例", sheets = @ExcelSheet(sheetName = "样例1", head = DemoVo.class))
    public List<DemoVo> download() {
        return demoService.list(new DemoVo());
    }
}
