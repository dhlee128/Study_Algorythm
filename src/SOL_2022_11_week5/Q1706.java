package SOL_2022_11_week5;

import java.util.Arrays;

public class Q1706 {
    public static int[] findBall(int[][] grid) {
        int[] res = new int[grid[0].length];
        Arrays.fill(res, -1);

        for(int i=0; i<grid[0].length; i++) {
            boolean flag=false;
            int row = 0;
            int cur = i;
            while(row< grid.length) {
                if(grid[row][cur]==-1 && cur==0) break;
                if(grid[row][cur]==1 && cur==grid[0].length-1) break;
                if(grid[row][cur]==1 && grid[row][cur+1]==-1) break;
                if(grid[row][cur]==-1 && grid[row][cur-1]==1) break;

                if(grid[row][cur]==1)  cur++;
                if(grid[row][cur]==-1) cur--;

                row++;

                if(row==grid.length) flag=true;
            }
            if(flag) res[i]=cur;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] grid = {{1,1,1,-1,-1},{1,1,1,-1,-1},{-1,-1,-1,1,1},{1,1,1,1,-1},{-1,-1,-1,-1,-1}};
        System.out.println(findBall(grid));
    }
}
