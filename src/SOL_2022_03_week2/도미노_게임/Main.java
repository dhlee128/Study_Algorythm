package SOL_2022_03_week2.도미노_게임;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Main {

    static boolean[] visited;
    static Map<String,String> infoActionMap;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");

        int nDomino = Integer.parseInt(inputs[0]); //도미노개수
        int nAction = Integer.parseInt(inputs[1]); //연결된 도미노 정보 수
        int nStart = Integer.parseInt(inputs[2]); //손을 사용한 횟수

        infoActionMap = new HashMap<>(); //연결된 도미노 정보

        for(int i=0;i<nAction;i++){
            String[] infoActions = br.readLine().split(" ");

            infoActionMap.put(infoActions[0],infoActions[1]);
        }

        String[] start = new String[nStart]; //손을 사용한 도미노 시작점

        for(int i=0;i<nStart;i++){
            start[i] = br.readLine();
        }

        visited = new boolean[nDomino+1]; //도미노가 쓰러졌는가

        for(int i=0;i<nStart;i++){
            domino(start[i]);
        }

        int cnt = 0; //쓰러진 도미노 개수
        for(int i=1;i<=nDomino;i++){
            if(visited[i]) cnt++;
        }

        System.out.println(cnt);
    }

    public static void domino(String s){
        int start = Integer.parseInt(s);
        if(!visited[start]){
            visited[start]=true;
            if(infoActionMap.get(s)!=null) domino(infoActionMap.get(s));
        }
    }
}