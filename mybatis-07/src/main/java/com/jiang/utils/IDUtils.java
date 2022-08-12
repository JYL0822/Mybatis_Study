package com.jiang.utils;

import org.junit.Test;

import java.util.UUID;

public class IDUtils {

    public static String getId(){
        //replaceAll("-","");这个方法是把 -  换成空
        //replaceAll("-","*"); 把-  换成 *
        return UUID.randomUUID().toString().replaceAll("-","");
    }
    @Test
    public void test(){
        System.out.println(IDUtils.getId());
        System.out.println(IDUtils.getId());
        System.out.println(IDUtils.getId());
    }
}
