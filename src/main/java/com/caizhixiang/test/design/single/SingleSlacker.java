package com.caizhixiang.test.design.single;

/**
 * 饿汉式
 */
public class SingleSlacker {
    private static SingleSlacker instance = new SingleSlacker();

    private SingleSlacker() {
    }

    public SingleSlacker getInstance() {
        return instance;
    }
}
