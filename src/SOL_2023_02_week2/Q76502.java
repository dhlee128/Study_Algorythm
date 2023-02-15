package SOL_2023_02_week2;

import java.util.Stack;

public class Q76502 {
    public int solution(String s) {
        int answer = 0;

        for(int i=0; i<s.length(); i++) {
            s = s.substring(1)+s.substring(0,1);

            if(check(s)) answer++;
        }

        return answer;
    }

    public boolean check(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if(c=='[' || c=='{' || c=='(') {
                stack.add(c);
            } else {
                if(stack.isEmpty()) return false;
                char cc = stack.pop();
                if(c==']' && cc!='[') return false;
                if(c=='}' && cc!='{') return false;
                if(c==')' && cc!='(') return false;
            }
        }
        if(!stack.isEmpty()) return false;

        return true;
    }
}
