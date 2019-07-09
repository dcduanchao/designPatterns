package com.example.demo.dc.StrategyPattern;

/**
 * @author duanchao
 * @CreateDate: 2019/7/8 0008 15:31
 *
 * 自驾策略
 *
 *
 * */
public class CatCostStrategy  implements  TrafficCostStrategy{
    @Override
    public int cost(int distance) {
        if(distance<=0){
            return 0;
        }else{

            return distance*1;
        }

    }

    @Override
    public String trafficCost(int amount) {
        return "两地之间开车需花费"+amount+"元";
    }
}
