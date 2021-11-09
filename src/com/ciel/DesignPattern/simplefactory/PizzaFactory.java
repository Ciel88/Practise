package com.ciel.DesignPattern.simplefactory;

/**
 * @author 韦康 date 2021/11/8
 */
public class PizzaFactory {
    //简单工厂模式（静态工厂模式）是属于创建型模式，是工厂模式的一种。简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例

    /*简单工厂模式由三种角色组成
    1.工厂角色：简单工厂模式的核心，它负责实现创建所有实例的内部逻辑。工厂类的创建产品类的方法可以被外界直接调用，创建所需的产品对象
    2.抽象产品角色：简单工厂模式所创建的所有对象的父类，它负责描述所有实例所共有的公共接口
    3.具体产品角色：是简单工厂模式的创建目标，所有创建的对象都是充当这个角色的某个具体类的实例
    */
    public static Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if ("greek".equals(pizzaType)) {
            return new GreekPizza();
        } else if ("cheese".equals(pizzaType)) {
            return new CheesePizza();
        } else if ("pepper".equals(pizzaType)) {
            return new PepperPizza();
        }
        return pizza;
    }

/*    优点：
        　工厂类是整个模式的关键.包含了必要的逻辑判断,根据外界给定的信息,决定究竟应该创建哪个具体类的对象.
　　      通过使用工厂类,外界可以从直接创建具体产品对象的尴尬局面摆脱出来,仅仅需要负责“消费”对象就可以了。
        　而不必管这些对象究竟如何创建及如何组织的．明确了各自的职责和权利，有利于整个软件体系结构的优化。
    缺点：
        　由于工厂类集中了所有实例的创建逻辑，违反了开闭原则，将全部创建逻辑集中到了一个工厂类中；
        　它所能创建的类只能是事先考虑到的，如果需要添加新的类，则就需要改变工厂类了。
        　当系统中的具体产品类不断增多时候，可能会出现要求工厂类根据不同条件创建不同实例的需求．
        　这种对条件的判断和对具体产品类型的判断交错在一起，很难避免模块功能的蔓延，对系统的维护和扩展非常不利；*/
}
