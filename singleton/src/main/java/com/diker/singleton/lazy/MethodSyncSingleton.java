package com.diker.singleton.lazy;

/**
 * 单例模式：线程安全懒汉式（方法锁或代码块锁）
 *
 * <li>优点：
 *  <ul>1、延迟加载，使用时才创建实例</ul>
 *  <ul>2、创建过程线程安全</ul>
 * </li>
 * <li>缺点：
 *  <ul>1、每次获取实例对象时都需要获得锁，高并发时存在锁等待，效率较低</ul>
 * </li>
 * @author:diker
 * @date:2018/10/6
 */
public class MethodSyncSingleton {

    private static MethodSyncSingleton INSTANCE;

    private MethodSyncSingleton() {}

    public static synchronized MethodSyncSingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new MethodSyncSingleton();
        }
        return INSTANCE;
    }

    /*public static MethodSyncSingleton getInstance() {
        synchronized (MethodSyncSingleton.class) {
            if(INSTANCE == null) {
                INSTANCE = new MethodSyncSingleton();
            }
        }
        return INSTANCE;
    }*/

}
