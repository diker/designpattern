package com.diker.singleton.lazy;

/**
 * 单例模式：非线程安全懒汉式
 *
 * <p>
 * 优点：
 * <ol>
 *  <li>延迟加载，使用时才创建实例</li>
 * </ol>
 * <p>
 * 缺点：
 * <ol>
 *  <li>创建过程非线程安全，高并发时可能会创建多个实例</li>
 * </ol>
 * @author diker
 * @since 2018/10/6
 */
public class NonThreadSafeSingleton2 {
    private static NonThreadSafeSingleton2 INSTANCE;
    private static final byte[] LOCK = new byte[0];

    private NonThreadSafeSingleton2() {}

    public static NonThreadSafeSingleton2 getInstance() {
        if(INSTANCE == null) {
            synchronized (LOCK) {
                INSTANCE = new NonThreadSafeSingleton2();
            }
        }
        return INSTANCE;
    }
}
