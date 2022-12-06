package SOL_2022_11_week5;

public class Q221 {
    public static int maximalSquare(char[][] matrix) {
        int[][] dp = new int[matrix.length+1][matrix[0].length+1];
        int max = 0;

        for(int i=1; i<=matrix.length; i++) {
            for(int j=1; j<=matrix[i-1].length; j++) {
                if(matrix[i-1][j-1]=='0') continue;
                dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i-1][j-1], dp[i][j-1]))+1;
                max = Math.max(max, dp[i][j]);
                show(dp);
            }
        }
        return max*max;
    }
    public static void show(int[][] dp) {
        for(int i=0; i<dp.length; i++) {
            for(int j=0; j<dp[i].length; j++) {
                System.out.print(dp[i][j] + ",");
            }
            System.out.println("");
        }
        System.out.println("================");

    }

    public static void main(String[] args) {
        char[][] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(maximalSquare(matrix));
    }
}
