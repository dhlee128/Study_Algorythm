package SOL_2023_01_week1;

import java.util.Arrays;

public class Q945 {
    public static int minIncrementForUnique(int[] nums) {
        //1 1 2 2 3 7
        int res = 0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++) {
            while(nums[i]>=nums[i+1]) {
                nums[i+1]++;
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,2,1,7};
        System.out.println(minIncrementForUnique(nums));
    }
}
