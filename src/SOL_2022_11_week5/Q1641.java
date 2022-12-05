package SOL_2022_11_week5;

public class Q1641 {
    public static int countVowelStrings(int n) {
        int[][] dp = new int[n][5];

        for(int i=0; i<5; i++) {
            dp[0][i]=i+1;
        }
        for(int i=1; i<n; i++) {
            dp[i][0]=1;
            for(int j=1; j<5; j++) {
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        for(int i=0; i<dp.length; i++) {
            for(int j=0; j<dp[i].length; j++) {
                System.out.print(dp[i][j]+", ");
            }
            System.out.println();
        }
        return dp[n-1][4];
    }

    public static void main(String[] args) {
        int n=2;
        System.out.println(countVowelStrings(n));
    }
}
