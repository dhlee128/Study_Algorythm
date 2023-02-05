package SOL_2023_02_week1;

import java.util.*;

public class Q154540 {
    public static void main(String[] args) {
        String[] maps = {"X591X","X1X5X","X231X", "1XXX1"};
        solution(maps);
    }

    public static int[] solution(String[] maps) {
        List<Integer> days = new ArrayList<>();

        int x = maps.length;
        int y = maps[0].length();
        boolean [][] visited = new boolean[x][y];

        for(int i=0; i<x; i++) {
            for(int j=0; j<y; j++) {
                if(maps[i].charAt(j)!='X' && !visited[i][j]) {
                    visited[i][j]=true;
                    int day = dfs(maps, i, j, visited);
                    days.add(day);
                }
            }
        }

        if(days.isEmpty()) {
            int[] re = {-1};
            return re;
        }

        Collections.sort(days);
        return days.stream().mapToInt(i->i).toArray();
    }

    public static int dfs(String[] maps, int xxx, int yyy, boolean[][] visited) {
        int[] xx = {-1, 0, 0, 1};
        int[] yy = {0, -1, 1, 0};
        int day = maps[xxx].charAt(yyy)-49;

        for(int i=0; i<4; i++) {
            int x = xxx + xx[i];
            int y = yyy+ yy[i];
            if(x>=0 && x<maps.length && y>=0 && y<maps[0].length()) {
                if(maps[x].charAt(y)!='X' && !visited[x][y]) {
                    visited[x][y]=true;
                    day += dfs(maps, x, y, visited);
                }
            }
        }
        return day;
    }
}
