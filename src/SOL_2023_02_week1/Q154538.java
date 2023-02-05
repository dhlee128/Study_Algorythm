package SOL_2023_02_week1;

import java.util.HashSet;
import java.util.Set;

public class Q154538 {
    public int solution(int x, int y, int n) {

        int answer = 0;

        Set<Integer> cur = new HashSet<>();

        cur.add(x);

        while(!cur.isEmpty()) {

            if(cur.contains(y)) return answer;

            Set<Integer> next = new HashSet<>();

            answer++;

            for(int num:cur) {
                if(num+n<=y) next.add(num+n);
                if(num*2<=y) next.add(num*2);
                if(num*3<=y) next.add(num*3);
            }

            cur = next;
        }

        return -1;
    }
}
