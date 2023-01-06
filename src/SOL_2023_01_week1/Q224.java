package SOL_2023_01_week1;

import java.util.Stack;

public class Q224 {
    public static int calculate(String s) {

        int num = 0;
        Stack<Integer> stack = new Stack<>();
        int sign = 1;
        int res = 0;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if(c>='0'&&c<='9') {
                num*=10;
                num+=(c-'0');
            } else if(c=='(') {
                stack.add(res);
                stack.add(sign);

                sign=1;
                res=0;
            } else if(c==')') {
                res+=sign*num;
                int popSign = stack.pop();
                int popRes = stack.pop();
                res=popRes+popSign*res;
                num=0;
            } else if(c=='+' || c=='-'){
                res+=(sign*num);
                if(c=='+') {
                    sign = 1;
                }else if(c=='-') {
                    sign = -1;
                }
                num=0;
            }
        }
        if(num!=0) res+=(sign*num);

        return res;
    }

    public static void main(String[] args) {
        String s = "(1+(4+5+2)-3)";
        System.out.println(calculate(s));
    }
}
