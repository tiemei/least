package com.tiemei.demo.least.spi;

import java.util.ServiceLoader;

/**
 * @author tiemei
 * @since 2016-09-20
 */
public class Main {
    public static void main(String[] args) {
        ServiceLoader<IHello> loader = ServiceLoader.load(IHello.class);
        for (IHello hello : loader) {
            hello.sayHello();
        }
    }
}
