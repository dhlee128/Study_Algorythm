package SOL_2023_01_week3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q138476 {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0)+1);
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((o1,o2)->o2.getValue().compareTo(o1.getValue()));

        for(Map.Entry<Integer, Integer> entry : list) {
            answer++;
            k-=entry.getValue();
            if(k<=0) break;
        }
        return answer;
    }
}
