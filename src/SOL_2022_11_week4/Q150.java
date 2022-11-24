package SOL_2022_11_week4;

import java.util.Stack;

public class Q150 {
    public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<String>();

        for(int i=0; i<tokens.length; i++) {
            if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("/")||tokens[i].equals("*")){
                String p2 = stack.pop();
                String p1 = stack.pop();
                stack.add(cal(p1,tokens[i],p2));
            } else {
                stack.add(tokens[i]);
            }
        }
        return Integer.parseInt(stack.pop());
    }

    public static String cal(String pre, String op, String cur) {
        int res;
        int p1 = Integer.parseInt(pre);
        int p2 = Integer.parseInt(cur);
        if(op.equals("+")) {
            res = p1+p2;
        } else if(op.equals("-")) {
            res = p1-p2;
        } else if(op.equals("/")) {
            res = p1/p2;
        } else {
            res = p1*p2;
        }
        return String.valueOf(res);
    }

    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};
        System.out.println(evalRPN(tokens));
    }
}
