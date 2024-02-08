package com.gls.gemini.upms.boot.job;

import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DemoJob {

    @XxlJob("demoJob")
    public void demoJob() {
        log.info("demoJob");
    }
}
