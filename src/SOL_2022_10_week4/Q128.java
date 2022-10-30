package SOL_2022_10_week4;

import java.util.Arrays;

public class Q128 {

    public static int longestConsecutive(int[] nums) {

        if(nums.length==0) return 0;

        int res = 1;
        int max = 1;

        Arrays.sort(nums);

        for(int i=0; i<nums.length-1; i++) {
            if(nums[i]+1==nums[i+1]) {
                max++;
            } else if(nums[i]==nums[i+1]) {
                continue;
            }else{
                max = 1;
            }
            res = Math.max(max, res);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
}
