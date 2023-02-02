package SOL_2023_01_week4;

import java.util.ArrayList;
import java.util.List;

public class Q67257 {
    public long solution(String expression) {
        long answer = Long.MIN_VALUE;

        List<String> list = new ArrayList<>();

        int idx = 0;
        for(int i=0; i<expression.length(); i++) {
            char c = expression.charAt(i);
            if(c=='+'||c=='-'||c=='*') {
                list.add(expression.substring(idx, i));
                idx = i+1;
                list.add(c+"");
            }
        }
        list.add(expression.substring(idx));

        String op[][] = { { "+", "-", "*" }, { "+", "*", "-" }, { "-", "*", "+" },
                { "-", "+", "*" }, { "*", "-", "+" }, { "*", "+", "-" } };

        for(int i=0; i<op.length; i++) {//우선순위 op
            List<String> temp = new ArrayList<>(list);

            for(int k=0; k<3; k++) {//부호
                for(int j=0; j<temp.size(); j++) {//숫자 부호 리스트
                    if(temp.get(j).equals(op[i][k])) {
                        temp.set(j-1, calc(temp.get(j-1), temp.get(j), temp.get(j+1)));
                        temp.remove(j);
                        temp.remove(j);
                        j--;
                    }
                }
            }

            long tempAnswer = Long.parseLong(temp.get(0));
            if(tempAnswer<0) tempAnswer*=-1;

            answer = Math.max(answer, tempAnswer);
        }

        return answer;
    }

    public String calc(String num1, String op, String num2) {
        long n1 = Long.parseLong(num1);
        long n2 = Long.parseLong(num2);

        if (op.equals("+"))
            return n1 + n2 + "";
        else if (op.equals("-"))
            return n1 - n2 + "";

        return n1 * n2 + "";
    }
}
