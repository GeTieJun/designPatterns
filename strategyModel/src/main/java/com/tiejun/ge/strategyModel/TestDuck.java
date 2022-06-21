package com.tiejun.ge.strategyModel;

import com.tiejun.ge.strategyModel.service.Duck;
import com.tiejun.ge.strategyModel.service.ModeDuck;

/**
 * @author getiejun
 * @date 2022/6/15
 */
public class TestDuck {

    public static void main(String[] args) {
        Duck duck = new ModeDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
    }
}
