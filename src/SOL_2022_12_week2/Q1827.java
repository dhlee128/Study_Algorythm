package SOL_2022_12_week2;

public class Q1827 {
    public static int minOperations(int[] nums) {

        int res = 0;

        if(nums.length==1) return res;

        for(int i=0; i<nums.length-1; i++) {
            if(nums[i]>=nums[i+1]) {
                int temp = nums[i]-nums[i+1]+1;
                nums[i+1] += temp;
                res+=temp;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {7,4,2,8,1,7,7,10};
        System.out.println(minOperations(nums));
    }
}
