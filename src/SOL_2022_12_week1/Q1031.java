package SOL_2022_12_week1;

public class Q1031 {

    public static int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {

        int[] sum = new int[nums.length + 1];
        for (int i = 0; i< nums.length; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }

        return Math.max(solve1(firstLen, secondLen, sum), solve1(secondLen, firstLen, sum));
    }

    public static int solve1(int len1, int len2, int[] sum) {

        int maxF = 0;
        int s = 0;
        for (int i = len1 + len2; i <sum.length;i++) {
            maxF = Math.max(maxF, sum[i - len2] - sum[i - len2 - len1]);
            s = Math.max(s , maxF + sum[i] - sum[i - len2]);
        }

        return s;
    }

    public static void main(String[] args) {
        int[] nums = {0,6,5,2,2,5,1,9,4};
        int firstLen = 1;
        int secondLen = 2;

        System.out.println(maxSumTwoNoOverlap(nums, firstLen, secondLen));
    }

}
