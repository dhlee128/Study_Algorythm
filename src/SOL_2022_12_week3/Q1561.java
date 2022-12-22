package SOL_2022_12_week3;

import java.util.Arrays;

public class Q1561 {
    public static int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int head = 0;
        int tail = piles.length-1;

        int sum = 0;
        while(head<tail){
            head++;
            tail--;
            sum+=piles[tail--];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] piles = {2,4,1,2,7,8};
        System.out.println(maxCoins(piles));
    }
}
