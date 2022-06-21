package com.tiejun.ge.strategyModel.service;

/**
 * @author getiejun
 * @date 2022/6/15
 */
public class ModeDuck extends Duck{

    @Override
    public void display() {
        System.out.println("a mode duck...");
    }

    public ModeDuck () {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
