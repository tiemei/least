package com.tiemei.demo.least.spring;

import com.taobao.pamirs.schedule.strategy.TBScheduleManagerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

/**
 * @author tiemei
 * @since 2016-09-12
 */
public class Main {

    private static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
        log.error("init spring context ok.");

        TBScheduleManagerFactory scheduleManagerFactory = new TBScheduleManagerFactory();
        Properties p = new Properties();
        p.put("zkConnectString", "192.168.99.100:2181");
        p.put("rootPath", "/app1");
        p.put("zkSessionTimeout", "60000");
        p.put("userName", "user");
        p.put("password", "pwd");
        p.put("isCheckParentPath", "true");
        scheduleManagerFactory.setApplicationContext(ctx);
        scheduleManagerFactory.init(p);

        Thread.sleep(10000000);
    }
}
