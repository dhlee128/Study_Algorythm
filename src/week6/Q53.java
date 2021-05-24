package week6;

public class Q53 {

    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    static int max;
    public static int maxSubArray(int[] nums) {

        max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            find(nums,i);
        }

        return max;
    }

    public static void find(int[] nums, int start) {

        for(int i=start;i<nums.length;i++){
            int sum=0;
            int end=i;
            for(int j=start;j<=end;j++){
                sum+=nums[j];
            }
            max=Math.max(max,sum);
        }
    }
}
