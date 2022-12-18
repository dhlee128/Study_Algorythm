package SOL_2022_12_week2;

public class Q494 {

    static int res = 0;

    public static int findTargetSumWays(int[] nums, int target) {

        DFS(nums, target, 0, 0);
        return res;
    }

    public static void DFS(int[] nums, int target, int curr, int index) {
        if(index==nums.length) {
            if(curr==target) res++;
            return;
        }
        DFS(nums, target, curr+nums[index], index+1);
        DFS(nums, target, curr-nums[index], index+1);
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int target = 3;
        System.out.println(findTargetSumWays(nums, target));
    }
}
