package SOL_2022_10_week4;

import java.util.*;

public class Q347 {

    class Number {
        int num;
        int cnt;
        public Number(int num, int cnt) {
            this.num = num;
            this.cnt = cnt;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int num = nums[i];
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        List<Number> list = new ArrayList<>();
        for(int key:map.keySet()) {
            list.add(new Number(key, map.get(key)));
        }
        Collections.sort(list, (a, b) -> b.cnt-a.cnt);

        int[] res = new int[k];
        for(int i=0; i<k; i++) {
            res[i]=list.get(i).num;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(new Q347().topKFrequent(nums, k));
    }
}
