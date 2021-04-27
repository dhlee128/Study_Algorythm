package week2;

import java.util.Stack;

//921. Minimum Add to Make Parentheses Valid
public class Q921 {

    public static void main(String[] args){
        String str="(()())";
        System.out.println(minAddToMakeValid(str));
    }

    public static int minAddToMakeValid(String S) {

        Stack<Character> stack=new Stack();//'('괄호 -> ')'랑 짝이 맞는지 검사하여 pop()해줌
        Stack<Character> tmp=new Stack();//')'괄호 -> '('와 짝이 맞지 않을때 tmp 에 담음

        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(ch=='('){//'(' 괄호일 경우
                stack.add(ch);
            }else{//')' 괄호일 경우
                if(stack.isEmpty()){//왼쪽 괄호가 하나도 없으면 ')'은 잘못된 위치로 ')'를 tmp 에 담음
                    tmp.add(ch);
                }else if(stack.peek()=='('){// ( )로 괄호가 짝이 맞아 ')'는 tmp 에 담지 않음
                    stack.pop();//짝이 맞는 '('를 꺼냄
                }
            }
        }
        //나머지 올바른 위치에 있지 않은 '(',')'괄호 수
        return stack.size()+tmp.size();
    }
}
