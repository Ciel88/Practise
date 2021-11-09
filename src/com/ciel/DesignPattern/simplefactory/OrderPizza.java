package com.ciel.DesignPattern.simplefactory;

/**
 * @author 韦康 date 2021/11/9
 */
public class OrderPizza {

    public static void main(String[] args) {
        Pizza greek = PizzaFactory.createPizza("greek");
        greek.prepare();

        Pizza cheese = PizzaFactory.createPizza("cheese");
        cheese.prepare();

        Pizza pepper = PizzaFactory.createPizza("pepper");
        pepper.prepare();

        Pizza lqbz = PizzaFactory.createPizza("lqbz");
        System.out.println(lqbz);
    }
}
