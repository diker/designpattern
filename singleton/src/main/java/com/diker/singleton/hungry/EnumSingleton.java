package com.diker.singleton.hungry;

/**
 * 单例模式：枚举饿汉式
 *
 * <p>
 * 优点：
 * <ol>
 *  <li>实现简单</li>
 *  <li>类装载时完成创建，创建过程线程安全</li>
 *  <li>不存在通过序列化和反序列化破坏单例的问题</li>
 * </ol>
 * <p>
 * 缺点：
 * <ol>
 *  <li>类装载时即创建（双刃剑），如果创建过程比较耗时会造成启动过慢，如果应用的整个生命周期过程中未使用或使用频率极低会造成资源浪费</li>
 * </ol>
 * @author diker
 * @since 2018/10/6
 */
public enum EnumSingleton {

    /**
     * 测试实例
     */
    INSTANCE("AcName", "账户名称");

    private String key;
    private String value;

    private EnumSingleton(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }
}
