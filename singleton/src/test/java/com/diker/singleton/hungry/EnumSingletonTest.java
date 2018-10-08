package com.diker.singleton.hungry;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author diker
 * @since 2018/10/6
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