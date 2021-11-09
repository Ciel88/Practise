package com.ciel.DesignPattern.simplefactory;

/**
 * @author 韦康 date 2021/11/9
 */
public abstract class Pizza {
    private String name;

    public abstract void prepare();

    public void bake() {
        System.out.println("baking");
    }

    public void cut() {
        System.out.println("cutting");
    }

    public void box() {
        System.out.println("boxing");
    }

}
