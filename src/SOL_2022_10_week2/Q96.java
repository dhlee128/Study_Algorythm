package SOL_2022_10_week2;

//96. Unique Binary Search Trees
public class Q96 {
    public static int numTrees(int n) {
        int cnt = 0;

        if(n<3) return n;

        int dp[] = new int[n+1];

        dp[0]=1; dp[1]=1;
        dp[2]=2;

        //n=3, (r=1/dp[0],dp[2]) (r=2/dp[1],dp[1]) (r=3/dp[2],dp[0]) ::5
        //n=4, (r=1/dp[0],dp[3]) (r=2/dp[1],dp[2]) (r=3/dp[2],dp[1]) (r=4/dp[3],dp[0])
        for(int i=3; i<=n; i++) {
            for(int j=0; j<i; j++) {
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(numTrees(n));
    }
}
