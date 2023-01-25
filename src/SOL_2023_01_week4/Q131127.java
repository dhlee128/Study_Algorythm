package SOL_2023_01_week4;

import java.util.HashMap;
import java.util.Map;

public class Q131127 {
    public static int solution(String[] want, int[] number, String[] discount) {
        int answer =0;

        Map<String, Integer> wantMap = new HashMap<>();
        Map<String, Integer> disMap = new HashMap<>();

        for(int i=0; i<number.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        for(int i=0; i<10; i++) {
            String pro = discount[i];
            disMap.put(pro, disMap.getOrDefault(pro, 0)+1);
        }

        if(idEquals(wantMap, disMap)) {
            answer++;
        }

        for(int i=1; i<=discount.length-10; i++) {
            String temp = discount[i-1];
            String add = discount[i+10-1];

            disMap.put(temp, disMap.get(temp)-1);
            disMap.put(add, disMap.getOrDefault(add, 0)+1);

            if(idEquals(wantMap, disMap)) answer++;
        }

        return answer;
    }

    private static boolean idEquals(Map<String, Integer> wantMap, Map<String, Integer> disMap) {

        for (String key : wantMap.keySet()) {
            if (!disMap.containsKey(key) || wantMap.get(key) != disMap.get(key)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        System.out.println(solution(want, number, discount));

    }
}
