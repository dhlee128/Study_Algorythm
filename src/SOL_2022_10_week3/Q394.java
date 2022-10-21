package SOL_2022_10_week3;

import java.util.Stack;

//394. Decode String
public class Q394 {
    public static class IntegerStringMap {
        int num;
        String str;

        public IntegerStringMap (int num, String str) {
            this.num = num; this.str = str;
        }
    }

    public static String decodeString(String s) {
        Stack<IntegerStringMap> stack = new Stack<>();
        int cnt = 0;
        stack.add(new IntegerStringMap(0,""));
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if(c=='[') {
                stack.add(new IntegerStringMap(cnt,""));
                cnt = 0;
            }else if(c==']') {
                IntegerStringMap temp = stack.pop();
                int num = temp.num;
                String str = temp.str;
                String subString = "";

                for(int j=0; j<num; j++) {
                    subString+=str;
                }
                temp = stack.pop();
                temp.str += subString;
                stack.add(temp);
            } else if(c>='0' && c<='9') {
                cnt = cnt*10 + c-'0';
            } else { // alphabet
                IntegerStringMap temp = stack.pop();
                temp.str += c;
                stack.add(temp);
            }
        }
        return stack.pop().str;
    }

    public static void main(String[] args) {
        String s = "3[aa2[c]]";//<1,""><38,"aa"><2,"c">
        System.out.println(decodeString(s));
    }
}
