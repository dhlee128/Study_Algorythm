package SOL_2023_01_week1;

import java.util.Arrays;

public class Q1833 {
    public static int maxIceCream(int[] costs, int coins) {
        int cnt = 0;
        int sum = 0;

        Arrays.sort(costs);
        for(int i=0; i<costs.length; i++) {
            sum+=costs[i];
            cnt++;
            if(sum>coins) {
                cnt--;
                break;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] costs = {10,6,8,7,7,8};
        int coins = 5;
        System.out.println(maxIceCream(costs, coins));
    }
}
