package com.diker.singleton.hungry;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import static org.junit.Assert.*;

/**
 * @author:diker
 * @date:2018/10/7
 */
public class StaticCodeBlockSingletonTest {

    @Test
    public void getInstance() throws Exception {
        StaticCodeBlockSingleton singleton1 = StaticCodeBlockSingleton.getInstance();
        StaticCodeBlockSingleton singleton2 = StaticCodeBlockSingleton.getInstance();
        Assert.assertEquals(singleton1, singleton2);

    }

    /**
     * 运行该方法时{@link com.diker.singleton.hungry.StaticCodeBlockSingleton}类需要实现{@link java.io.Serializable}接口
     * @throws Exception
     */
    @Test
    public void getInstance2() throws Exception {

        StaticCodeBlockSingleton singleton1 = StaticCodeBlockSingleton.getInstance();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(singleton1);
        byte[] bytes = baos.toByteArray();

        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        StaticCodeBlockSingleton singleton2 = (StaticCodeBlockSingleton)ois.readObject();

        Assert.assertNotEquals(singleton1, singleton2);
    }
}