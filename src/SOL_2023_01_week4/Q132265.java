package SOL_2023_01_week4;

import java.util.Set;
import java.util.HashSet;

public class Q132265 {
    public int solution(int[] topping) {
        int answer = 0;

        int len = topping.length;

        Set<Integer> setR = new HashSet<>();
        Set<Integer> setL = new HashSet<>();

        int[] arrR = new int[len];
        int[] arrL = new int[len];

        for(int i=0;i<len; i++) {
            setL.add(topping[i]);
            setR.add(topping[len-i-1]);

            arrL[i]=setL.size();
            arrR[len-1-i]=setR.size();
        }
        //1, 2, 1, 3, 1, 4, 1, 2
        //L -> 1 2 2 3 3 4 4 4
        //R -> 4 4 4 4 3 3 2 1
        for(int i=0; i<len-1; i++) {
            if(arrL[i]==arrR[i+1]) answer++;
        }

        return answer;
    }
}
