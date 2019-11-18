package com.caizhixiang.test.design.prototype;

/**
 * @author caizhixiang
 * @description: 原型模式测试
 * @Date 2019-11-13 9:53
 * @Version 1.0
 **/

public class PrototypeTest {
    public static void main(String[] args) {
        int i = Runtime.getRuntime().availableProcessors();
        System.out.println(i+"");
    }
}

//实现Cloneable 接口的原型抽象类Prototype
class Prototype implements Cloneable {
    @Override
    public Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}

//实现原型类
class ConcretePrototype extends Prototype {
    public void show() {

    }
}
