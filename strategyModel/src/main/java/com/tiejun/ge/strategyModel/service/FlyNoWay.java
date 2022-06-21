package com.tiejun.ge.strategyModel.service;

/**
 * @author getiejun
 * @date 2022/6/15
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("not fly.......");
    }
}
