package com.diker.singleton.hungry;

/**
 * 单例模式：静态代码块饿汉式
 *
 * <li>优点：
 *  <ul>1、实现简单</ul>
 *  <ul>2、类装载时完成创建，创建过程线程安全</ul>
 * </li>
 * <li>缺点：
 *  <ul>1、类装载时即创建（双刃剑），如果创建过程比较耗时会造成启动过慢，如果应用的整个生命周期过程中未使用或使用频率极低会造成资源浪费</ul>
 * </li>
 * @author:diker
 * @date:2018/10/6
 */
public class StaticCodeBlockSingleton {

    private static StaticCodeBlockSingleton INSTANCE;
    private String javaVersion;

    private StaticCodeBlockSingleton() {}

    static {
        INSTANCE = new StaticCodeBlockSingleton();
        INSTANCE.javaVersion = System.getProperty("java.version");
    }

    public static StaticCodeBlockSingleton getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        StaticCodeBlockSingleton singleton = StaticCodeBlockSingleton.getInstance();
        System.out.println(singleton.javaVersion);
    }
}
