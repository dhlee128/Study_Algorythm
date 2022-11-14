package SOL_2022_11_week2;

import java.util.HashMap;
import java.util.Map;

public class Q387 {

    public static int firstUniqChar(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(int i=0; i<s.length(); i++) {
            if(map.get(s.charAt(i))==1) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
}
