package SOL_2022_12_week4;

import java.util.Arrays;

public class Q2294 {
    public static int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int cnt = 1;
        int prev = 0;

        for(int i=1;i<nums.length; i++) {
            if(nums[i]-nums[prev]<=k) continue;
            prev=i;
            cnt++;
        }

        return cnt;
    }

    public static void main(String[] args) {
        int[] nums = {3,6,1,2,5};//1 2 3 5 6
        int k = 2;

        System.out.println(partitionArray(nums, k));
    }
}
