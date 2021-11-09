package com.ciel.DesignPattern.simplefactory;

/**
 * @author 韦康 date 2021/11/9
 */
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备原材料");
    }
}
