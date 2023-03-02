package SOL_2023_03_week1;

import java.util.Collections;
import java.util.PriorityQueue;

public class Q42587 {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<priorities.length; i++) {
            pq.add(priorities[i]);
        }

        int answer = 0;
        while (!pq.isEmpty()) {
            for(int i=0; i<priorities.length;i++) {
                if(pq.peek()==priorities[i]) {
                    pq.poll();
                    answer++;
                    if(i==location) return answer;
                }
            }
        }
        return answer;
    }
}
