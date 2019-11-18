package com.caizhixiang.test.design.single;


/**
 * 饿汉式
 * 内部类实现
 */
public class SingleInner{
    private SingleInner(){}
    static class Inner{
        public static SingleInner instance = new SingleInner();
    }

    public static SingleInner getInstance() {
        return Inner.instance;
    }
}
