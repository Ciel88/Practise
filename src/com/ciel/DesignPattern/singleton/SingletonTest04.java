package com.ciel.DesignPattern.singleton;

/**
 * @author 韦康 date 2021/10/19
 */
public class SingletonTest04 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);//true
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

    //懒汉式(线程不安全)
    //优点：达到了懒加载的效果，但只能在单线程下使用，实际开发不推荐（不要）使用
    //缺点：线程不安全
    //如果要线程安全，直接在方法上加同步锁（但是会影响效率），实际开发不推荐
    static class Singleton{
        private static Singleton instance;
        private Singleton() {
        }
        public static Singleton getInstance(){
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }
}
