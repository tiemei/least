package com.tiemei.demo.least.spi;

/**
 * @author tiemei
 * @since 2016-09-20
 */
public class HelloImpl2 implements IHello {
    @Override
    public void sayHello() {
        System.err.println("hello 2");
    }
}
