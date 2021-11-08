package com.ciel.DesignPattern.singleton;

/**
 * @author 韦康 date 2021/10/19
 */
public class SingletonTest06 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);//true
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

    //静态内部类
    //Singleton加载的时候，内部类SingletonInstance并不会加载，当执行到getInstance方法中，调用到SingletonInstance的静态常量时，
        //静态内部类开始加载，并且类加载是线程安全的
    //类的静态属性只会在第一次加载类的时候初始化
    //推荐使用
    static class Singleton {
        private Singleton() {
        }
        private static class SingletonInstance {
            private static final Singleton instance = new Singleton();
        }

        public static Singleton getInstance() {
            return SingletonInstance.instance;
        }
    }
}
