package com.diker.singleton.hungry;

/**
 * 单例模式：静态常量饿汉式
 *
 * <p>
 * 优点：
 * <ol>
 *  <li>实现简单</li>
 *  <li>类装载时完成创建，创建过程线程安全</li>
 * </ol>
 *
 * <p>
 * 缺点：
 * <ol>
 *  <li>类装载时即创建（双刃剑），如果创建过程比较耗时会造成启动过慢，如果应用的整个生命周期过程中未使用或使用频率极低会造成资源浪费</li>
 * </ol>
 * @author diker
 * @since 2018/10/6
 */
public class StaticConstantSingleton {

    private static final StaticConstantSingleton INSTANCE = new StaticConstantSingleton();

    private StaticConstantSingleton() {}

    public static StaticConstantSingleton getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        StaticConstantSingleton s1 = StaticConstantSingleton.getInstance();
        StaticConstantSingleton s2 = StaticConstantSingleton.getInstance();

        System.out.println(s1 == s2);
    }

}
