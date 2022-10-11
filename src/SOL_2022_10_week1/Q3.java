package SOL_2022_10_week1;

import java.util.HashMap;
import java.util.Map;

//3. Longest Substring Without Repeating Characters
public class Q3 {

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] cArr = s.toCharArray();
        int point = 0;
        int size = 0;

        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(cArr[i]) && point<map.get(cArr[i])+1) point = map.get(cArr[i])+1;
            size = Math.max(size, i-point+1);
            map.put(cArr[i], i);
        }
        return size;
    }

    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
