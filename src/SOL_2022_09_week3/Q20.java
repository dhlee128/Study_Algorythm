package SOL_2022_09_week3;

import java.util.Stack;

public class Q20 {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    static public boolean isValid(String s) {

        boolean res = true;

        Stack<Character> stack = new Stack<>();
        char[] charArr = s.toCharArray();

        for(int i=0; i<charArr.length; i++){
            char c = charArr[i];
            if(c=='(' || c=='{' || c=='[') {
                stack.add(charArr[i]);
            } else {
                if(stack.isEmpty()){
                    res = false;
                    break;
                }else{
                    char sc = stack.pop();
                    if( sc=='('&&c==')' || sc=='['&&c==']' || sc=='{'&&c=='}' ){
                    }else{
                        res = false;
                        break;
                    }
                }
            }
        }

        if(!stack.isEmpty()) res = false;

        return res;
    }
}
