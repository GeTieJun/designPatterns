package com.tiejun.ge.strategyModel.service;

/**
 * @author getiejun
 * @date 2022/6/15
 */
public class FlyWithWings implements  FlyBehavior{
    @Override
    public void fly() {
        System.out.println("flying....");
    }
}
