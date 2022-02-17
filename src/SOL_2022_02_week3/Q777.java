package SOL_2022_02_week3;

import java.util.HashMap;
import java.util.Map;

//997. Find the Town Judge
public class Q777 {

    public static void main(String[] args) {
        int n = 2;
        int[][] trust = {{1,2}};

        System.out.println(findJudge(n,trust));
    }

    public static int findJudge(int n, int[][] trust) {
        Map<Integer, Integer> startMap = new HashMap<>();
        Map<Integer, Integer> endMap = new HashMap<>();

        for(int i=0;i< trust.length;i++){
            startMap.put(trust[i][0], startMap.getOrDefault(trust[i][0],0)+1);
            endMap.put(trust[i][1], endMap.getOrDefault(trust[i][1],0)+1);
        }

        for(int i=1;i<=n;i++){//1~n 범위의 사람들 중
            if(startMap.getOrDefault(i,0)==0 && endMap.getOrDefault(i,0)==n-1){//판사는 아무도 믿으면 안되고, 모두(판사제외)가 판사를 믿어야 함
                return i;
            }
        }

        return -1;
    }
}
