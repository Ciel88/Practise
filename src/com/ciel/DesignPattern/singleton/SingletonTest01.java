package com.ciel.DesignPattern.singleton;

/**
 * @author 韦康 date 2021/10/19
 */
//单例模式保证了系统内存中该类只存在一个对象，节省了系统资源，对一些频繁创建销毁的对象，使用单例模式可以提高系统性能
    //JDK lang.Runtime用到了饿汉式
public class SingletonTest01 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);//true
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

    //饿汉式（静态变量）
    //优点：写法简单，在类装载的时候就完成了实例化，避免了线程同步问题
    //缺点：没有达到懒加载，可能造成内存资源的浪费
    static class Singleton{
        private Singleton() {

        }

        private final static Singleton instance = new Singleton();
        public static Singleton getInstance(){
            return instance;
        }
    }
}
