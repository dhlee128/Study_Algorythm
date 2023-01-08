package SOL_2023_01_week1;

import java.util.*;

public class Q2192 {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {

        List<List<Integer>> graph = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<n; i++) {
            graph.add(new ArrayList<>());
            ans.add(new ArrayList<>());
        }

        for(int i=0; i<edges.length; i++) {
            int from = edges[i][0];
            int to = edges[i][1];

            graph.get(from).add(to);
        }

        for (int i=0; i<n; i++) {
            dfs(graph, i, i, ans);
        }
        return ans;
    }
    //{3,4}{3}{4,7}{5,6,7}{6}{}{}{}
    public void dfs(List<List<Integer>> graph, int anc, int cur, List<List<Integer>> ans) {
        for(int next:graph.get(cur)) {
            if(ans.get(next).size()==0 || ans.get(next).get(ans.get(next).size()-1)!=anc) {
                ans.get(next).add(anc);
                dfs(graph, anc, next, ans);
            }
        }
    }
}
