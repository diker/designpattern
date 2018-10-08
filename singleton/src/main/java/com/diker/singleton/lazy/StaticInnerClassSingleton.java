package com.diker.singleton.lazy;

/**
 * 单例模式：线程安全懒汉式（静态内部类）
 * <p>
 * 静态内部类方式在Singleton类被装载时并不会立即实例化，而是在需要实例化时，调用getInstance方法，
 * 才会装载StaticInnerClassSingleton类，从而完成Singleton的实例化。
 *
 * <p>
 * 优点：
 * <ol>
 *  <li>延迟加载，使用时才创建实例</li>
 *  <li>创建过程线程安全</li>
 *  <li>实例初次创建完成后，后续再获取实例时效率高</li>
 * </ol>
 * @author diker
 * @since 2018/10/6
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {}

    private static class StaticInnerClassSingletonBuilder {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return StaticInnerClassSingletonBuilder.INSTANCE;
    }

}
