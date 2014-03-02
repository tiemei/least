package com.tiemei.demo.least.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author tiemei
 * @date 2013-07-12
 */
public class ReqCtxInterceptor extends HandlerInterceptorAdapter {
    private static Logger log = LoggerFactory.getLogger(ReqCtxInterceptor.class);

//    @Autowired
//    private ApplicationContext appCtx;

    @Override
    public boolean preHandle(
            HttpServletRequest req, HttpServletResponse resp, Object handler) throws Exception{
        log.info("ReqCtxInterceptor#preHandle");
        /*resp.getWriter().write("here is preHanlde result");
        resp.getWriter().close();*/
//        throw new RuntimeException("");
        return true;
    }



    public void afterConcurrentHandlingStarted(
            HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        log.info("ReqCtxInterceptor#afterConcurrentHandlingStarted");
    }



    @Override
    public void afterCompletion(
            HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("ReqCtxInterceptor#afterCompletion");
    }
}
