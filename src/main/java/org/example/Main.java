package org.example;

public class Main {

        public static void main(String[] args) {
            // 获取单例实例
            Singleton singleton1 = Singleton.getInstance();
            Singleton singleton2 = Singleton.getInstance();

            // 输出实例是否相同
            System.out.println(singleton1 == singleton2); // 输出：true

            // 调用实例方法
            singleton1.showMessage();
        }
    }
