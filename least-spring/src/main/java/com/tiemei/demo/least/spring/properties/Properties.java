package com.tiemei.demo.least.spring.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author tiemei
 * @since 2016-06-22
 */
@Service
public class Properties {

    private static String env;

    public static String getEnv() {
        return env;
    }

    @Value("${env}")
    public void setEnv(String env) {
        this.env = env;
    }
}
