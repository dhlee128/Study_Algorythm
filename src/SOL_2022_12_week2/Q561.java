package SOL_2022_12_week2;

import java.util.Arrays;

public class Q561 {
    public static int arrayPairSum(int[] nums) {
        int res = 0;

        Arrays.sort(nums);

        for(int i=0; i<nums.length-1; i+=2) {
            res += Math.min(nums[i], nums[i+1]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {6,2,6,5,1,2};
        System.out.println(arrayPairSum(nums));
    }
}
