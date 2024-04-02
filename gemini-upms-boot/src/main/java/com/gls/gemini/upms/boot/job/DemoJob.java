package com.gls.gemini.upms.boot.job;

import com.gls.gemini.upms.sdk.vo.DemoVo;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 任务调度
 */
@Slf4j
@Component
public class DemoJob {
    /**
     * 任务调度demo
     */
    @XxlJob("demoJob")
    public void demoJob() {
        XxlJobHelper.log("demoJob start");
        log.info("demoJob");
        XxlJobHelper.log("demoJob end");
    }

    /**
     * 任务调度demoVo
     *
     * @param demoVo demoVo
     * @return demoVo
     */
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
