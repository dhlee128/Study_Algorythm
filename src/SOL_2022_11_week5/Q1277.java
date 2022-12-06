package SOL_2022_11_week5;

public class Q1277 {
    public static int countSquares(int[][] matrix) {

        int res = 0;

        int dp[][] = new int[matrix.length+1][matrix[0].length+1];
        for(int i=1; i<=matrix.length; i++) {
            for(int j=1; j<= matrix[i-1].length; j++) {
                if(matrix[i-1][j-1]==0) continue;
                dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i-1][j-1], dp[i][j-1]))+1;
                res+=dp[i][j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{0,1,1,1},
                            {1,1,1,1},
                            {0,1,1,1}};
        System.out.println(countSquares(matrix));
    }
}
