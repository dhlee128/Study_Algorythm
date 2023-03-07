package SOL_2023_03_week1;

public class Q12905 {
    public int solution(int [][]board)
    {
        int answer = Integer.MIN_VALUE;

        int[][] dp = new int[board.length][board[0].length];

        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                if(board[i][j]==0) continue;

                if(i==0||j==0) {
                    dp[i][j]=board[i][j];
                } else {
                    dp[i][j]=Math.min(dp[i-1][j-1], Math.min(dp[i-1][j],dp[i][j-1]))+1;
                }
                answer=Math.max(answer, dp[i][j]);
            }
        }

        if(answer==Integer.MIN_VALUE) return 0;

        return answer*answer;
    }
}
