package com.example.demo.dc.strategypattern;

/**
 * @author duanchao
 * @CreateDate: 2019/7/8 0008 15:31
 *
 * 自驾策略
 *
 *
 * */
public class BusCostStrategy implements  TrafficCostStrategy{
    @Override
    public int cost(int distance) {
        if(distance<=0){
            return 0;
        }else if(distance<=10){
            return 1;
        }else if(distance<20){
            return 2;
        }else{
            int beyond =  (distance-20)/5;
            int more =  (distance-20)%5;
            if(more==0){
                return  2+beyond*1;
            }else {
                return  3+beyond*1;
            }
        }

    }

    @Override
    public String trafficCost(int amount) {
        return "两地之间乘坐公交需花费"+amount+"元";
    }
}
