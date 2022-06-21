package com.tiejun.ge.strategyModel.service;

/**
 * @author getiejun
 * @date 2022/6/15
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack....");
    }
}
