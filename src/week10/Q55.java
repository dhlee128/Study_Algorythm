package week10;

//55. Jump Game
public class Q55 {
    public static void main(String[] args) {
        int[] nums={3,0,8,2,0,0,1};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        int idx=nums.length-1;

        if(idx==-1) return true;

        for(int i=idx-1;i>=0;i--){
            if(nums[i]+i>=idx) idx=i;
        }

        if(idx==0) return true;

        return false;
    }
}
