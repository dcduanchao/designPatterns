package com.example.demo.dc.strategypattern;

/**
 * @author duanchao
 * @CreateDate: 2019/7/8 0008 16:17
 */
public class StrategyPattern {

    private TrafficCostStrategy trafficCostStrategy;

    public StrategyPattern(TrafficCostStrategy trafficCostStrategy) {
        this.trafficCostStrategy = trafficCostStrategy;
    }

    public  void changeTrafficCost(int distance){
        int cost = this.trafficCostStrategy.cost(distance);
        String s = this.trafficCostStrategy.trafficCost(cost);
        System.out.println(s);
    }

}
