package com.example.demo.dc.strategypattern;

/**
 * @author duanchao
 * @CreateDate: 2019/7/8 0008 15:31
 *
 * 自驾策略
 *
 *
 * */
public class SubwayCostStrategy implements  TrafficCostStrategy{
    @Override
    public int cost(int distance) {
        if(distance<=0){
            return 0;
        }else if(distance<=5){
            return 3;

        }else if(distance<=20){
            double ceil = Math.ceil(Double.valueOf(distance-5));
            return (int) (3+ceil*2);
        }else{
            double ceil = Math.ceil(Double.valueOf(distance-20));
            return (int) (3+15*2+ceil*1);
        }

    }

    @Override
    public String trafficCost(int amount) {

        return "两地之间乘坐地铁需花费"+amount+"元";
    }
}
