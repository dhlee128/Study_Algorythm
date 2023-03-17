package SOL_2023_03_week3;

import java.util.*;

public class Q12939 {
    public String solution(String s) {

        String[] arr = s.split(" ");

        List<Integer> list = new ArrayList<>();

        for(String ss:arr) {
            list.add(Integer.parseInt(ss));
        }

        String answer = "";

        answer += Collections.min(list);
        answer += " ";
        answer += Collections.max(list);

        return answer;
    }
}
