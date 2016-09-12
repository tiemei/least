package com.tiemei.demo.least.spring;


import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import com.tiemei.demo.least.spring.scripting.Messenger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @author tiemei
 * @date 2013-07-12
 */
@Controller
public class HelloController {

    private static Logger log = LoggerFactory.getLogger(HelloController.class);

//    @Resource
//    Messenger messenger;

    @Resource
    private HelloService helloServiceProxy;

    @RequestMapping("/hello.mv")
    public ModelAndView showMV(ModelAndView mv) {
        log.info("HelloController#show");
        mv.setViewName("hello");
//        throw  new RuntimeException("");
        return mv;
    }

    @RequestMapping("/hello.service")
    @ResponseBody
    public String showTxt(ModelAndView mv) {
        log.info("HelloController#show");
        return this.helloServiceProxy.hello();
    }

    @RequestMapping("/ma")
    @ResponseBody
    public String ma(HttpServletRequest request, ParamDTO paramDTO) {
        log.info("HelloController#ma");
        return JSON.toJSONString(paramDTO);
    }

    @RequestMapping("/groovy")
    public void groovyShowName(HttpServletResponse resp) throws IOException {
//        resp.getWriter().write(messenger.getMessage());
    }

    /**
     * 参考：https://github.com/httl/httl-demo/tree/master/httl-springmvc-demo
     *
     * @param req
     * @param resp
     */
    @RequestMapping("/httl")
    public String httlDemo(HttpServletRequest req, HttpServletResponse resp, Map<String, Object> context) {
        context.put("strings", new String[]{"hello1", "hello2"});
        return "hello-httl";
    }

    /**
     * 不用spring的继承
     *
     * @param req
     * @param resp
     * @return
     */
    @RequestMapping("/httl2")
    public void httlDemo2(HttpServletRequest req, HttpServletResponse resp) {
        // TODO 待补充
    }

    @RequestMapping("/testlog")
    @ResponseBody
    public String testlog(HttpServletRequest req, HttpServletResponse resp) {
        String s = null;
        try {
            Preconditions.checkNotNull(s);
        } catch (Exception e) {
            log.error("testlog:", e);
        }
        return "testlog done.";
    }

}
