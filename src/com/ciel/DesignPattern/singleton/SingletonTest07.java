package com.ciel.DesignPattern.singleton;

/**
 * @author 韦康 date 2021/10/19
 */
public class SingletonTest07 {

    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        instance.test();
    }

    //枚举方式
    //优点：避免多线程，防止反序列化重新创建对象
    //推荐使用
    enum Singleton {
        INSTANCE;
        public void test() {
            System.out.println("aaa");
        }
    }

}
