package SOL_2022_12_week2;

import java.util.Stack;

public class Q151 {
    public static String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        String ss = "";
        s = s.trim();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c==' ') {
                stack.add(ss);
                ss = "";
            } else {
                ss+=c;
            }
        }
        stack.add(ss);

        String str = "";
        while(!stack.isEmpty()) {
            String temp = stack.pop();
            if(temp!="") str+=(temp+" ");
        }

        return str.trim();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}
