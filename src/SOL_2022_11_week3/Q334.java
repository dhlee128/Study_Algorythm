package SOL_2022_11_week3;

public class Q334 {
    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        
        for(int i=0; i<nums.length; i++) {
            if(first>=nums[i]) {
                first = nums[i];
            } else if(second>=nums[i]) {
                second = nums[i];
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(increasingTriplet(nums));
    }
}
