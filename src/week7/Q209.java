package week7;

//209. Minimum Size Subarray Sum
public class Q209 {

    public static int minSubArrayLen(int target, int[] nums) {
    	int min=Integer.MAX_VALUE;
    	int cnt=0;
    	int sum=0;

    	for(int i=0;i<nums.length;i++) {
    		cnt=0;sum=0;
    		for(int j=i;j<nums.length;j++) {
    			sum+=nums[j];
    			cnt++;
    			if(sum>=target) {break;}
    		}
    		if(sum>=target) {
    			min=Math.min(min, cnt);
    		}
    	}

    	return (min==Integer.MAX_VALUE)?0:min;
    }

	public static void main(String[] args) {
		int[] nums = {12,28,83,4,25,26,25,2,25,25,25,12};
		int target = 213;

		System.out.println(minSubArrayLen(target, nums)); //8

	}
}
