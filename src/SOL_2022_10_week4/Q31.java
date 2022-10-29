package SOL_2022_10_week4;

public class Q31 {
    public static void nextPermutation(int[] nums) {

        int index1=-1;
        for(int i=nums.length-1; i>0; i--) {
            if(nums[i]>nums[i-1]){
                index1 = i-1;
                break;
            }
        }

        if(index1==-1) {
            reverse(nums, index1+1);
            return;
        }

        int index2=index1;
        int min = 101;
        for(int i=index1+1; i<nums.length; i++) {
            if(nums[index1]<nums[i] && min>=nums[i]) {
                min = nums[i];
                index2 = i;
            }
        }
        swap(nums, index1, index2);
        reverse(nums, index1+1);
    }

    public static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public static void reverse(int[] nums, int index1) {

        int index2 = nums.length-1;//end index

        while(index1<index2) {
            swap(nums, index1++, index2--);
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,3,3};
        nextPermutation(nums);

        for(int i=0; i<nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
