package com.ciel.DesignPattern.singleton;

/**
 * @author 韦康 date 2021/10/19
 */
public class SingletonTest02 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);//true
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

    //饿汉式（静态代码块）
    //优点：写法简单，在类装载的时候就完成了实例化，避免了线程同步问题
    //缺点：没有达到懒加载，可能造成内存资源的浪费
    static class Singleton{
        private static Singleton instance;
        private Singleton() {
        }
        static {
            instance = new Singleton();
        }

        public static Singleton getInstance(){
            return instance;
        }
    }
}
