package SOL_2023_01_week4;

import java.util.LinkedList;
import java.util.Queue;

public class Q86971 {
    public static void main(String[] args) {
        int n = 9;
        int[][] wires = {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};

        System.out.println(solution(n, wires));
    }
    public static int solution(int n, int[][] wires) {
        int ans = n;
        int[][] arr  = new int[n+1][n+1];

        //송전탑 초기화
        for(int i=0; i<wires.length; i++) {
            arr[wires[i][0]][wires[i][1]]=1;
            arr[wires[i][1]][wires[i][0]]=1;
        }

        for(int i=0; i<wires.length; i++) {
            int s = wires[i][0];
            int e = wires[i][1];

            //송전탑 끊음
            arr[s][e] = 0;
            arr[e][s] = 0;

            ans = Math.min(ans, bfs(n, arr, s));

            //송전탑 이어줌
            arr[s][e] = 1;
            arr[e][s] = 1;
        }

        return ans;
    }

    public static int bfs(int n, int[][] arr, int start) {
        int cnt = 1;

        boolean[] visited = new boolean[n+1];

        Queue<Integer> q = new LinkedList<>();

        q.offer(start);

        while(!q.isEmpty()) {
            int temp = q.poll();
            visited[temp]=true;

            for(int i=1; i<=n; i++) {
                if(visited[i]) continue;
                if(arr[temp][i]==1) {
                    cnt++;
                    q.offer(i);
                }
            }
        }
        return Math.abs((n-cnt)-cnt);
    }

}
