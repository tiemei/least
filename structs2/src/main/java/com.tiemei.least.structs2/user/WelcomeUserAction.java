package com.tiemei.least.structs2.user;

/**
 * 详细structs2例子参见 http://www.mkyong.com/tutorials/struts-2-tutorials/
 *
 * @author tiemei
 * @date 2014-01-13
 */
public class WelcomeUserAction {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // all struts logic here
    public String execute() {

        return "SUCCESS";

    }

}
