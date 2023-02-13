package SOL_2023_02_week2;

import java.lang.reflect.Array;
import java.util.*;

public class Q132266 {
    List<List<Integer>> graph;
    int[] dis;

    public static void main(String[] args) {
        Q132266 q = new Q132266();
        int n = 3;
        int[][] roads = {{1,2},{2,3}};
        int[] sources = {2,3};
        int destination = 1;

        q.solution(n, roads, sources, destination);
    }

    public int[] solution(int n, int[][] roads, int[] sources, int destination) {

        dis = new int[n];
        Arrays.fill(dis,Integer.MAX_VALUE);

        graph = new ArrayList<>();
        for(int i=0; i<=n; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<roads.length; i++) {
            int s = roads[i][0];
            int e = roads[i][1];

            graph.get(s).add(e);
            graph.get(e).add(s);
        }

        dijkstra(destination);

        int[] ans = new int[sources.length];
        for(int i=0; i<sources.length;i++) {
            ans[i] = dis[sources[i]-1]==Integer.MAX_VALUE?-1:dis[sources[i]-1];
        }

        return ans;
    }

    public void dijkstra(int destination){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(destination);
        dis[destination-1] = 0;

        while (!queue.isEmpty()) {
            int des = queue.poll();
            for(int i=0; i<graph.get(des).size(); i++) {
                int n = graph.get(des).get(i);

                if(dis[n-1]>dis[des-1]+1) {
                    dis[n-1]=dis[des-1]+1;
                    queue.add(n);
                }
            }
        }
    }
}
