package SOL_2023_02_week3;

public class Q49994 {
    public int solution(String dirs) {
        int answer = 0;

        int[] dx = {-1, 0, 1, 0};//U L D R
        int[] dy = {0, -1, 0, 1};

        int[][] maps = new int[11][11];
        int x=5;
        int y=5;

        boolean[][][] visited = new boolean[11][11][4];

        for(int i=0; i<dirs.length(); i++) {
            char c = dirs.charAt(i);
            int d=0;

            if(c=='U') {
                d=0;
            } else if(c=='L') {
                d=1;
            } else if(c=='D') {
                d=2;
            } else if(c=='R') {
                d=3;
            }
            int xx = x+dx[d];
            int yy = y+dy[d];

            if(xx<0||xx>=11||yy<0||yy>=11) continue;

            if(!visited[xx][yy][d]) {
                visited[xx][yy][d]=true;
                d=(d%2==0)?2-d:4-d;
                visited[x][y][d]=true;
                answer++;
            }
            x=xx;
            y=yy;
        }
        return answer;
    }
}
