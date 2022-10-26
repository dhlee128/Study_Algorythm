package SOL_2022_10_week4;

import java.util.ArrayList;
import java.util.List;

public class Q17 {
    public static List<String> letterCombinations(String digits) {
        String[] number = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> list = new ArrayList<>();
        List<String> res = new ArrayList<>();

        if(digits.length()==0) return res;

        for(int i=0; i<digits.length(); i++) {
            list.add(number[(int)(digits.charAt(i)-'1')+1]);
        }

        dfs(res, list, 0, "");

        return res;
    }
    public static void dfs(List<String> res, List<String> list, int index, String str) {
        if(str.length()==list.size()) {
            res.add(str);
            return;
        }
        for(int i=0;i<list.get(index).length();i++) {
            dfs(res, list, index+1, str+list.get(index).charAt(i));
        }
    }

    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }
}
