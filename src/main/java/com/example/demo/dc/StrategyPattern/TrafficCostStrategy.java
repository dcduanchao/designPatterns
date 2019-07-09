package com.example.demo.dc.StrategyPattern;

/**
 * @author duanchao
 * @CreateDate: 2019/7/8 0008 15:29
 */
public interface TrafficCostStrategy {


    int cost(int distance);

    String trafficCost(int amount);
}
