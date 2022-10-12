package SOL_2022_10_week2;

//560. Subarray Sum Equals K
public class Q560 {

    public static void main(String[] args) {
        int[] nums ={1,2,3};
        int k = 3;
        System.out.println(subarraySum(nums, k));
    }

    public static int subarraySum(int[] nums, int k) {
        int cnt = 0;
        int sum = 0;

        for(int i=0; i<nums.length; i++) {
            for(int j=i; j<nums.length; j++) {
                sum+=nums[j];
                if(sum==k) cnt++;
            }
            sum = 0;
        }
        return cnt;
    }
}
