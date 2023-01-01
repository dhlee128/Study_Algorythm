package SOL_2022_12_week4;

import java.util.Arrays;

public class Q1877 {

    public static int minPairSum(int[] nums) {
        int max = Integer.MIN_VALUE;

        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            max = Math.max(max, nums[i]+nums[nums.length-1-i]);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3,5,2,3};
        System.out.println(minPairSum(nums));
    }
}
