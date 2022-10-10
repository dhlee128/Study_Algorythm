package SOL_2022_10_week1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//287. Find the Duplicate Number
public class Q287 {

    public static int findDuplicate(int[] nums) {
        int res=-1;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        Iterator it = map.keySet().iterator();
        while(it.hasNext()) {
            Integer key = (Integer)it.next();
            if(map.get(key) > 1) res = key;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
}
