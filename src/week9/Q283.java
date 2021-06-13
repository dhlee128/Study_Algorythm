package week9;

//283. Move Zeroes
public class Q283 {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int idx=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[idx++]=nums[i];
            }
        }
        while(idx!=nums.length){
            nums[idx++]=0;
        }
    }
}
