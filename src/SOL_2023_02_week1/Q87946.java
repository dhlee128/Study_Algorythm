package SOL_2023_02_week1;

public class Q87946 {
    int answer = 0;

    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];

        dfs(k, dungeons, visited, 0);

        return answer;
    }

    public void dfs(int k, int[][] dungeons, boolean[] visited, int cnt) {

        answer = Math.max(answer, cnt);

        for(int i=0; i<dungeons.length; i++) {
            if(k>=dungeons[i][0] && !visited[i]) {
                visited[i] = true;
                cnt++;
                dfs(k-dungeons[i][1], dungeons, visited, cnt);
                cnt--;
                visited[i] = false;
            }
        }
    }
}
