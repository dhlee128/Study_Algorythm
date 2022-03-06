package SOL_2022_03_week2.최단_거리_구하기;

import java.io.*;

class Main {

    static int N; //배열 크기
    static boolean[][] map; //배열 정보
    static boolean[][] visited; //방문 여부
    static int res = Integer.MAX_VALUE; //최단 길이

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine()); //N X N 배열

        map = new boolean[N][N];

        for(int i=0;i<N;i++){
            String[] line = br.readLine().split(" ");
            for(int j=0;j<N;j++){
                map[i][j]=("1".equals(line[j]))?true:false;
            }
        }

        visited = new boolean[N][N];

        dfs(0,0,1);//(0,0)부터 시작

        if(res!=Integer.MAX_VALUE) System.out.println(res);
    }

    public static void dfs(int x, int y, int len){
        if(x<0 || x>=N || y<0 || y>=N) return; //배열을 벗어날때

        if(x==N-1 && y==N-1){ //도착지점
            res=Math.min(res,len);
            return;
        }

        if(map[x][y] && !visited[x][y]){
            visited[x][y]=true;
            dfs(x,y-1,len+1);//좌
            dfs(x+1,y,len+1);//하
            dfs(x, y+1,len+1);//우
            dfs(x-1,y,len+1);//상
            visited[x][y]=false;
        }
    }
}