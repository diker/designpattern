package com.diker.singleton.lazy;

/**
 * 单例模式：线程安全懒汉式（双重检查）。注：单例模式只是双重检查方法使用的一个场景。
 *
 *
 * <li>优点：
 *  <ul>1、延迟加载，使用时才创建实例</ul>
 *  <ul>2、创建过程线程安全</ul>
 *  <ul>3、实例初次创建完成后，后续再获取实例时效率高</ul>
 * </li>
 * @author:diker
 * @date:2018/10/6
 */
public class DoubleCheckSingleton {

    private static DoubleCheckSingleton INSTANCE;
    private static final byte[] LOCK = new byte[0];

    private DoubleCheckSingleton() {}

    public static DoubleCheckSingleton getInstance() {
        if(INSTANCE == null) {
            synchronized (LOCK) {
                if(INSTANCE == null) {
                    INSTANCE = new DoubleCheckSingleton();
                }
            }
        }
        return INSTANCE;
    }

}
