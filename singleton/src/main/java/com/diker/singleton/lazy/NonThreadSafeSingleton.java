package com.diker.singleton.lazy;

/**
 * 单例模式：非线程安全懒汉式
 *
 * <li>优点：
 *  <ul>1、延迟加载，使用时才创建实例</ul>
 * </li>
 * <li>缺点：
 *  <ul>1、创建过程非线程安全，高并发时可能会创建多个实例</ul>
 * </li>
 * @author:diker
 * @date:2018/10/6
 */
public class NonThreadSafeSingleton {
    private static NonThreadSafeSingleton INSTANCE;

    private NonThreadSafeSingleton() {}

    public static NonThreadSafeSingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new NonThreadSafeSingleton();
        }
        return INSTANCE;
    }
}
