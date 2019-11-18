package com.caizhixiang.test.design.single;

/**
 * 终极实现，最优实现，可以防止反射获取非单例
 */
public enum  SingleEnum{
    INSTANCE;
    public SingleEnum getInstance() {
        return INSTANCE;
    }
}
