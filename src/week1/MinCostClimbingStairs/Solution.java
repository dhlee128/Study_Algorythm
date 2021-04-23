package week1.MinCostClimbingStairs;

public class Solution {

    public static void main(String[] args) {
        int[] cost1={10,15,20};
        System.out.println(minCostClimbingStairs(cost1));

        int[] cost2={1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(cost2));
    }
    public static int minCostClimbingStairs(int[] cost) {
        //i번째 계단 비용 cost[i]
        //i번째 계단에 가기 위해서는 (i-1)번째 최소비용+cost[i] or (i-2)번째 최소비용+cost[i] 중에 작은 값

        int minCost[]=new int[cost.length];
        minCost[0]=cost[0];
        minCost[1]=cost[1];

        int i=2;
        while(i<cost.length){
            minCost[i]=Math.min(minCost[i-1]+cost[i],minCost[i-2]+cost[i]);
            i++;
        }
        //... cost.length-2번째와 cost.length-1번째 둘중 하나에서 도착
        return Math.min(minCost[cost.length-2],minCost[cost.length-1]);
    }
}
