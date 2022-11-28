package SOL_2022_11_week4;

import java.util.HashMap;
import java.util.Map;

public class Q13 {
    public static int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("M", 1000);
        map.put("CM", 900);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("X", 10);
        map.put("IX", 9);
        map.put("V", 5);
        map.put("IV", 4);
        map.put("I", 1);

        int res = 0;

        for(int i=0; i<s.length(); i++) {
            if(i+1!=s.length() && map.containsKey(s.substring(i, i+2))) {
                res+=map.get(String.valueOf(s.substring(i, i+2)));
                i++;
            } else {
                res+=map.get(String.valueOf(s.charAt(i)));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
