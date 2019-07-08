package com.example.demo.StrategyPattern;

/**
 * @author duanchao
 * @CreateDate: 2019/7/8 0008 15:19
 *
 * 策略模式
 */

public class StrategyPatternMain {

    public static void main(String[] args) {
        StrategyPattern bus = new StrategyPattern(new BusCostStrategy());
        bus.changeTrafficCost(30);
        StrategyPattern cat = new StrategyPattern(new CatCostStrategy());
        cat.changeTrafficCost(30);
        StrategyPattern sub = new StrategyPattern(new SubwayCostStrategy());
        sub.changeTrafficCost(30);




    }

}
