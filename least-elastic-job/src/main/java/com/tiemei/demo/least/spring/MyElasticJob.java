package com.tiemei.demo.least.spring;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author tiemei
 * @since 2016-08-30
 */
public class MyElasticJob implements SimpleJob {

    private Logger logger = LoggerFactory.getLogger(MyElasticJob.class);

    @Override
    public void execute(ShardingContext shardingContext) {
        this.logger.error(shardingContext.getJobName());
    }
}
