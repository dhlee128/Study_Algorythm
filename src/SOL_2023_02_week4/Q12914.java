package SOL_2023_02_week4;

public class Q12914 {
    //1 => 1
    //2 => 2
    //3 => 3
    //4 => 5
    //5 => 11111, 1112, 1121, 1211, 2111, 221, 212, 122 => 8
    public long solution(int n) {
        int[] dp = new int[n+1];

        if(n==1) return 1;

        dp[1]=1;
        dp[2]=2;

        for(int i=3; i<=n; i++) {
            dp[i] = (dp[i-1]+dp[i-2])%1234567;
        }

        return dp[n];
    }
}
