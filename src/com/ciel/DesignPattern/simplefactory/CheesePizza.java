package com.ciel.DesignPattern.simplefactory;

/**
 * @author 韦康 date 2021/11/9
 */
public class CheesePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("给奶酪披萨准备原材料");
    }
}
