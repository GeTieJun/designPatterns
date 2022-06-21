package com.tiejun.ge.strategyModel.service;

import org.springframework.stereotype.Service;

/**
 * @author getiejun
 * @date 2022/6/15
 */

/**
 * 策略模式定义：定义了算法族，分别封装起来，让它们之间可以相互替换，此模式让算法的变化独立于使用算法的客户
 * 策略模式核心：把会变化的部分抽取并且封装起来，以后就可以修改或者扩展这部分，而不会影响其他不需要变化的部分
 * 解决问题：使用继承，接口，封装，多用组合，少用继承
 */
public abstract class Duck {

     protected FlyBehavior flyBehavior;

     protected QuackBehavior quackBehavior;

     public Duck () {}

     public abstract void display();

     public void setFlyBehavior(FlyBehavior flyBehavior) {
          this.flyBehavior = flyBehavior;
     }

     public void setQuackBehavior(QuackBehavior quackBehavior) {
          this.quackBehavior = quackBehavior;
     }

     public void performFly() {
          flyBehavior.fly();
     }

     public void performQuack() {
          quackBehavior.quack();
     }


}
