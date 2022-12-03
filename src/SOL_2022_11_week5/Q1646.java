package SOL_2022_11_week5;

import java.util.Arrays;

public class Q1646 {
    public static int getMaximumGenerated(int n) {
        if(n<2) return n;

        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;

        for(int i=2; i<=n; i++) {
            if(i%2==0) {
                 dp[i] = dp[i/2];
            } else {
                dp[i] = dp[i/2]+dp[i/2+1];
            }
        }

        return Arrays.stream(dp).max().getAsInt();
    }

    public static void main(String[] args) {
        int n=7;
        System.out.println(getMaximumGenerated(n));
    }
}
