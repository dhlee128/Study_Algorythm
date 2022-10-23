package SOL_2022_10_week3;

public class Q34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        System.out.println(searchRange(nums, target)[0]);
    }

    public static int[] searchRange(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;
        int m = 0;

        int[] ans ={-1,-1};

        while(left <= right) {
            m = (left + right) / 2;

            if(nums[m] == target) {
                ans[0] = m;
            }

            if(nums[m] >= target) right = m - 1;
            if(nums[m] < target) left = m + 1;
        }

        left = 0;
        right = nums.length-1;
        while(left <= right) {
            m = (left + right) / 2;

            if(nums[m] == target) {
                ans[1] = m;
            }

            if(nums[m] > target) right = m - 1;
            if(nums[m] <= target) left = m + 1;
        }

        return ans;
    }
}
