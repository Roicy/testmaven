package org.example;

public class Singleton {
    // 静态变量保存单例实例
    private static Singleton instance;

    // 私有构造函数，防止外部创建实例
    private Singleton() {
        System.out.println("单例实例被创建");
    }

    // 提供公共静态方法获取实例
    public static Singleton getInstance() {
        if (instance == null) {
            // 第一次调用时创建实例
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("这是单例模式的实例方法");
    }
}