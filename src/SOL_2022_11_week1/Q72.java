package SOL_2022_11_week1;

public class Q72 {
    public static int minDistance(String word1, String word2) {
        int word1Len = word1.length();
        int word2Len = word2.length();

        int[][] dp = new int[word2Len+1][word1Len+1];

        for(int i=0; i<=word2Len; i++) {
            for(int j=0; j<=word1Len; j++) {
                if(i==0) {
                    dp[i][j]=j;
                } else if(j==0) {
                    dp[i][j]=i;
                } else {
                    if(word1.charAt(j-1)==word2.charAt(i-1)) {
                        dp[i][j]=dp[i-1][j-1];
                    } else {
                        int min = Math.min(dp[i-1][j], dp[i][j-1]);
                        min = Math.min(min, dp[i-1][j-1]);
                        dp[i][j] = min+1;
                    }
                }
            }
        }
        return dp[word2Len][word1Len];
    }

    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "ros";

        System.out.println(minDistance(word1, word2));
    }
}
