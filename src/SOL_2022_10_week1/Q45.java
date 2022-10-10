package SOL_2022_10_week1;

//45. Jump Game II
public class Q45 {
    public int jump(int[] nums) {

        int[] dp = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0]=0;
        for(int i=0; i<nums.length; i++) {
            for(int j=1; j<=nums[i] && i+j<nums.length; j++) {
                dp[i+j] = Math.min(dp[i+j], dp[i]+1);
            }
        }
        return dp[nums.length-1];
    }
}
