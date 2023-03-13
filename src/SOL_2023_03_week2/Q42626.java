package SOL_2023_03_week2;

import java.util.PriorityQueue;

public class Q42626 {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i=0; i<scoville.length; i++) {
            q.add(scoville[i]);
        }

        while(true) {
            if(q.size()==1) {
                if(q.poll()<K) {
                    return -1;
                } else {
                    break;
                }
            }
            if(q.peek()>=K) return answer;

            int temp = q.poll()+q.poll()*2;
            q.add(temp);
            answer++;
        }
        return answer;
    }
}
