package SOL_2022_09_week5;

//35. Search Insert Position
public class Q35 {
    public static int searchInsert(int[] nums, int target) {

        if(target < nums[0]) return 0;

        for(int i=0;i<nums.length;i++) {
            if(nums[i]>=target) {
                return i;
            }
        }

        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;

        System.out.println(searchInsert(nums, target));
    }
}
