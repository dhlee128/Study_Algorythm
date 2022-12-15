package week12;

public class Q413 {
    public static int longestArithSeqLength(int[] nums) {
        int cnt = 0;
        int res = 0;

        for(int i=2; i<nums.length; i++) {
            if(nums[i-1]-nums[i-2]==nums[i]-nums[i-1]) {
                cnt++;
                res+=cnt;
            } else {
                cnt = 0;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {9,4,7,2,10};
        System.out.println(longestArithSeqLength(nums));
    }
}
