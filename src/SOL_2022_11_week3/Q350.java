package SOL_2022_11_week3;

import java.util.ArrayList;
import java.util.List;

public class Q350 {

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[1001];
        for(int i=0; i<nums1.length; i++) {
            arr[nums1[i]]++;
        }
        for(int i=0; i<nums2.length; i++) {
            if(arr[nums2[i]]<=0) continue;
            arr[nums2[i]]--;
            list.add(nums2[i]);
        }
        return list.stream().mapToInt(k->k).toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(intersect(nums1, nums2));
    }
}
