package SOL_2022_12_week4;

import java.util.Arrays;

public class Q1029 {

    public static int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,(a, b)->{
            return (a[0]-a[1])-(b[0]-b[1]);
        });
        int sum = 0;
        for(int i=0; i<costs.length/2; i++) {
            sum+=(costs[i][0]+costs[costs.length-1-i][1]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] costs = {{10,20},{30,200},{400,50},{30,20}};
        System.out.println(twoCitySchedCost(costs));
    }
}
