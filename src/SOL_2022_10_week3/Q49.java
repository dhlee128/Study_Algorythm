package SOL_2022_10_week3;

import java.util.*;

public class Q49 {
    public static void main(String[] args) {
        String[] s= {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagrams(s));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(String str:strs) {
            char[] cArr = str.toCharArray();
            Arrays.sort(cArr);
            String sortedStr = String.valueOf(cArr);//cArr.toString()

            if(map.containsKey(sortedStr)) {
                List<String> list = map.get(sortedStr);
                list.add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);

                map.put(sortedStr, list);
            }
        }

        map.forEach((key, value)->{
            res.add(value);
        });

        return res;
    }
}
