package com.tiemei.demo.least.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author tiemei
 * @date 2016-04-01
 */
public class LeastMethodBefore implements MethodBeforeAdvice {

    private static Logger log = LoggerFactory.getLogger(LeastMethodBefore.class);

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        log.error("here id LeastMethodBefore#before.");
    }
}
