package SOL_2022_12_wek1;

public class Q718 {
    public static int findLength(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length][nums2.length];
        int res = 0;

        for(int i=0; i<nums1.length; i++) {
            for(int j=0; j<nums2.length; j++) {
                if(nums1[i]==nums2[j]) {
                    if(i==0 || j==0) {
                        dp[i][j]=1;
                    } else {
                        dp[i][j] = dp[i-1][j-1]+1;
                    }
                    res = Math.max(res,dp[i][j]);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,2,1};
        int[] nums2 = {3,2,1,4,7};

        System.out.println(findLength(nums1, nums2));
    }
}
