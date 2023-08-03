package com.link.test;

import org.apache.ibatis.session.Configuration;

public class Test01 {
    public static void main(String[] args) {
        String version = Configuration.class.getPackage().getImplementationVersion();
        System.out.println("MyBatis version: " + version);
    }
}