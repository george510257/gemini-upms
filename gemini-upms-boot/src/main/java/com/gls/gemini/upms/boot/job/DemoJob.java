package com.gls.gemini.upms.boot.job;

import com.gls.gemini.upms.sdk.vo.DemoVo;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DemoJob {

    @XxlJob("demoJob")
    public void demoJob() {
        XxlJobHelper.log("demoJob start");
        log.info("demoJob");
        XxlJobHelper.log("demoJob end");
    }

    @XxlJob("demoVo")
    public DemoVo demoVo(DemoVo demoVo) {
        XxlJobHelper.log("demoVo start");
        XxlJobHelper.getJobParam();
        XxlJobHelper.log("demoVo param: {}", demoVo);
        log.info("demoVo: {}", demoVo);
        XxlJobHelper.log("demoVo end");
        return demoVo;
    }
}
