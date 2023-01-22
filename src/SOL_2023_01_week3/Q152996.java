package SOL_2023_01_week3;

import java.util.*;

public class Q152996 {

    public static void main(String[] args) {
        int[] weights = {100,180,360,100,270};
        System.out.println(new Solution().solution(weights));
    }

    static class Solution {
        public long solution(int[] weights) {
            long answer = 0;

            Map<Integer, List<Integer>> map = new HashMap<>();
            Set<Integer> set = new HashSet<>();

            for(int i=0; i<weights.length; i++) {
                if(map.containsKey(weights[i])) {
                    map.get(weights[i]).add(i);
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);

                    map.put(weights[i], list);
                }
                set.add(weights[i]);
            }

            for(int num : set) {
                int dup = map.get(num).size();

                int[] array = new int[6];
                if(num*2%3 == 0) array[0] = num*2/3;
                if(num*2%4 == 0) array[1] = num*2/4;
                if(num*3%2 == 0) array[2] = num*3/2;
                if(num*3%4 == 0) array[3] = num*3/4;
                if(num*4%2 == 0) array[4] = num*4/2;
                if(num*4%3 == 0) array[5] = num*4/3;

                for(int i=0; i<6; i++) {
                    if(map.containsKey(array[i])) {
                        answer+=(long)map.get(array[i]).size()*dup;
                    }
                }
                if(dup>1) answer+=(long)dup*(dup-1)/2;
                map.remove(num);
            }

            return answer;
        }
    }
}
