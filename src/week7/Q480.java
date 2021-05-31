package week7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//480. Sliding Window Median
public class Q480 {

    public static double[] medianSlidingWindow(int[] nums, int k) {

    	double[] arr=new double[nums.length-k+1];
    	List<Integer> list=new ArrayList<>();

    	for(int i=0;i<nums.length-k+1;i++) {
    		list.clear();
    		int end=i+k-1;
    		for(int j=i;j<=end;j++) {
    			list.add(nums[j]);
    		}
    		Collections.sort(list);
    		if(k%2==0) {//Â¦¼ö
    			double num1=list.get(k/2-1);
    			double num2=list.get(k/2);
    			arr[i]=(num1+num2)/2;
    		}else {//È¦¼ö
    			arr[i]=list.get((k-1)/2);
    		}
    	}
    	return arr;
    }

	public static void main(String[] args) {
		int[] nums= {1,4,2,3};
		int k=4;

		for(double d:medianSlidingWindow(nums,k)) {
			System.out.println(d);
		}
	}

}
