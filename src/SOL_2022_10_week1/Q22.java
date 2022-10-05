package SOL_2022_10_week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q22 {

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));

    }

    public static List<String> generateParenthesis(int n) {

        List<String> res = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        comb(res, n, 0, 0, "", stack);

        return res;
    }

    public static void comb(List<String> res, int n, int left_n, int right_n, String s, Stack<String> stack) {
        if(left_n==n && right_n==n) {
            res.add(s);
            return;
        }

        if(left_n<n) {
            s+="(";
            stack.add("(");
            comb(res, n, left_n+1,right_n, s, stack);
            stack.pop();
            s=s.substring(0, s.length()-1);
        }

        if(right_n<n && stack.size()>right_n) {
            s+=")";
            comb(res, n, left_n, right_n+1, s, stack);
            s=s.substring(0, s.length()-1);
        }
    }
}
