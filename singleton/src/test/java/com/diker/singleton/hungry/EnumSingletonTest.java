package com.diker.singleton.hungry;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author:diker
 * @date:2018/10/7
 */
public class EnumSingletonTest {
    @Test
    public void getKey() throws Exception {
        System.out.println(EnumSingleton.INSTANCE.getKey());
    }

    @Test
    public void getValue() throws Exception {
        System.out.println(EnumSingleton.INSTANCE.getValue());
    }

}