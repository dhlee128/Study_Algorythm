package SOL_2022_11_week2;

public class Q289 {

    public void gameOfLife(int[][] board) {
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1,0, 1};
        // 0 -> 죽음, 2 -> 살아있다가 죽음
        // 1 -> 살아있음, 3 -> 죽어있다가 살아남
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                int live = 0;
                int die = 0;
                for(int k=0; k<8; k++) {
                    int x = i+dx[i];
                    int y = j+dy[j];
                    if(x<0 || y<0 || x==board.length || y==board[i].length) continue;

                    if(board[x][y]==0 || board[x][y]==3) {
                        die++;
                    } else {
                        live++;
                    }
                }

                if(board[i][j]==0 || board[i][j]==3) {
                    if(live==3) board[i][j] = 3;
                } else {
                    if(live<2 || live>3) board[i][j] = 2 ;
                }
            }
        }
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                board[i][j]%=2;
            }
        }
    }
}
