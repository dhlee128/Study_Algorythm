package week12;

import java.util.Arrays;

public class Q976 {
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int num = nums.length;

        for(int i=num-1; i>=2; i--) {
            if(nums[i]<nums[i-1]+nums[i-2]) {
                return nums[i]+nums[i-1]+nums[i-2];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,10};
        System.out.println(largestPerimeter(nums));
    }
}
