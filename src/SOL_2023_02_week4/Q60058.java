package SOL_2023_02_week4;

import java.util.*;

public class Q60058 {
    public boolean isCorrect(String str) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(c=='(') {
                stack.add(c);
            } else {
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public String solution(String p) {

        if(p.isEmpty()) return "";//1

        int left=0;
        int right=0;

        //2
        String u = "";
        String v = "";
        for(int i=0; i<p.length(); i++) {
            if('('==p.charAt(i)) {
                left++;
            } else {
                right++;
            }
            if(left==right) {
                u = p.substring(0, i+1);
                v = p.substring(i+1);
                break;
            }
        }

        //3
        if(isCorrect(u)) return u+solution(v);//3-1

        //4
        String answer = "(";//4-1
        answer += solution(v);//4-2
        answer += ")";//4-3

        //4-4
        u = u.substring(1,u.length()-1);

        for(int i=0; i<u.length(); i++) {
            if(u.charAt(i)=='(') {
                answer+=')';
            } else {
                answer+='(';
            }
        }

        return answer;//4-5
    }

    public static void main(String[] args) {
        String p = ")(";
        System.out.println(new Q60058().solution(p));
    }
}
