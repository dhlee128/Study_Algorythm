package SOL_2022_11_week2;

import java.util.Stack;

public class Q227 {
    public static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        char op = '+';
        int num =0;

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c ==' ') continue;
            if(c<'0' || '9'<c) {//op
                cal(stack, op, num);
                op = c;
                num=0;
            } else {//num
                num = num*10+c-'0';
            }
        }

        cal(stack, op, num);

        int res = 0;
        while (!stack.isEmpty()) {
            res+=stack.pop();
        }
        return res;
    }

    public static void cal(Stack<Integer> stack, char op, int num) {
        if(op=='+') {
            stack.add(num);
        } else if(op=='-') {
            stack.add(-num);
        } else if(op=='*') {
            stack.add(stack.pop()*num);
        } else if(op=='/') {
            stack.add(stack.pop()/num);
        }
    }

    public static void main(String[] args) {
        String s = "3/2";
        System.out.println(calculate(s));
    }
}
