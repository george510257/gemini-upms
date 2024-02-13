package com.gls.gemini.upms.sdk.excel.customizer;

import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.gls.gemini.starter.excel.customizer.Customizer;
import com.gls.gemini.upms.sdk.vo.DemoVo;

public class DemoCustomizer implements Customizer<ExcelWriterSheetBuilder> {
    @Override
    public void customize(ExcelWriterSheetBuilder excelWriterSheetBuilder) {
        excelWriterSheetBuilder.head(DemoVo.class);
    }
}
