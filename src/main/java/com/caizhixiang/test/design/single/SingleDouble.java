package com.caizhixiang.test.design.single;

/**
 * 懒汉式
 * 双重检查,无法保证反射、序列化情况下的单例
 */
public class SingleDouble {
    private volatile static SingleDouble instance = null;

    private SingleDouble() {
    }

    public static SingleDouble getInstance() {
        if (instance == null) {
            synchronized (SingleDouble.class) {
                if (instance == null) {
                    instance = new SingleDouble();
                }
            }
        }
        return instance;
    }
}
