package week6;
//53. Maximum Subarray
public class Q53 {

    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){//합을 구하기위한 연속된 배열 시작은 0이상
                int sum=0;
                for(int j=i;j<nums.length;j++){
                    sum+=nums[j];
                    max=Math.max(max,sum);//최대 합 갱신
                }
            }else{//음수
                max=Math.max(max,nums[i]);
            }
        }
        return max;
    }
}
