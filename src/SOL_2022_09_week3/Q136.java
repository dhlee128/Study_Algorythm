package SOL_2022_09_week3;

import java.util.HashMap;

public class Q136 {

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {

        int res = 1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length ;i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(Integer key : map.keySet()){
            if(map.get(key) == 1) res = key;
        }

        return res;
    }
}
