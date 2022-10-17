package SOL_2022_10_week2;

import java.util.*;

public class Q131 {

    public static List<List<String>> partition(String s) {

        List<List<String>> res = new ArrayList<>();
        List<String> list = new ArrayList<>();

        dfs(res, list, s, 0);

        return res;
    }

    public static void dfs(List<List<String>> res, List<String> list, String s, int idx) {

        if(idx == s.length()) {
            res.add(new ArrayList<>(list));
        }else{
            for(int i=idx; i<s.length(); i++) {
                if(isPalindrome(s, idx, i)) {
                    list.add(s.substring(idx, i+1));
                    dfs(res, list,s, i+1);
                    list.remove(list.size()-1);
                }
            }
        }
    }

    public static boolean isPalindrome(String s, int start, int end) {
        String str = s.substring(start, end+1);

        for(int i=0; i<str.length()/2+1; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i)) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        String s = "aab";
        System.out.println(partition(s));
    }
}
