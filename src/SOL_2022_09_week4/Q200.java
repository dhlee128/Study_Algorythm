package SOL_2022_09_week4;

//200. Number of Islands
//https://leetcode.com/problems/number-of-islands/
public class Q200 {

    public static void main(String[] args) {

        char[][] grid = {{'1', '1', '0', '1', '0'}
                        ,{'1', '1', '0', '0', '0'}
                        ,{'0', '0', '0', '0', '0'}};


        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {

        char num = '2';
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1') { //시작점
                    numIslandsCal(grid, num, i, j);
                    num++;
                }
            }
        }

        int max = 0;
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[i].length;j++){
                max = Math.max(max, grid[i][j]-'0'-1); //grid는 char형
            }
        }

        return max;
    }

    public static void numIslandsCal(char[][] grid, char num, int x, int y) {

        if(grid[x][y] == '1') { //뭏이 아닐 경우만 탐색
            grid[x][y] = num; // 하나의 섬은 동일한 char 숫자를갖는다.
            if(x-1>=0) numIslandsCal(grid, num, x-1, y);
            if(x+1<grid.length) numIslandsCal(grid, num, x+1, y);
            if(y-1>=0) numIslandsCal(grid, num, x, y-1);
            if(y+1<grid[0].length) numIslandsCal(grid, num, x, y+1);
        }
    }
}
