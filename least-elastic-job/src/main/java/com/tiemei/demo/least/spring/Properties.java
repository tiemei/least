package com.tiemei.demo.least.spring;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author tiemei
 * @since 2016-06-22
 */
public class Properties {

    @Value( "${env}" )
    private String env;

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }
}
