package com.tiemei.demo.least.spring;

import java.security.MessageDigest;

/**
 * @author tiemei
 * @date 2016-05-10
 */
public class Demo {

    public static String string2MD5(String inStr) throws Exception{
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] byteArray = inStr.getBytes();

        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++){
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16)
                hexValue.append("0");
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }


    public static void main(String[] args) throws Exception {
        System.err.println(string2MD5("6152020null"));
    }

}
