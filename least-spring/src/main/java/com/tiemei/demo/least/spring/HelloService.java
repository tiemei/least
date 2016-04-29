package com.tiemei.demo.least.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author tiemei
 * @date 2014-10-29
 */
@Service
public class HelloService {

    private static Logger log = LoggerFactory.getLogger(HelloService.class);


    @PostConstruct
    public void init()  throws Exception {
        log.error("HelloService#init ...");
//        throw new RuntimeException("HelloService#init RE");
    }

    public String hello() {
        log.error("here id HelloService#hello");
        return "hello in HelloService.";
    }

}
