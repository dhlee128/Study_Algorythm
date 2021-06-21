package week10;

//55. Jump Game
public class Q55 {
    public static void main(String[] args) {
        int[] nums={1,2};
        System.out.println(canJump(nums));
    }

    static boolean flag=false;
    public static boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        jump(nums,nums.length-1);
        return flag;
    }

    public static void jump(int[] nums, int idx){

        for(int i=0; i<idx; i++){
            for(int j=1;j<=nums[i];j++){
                if(i+j==idx){
                    if(i==0) flag=true;
                    jump(nums, i);
                }
            }
        }
    }
}
