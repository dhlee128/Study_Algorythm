package SOL_2022_12_week2;

import java.util.LinkedList;
import java.util.Queue;

public class Q542 {

    public static int[][] updateMatrix(int[][] mat) {
        int[][] ans = new int[mat.length][mat[0].length];
        int[] dx = {0,-1,1,0};
        int[] dy = {1,0,0,-1};
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[mat.length][mat[0].length];

        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[0].length; j++) {
                if(mat[i][j]==0) {
                    queue.offer(new int[]{i,j});
                    visited[i][j] = true;
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] temp = queue.poll();

            for(int i=0; i<4; i++) {
                int x = temp[0]+dx[i];
                int y = temp[1]+dy[i];
                if(x<0 || y<0 || x>=mat.length || y>=mat[0].length) continue;
                int dis = ans[temp[0]][temp[1]];

                if(!visited[x][y]) {
                    visited[x][y]=true;
                    ans[x][y] = dis+1;
                    queue.add(new int[]{x,y});
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] mat = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(updateMatrix(mat));
    }
}
