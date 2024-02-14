package com.gls.gemini.upms.boot.web.controller;

import cn.hutool.json.JSONUtil;
import com.gls.gemini.common.core.base.BaseController;
import com.gls.gemini.starter.excel.annotation.ExcelRequest;
import com.gls.gemini.starter.excel.annotation.ExcelResponse;
import com.gls.gemini.starter.excel.annotation.ExcelSheet;
import com.gls.gemini.upms.boot.kafka.KafkaProducer;
import com.gls.gemini.upms.boot.web.service.DemoService;
import com.gls.gemini.upms.sdk.vo.DemoVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/demo")
@Tag(name = "demo", description = "样例")
public class DemoController extends BaseController<DemoService, DemoVo> {

    @Resource
    private KafkaProducer kafkaProducer;

    @Operation(summary = "样例", description = "样例")
    @Parameter(name = "demoVo", description = "样例vo", required = true, schema = @Schema(implementation = DemoVo.class))
    @PostMapping("/hello")
    public DemoVo hello(@RequestBody DemoVo demoVo) {
        log.info("demoVo {}", JSONUtil.toJsonStr(demoVo));
        kafkaProducer.send("test", JSONUtil.toJsonStr(demoVo));
        return demoVo;
    }

    @Operation(summary = "下载", description = "下载")
    @ExcelResponse(fileName = "样例", sheets = @ExcelSheet(sheetName = "样例1", head = DemoVo.class))
    @PostMapping("/download")
    public List<DemoVo> download() {
        return service.list(new DemoVo());
    }

    @Operation(summary = "上传", description = "上传")
    @Parameter(name = "file", description = "文件", required = true, schema = @Schema(type = "string", format = "binary"))
    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void upload(@ExcelRequest List<DemoVo> demoVos) {
        service.saveBatch(demoVos);
    }
}
