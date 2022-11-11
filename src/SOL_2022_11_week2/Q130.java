package SOL_2022_11_week2;

//130. Surrounded Regions
public class Q130 {
    public static void solve(char[][] board) {
        boolean[][] visited = new boolean[board.length][board[0].length];

        for(int i=0; i<board.length; i++) {
           for(int j=0; j<board[i].length; j++) {
               if(i==0 || j==0 || i==board.length-1 || j==board[0].length-1) {
                   char c = board[i][j];
                   if(c=='O') cal(board, visited, i, j);
               }
           }
        }

        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                if(board[i][j]=='O' && !visited[i][j]) board[i][j]='X';
            }
        }
    }

    public static void cal(char[][] board, boolean[][] vidited, int x, int y) {
        if(vidited[x][y]) return;
        vidited[x][y] = true;

        int[] dx = {-1,0,0,1};
        int[] dy = {0,-1,1,0};

        for(int k=0; k<4; k++) {
            int xx = x+dx[k];
            int yy = y+dy[k];
            if(xx<0 || yy<0 || xx==board.length || yy==board[0].length) continue;
            if(board[xx][yy]=='O') cal(board, vidited, xx, yy);
        }
    }

    public static void main(String[] args) {
        char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        solve(board);
    }
}
