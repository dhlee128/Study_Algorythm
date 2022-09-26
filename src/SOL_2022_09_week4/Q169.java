package SOL_2022_09_week4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q169 {

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {

        int len = nums.length/2;

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>len) return nums[i];
        }
        return -1;
    }
}
