package SOL_2023_02_week2;

public class Q92344 {
    public static int solution(int[][] board, int[][] skill) {
        int x = board.length;
        int y = board[0].length;

        int[][] board2 = new int[x+1][y+1];

        for(int i=0; i<skill.length; i++) {
            int type = skill[i][0];

            int sx = skill[i][1];
            int sy = skill[i][2];

            int ex = skill[i][3];
            int ey = skill[i][4];

            int de = skill[i][5] * (type == 1 ? -1 : 1);

            board2[sx][sy] += de;
            board2[sx][ey+1] -= de;
            board2[ex+1][ey+1] += de;
            board2[ex+1][sy] -= de;
        }

        for(int i=0; i<x; i++) {
            for(int j=1; j<y; j++) {
                board2[i][j]+=board2[i][j-1];
            }
        }

        for(int i=1; i<x; i++) {
            for(int j=0; j<y; j++) {
                board2[i][j]+=board2[i-1][j];
            }
        }

        int res = 0;

        for(int i=0; i<x; i++) {
            for(int j=0; j<y; j++) {
                board[i][j]+=board2[i][j];

                if(board[i][j]>=1) res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] board = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] skill = {{1,1,1,2,2,4},{1,0,0,1,1,2},{2,2,0,2,0,100}};
        System.out.println(solution(board, skill));
    }
}
