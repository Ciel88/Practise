package com.ciel.DesignPattern.singleton;

/**
 * @author 韦康 date 2021/10/19
 */
public class SingletonTest05 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);//true
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

    //双重检查（Double-Check）应用实例
    //优点，提升效率，线程安全,达到懒加载的效果，推荐开发中使用
    static class Singleton{
        private static volatile Singleton instance; //volatile 防止指令重排
        private Singleton() {
        }
        public static Singleton getInstance(){
            if (instance == null) {
                synchronized (Singleton.class) {
                    if (instance == null) {
                        instance = new Singleton();
                    }
                }
            }
            return instance;
        }
    }
}
