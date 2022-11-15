package SOL_2022_11_week2;

import java.util.HashMap;
import java.util.Map;

public class Q242 {
    public static boolean isAnagram(String s, String t) {

        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(int i=0; i<t.length(); i++) {
            char c = t.charAt(i);
            if(!map.containsKey(c)) return false;

            if(map.get(c)==1) {
                map.remove(c);
            } else {
                map.put(c, map.get(c)-1);
            }
        }
        if(!map.isEmpty()) return false;

        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}
