package SOL_2022_12_week2;

import java.util.ArrayList;
import java.util.List;

public class Q241 {
    public static List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res = new ArrayList<>();

        for(int i=0; i<expression.length(); i++) {
            char c = expression.charAt(i);
            if(c=='+' || c=='-' || c=='*') {
                List<Integer> listA = diffWaysToCompute(expression.substring(0, i));
                List<Integer> listB = diffWaysToCompute(expression.substring(i+1));
                for(int a:listA) {
                    for(int b:listB) {
                        if(c=='+') {
                            res.add(a+b);
                        } else if(c=='-') {
                            res.add(a-b);
                        } else if(c=='*') {
                            res.add(a*b);
                        }
                    }
                }
            }
        }
        if(res.isEmpty()) res.add(Integer.valueOf(expression));
        return res;
    }

    public static void main(String[] args) {
        String expression = "2*3-4*5";
        System.out.println(diffWaysToCompute(expression));
    }
}
