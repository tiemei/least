package com.tiemei.demo.least.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author tiemei
 * @date 2016-04-01
 */
public class LeastMethodAround implements MethodInterceptor {
    private static Logger log = LoggerFactory.getLogger(LeastMethodAround.class);

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        log.error("here id LeastMethodAround#invoke before.");
        Object result = invocation.proceed();
        log.error("here id LeastMethodAround#invoke after.");
        return result;
    }
}
