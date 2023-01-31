package SOL_2023_01_week4;

import java.util.LinkedList;
import java.util.Queue;

public class Q118667 {
    public int solution(int[] queue1, int[] queue2) {
            int answer = 0;
            Queue<Integer> q1 = new LinkedList<>();
            Queue<Integer> q2 = new LinkedList<>();

            long sum1=0;
            long sum2=0;

            long sum = 0;

            int len = queue1.length;

            for(int i=0; i<len; i++) {
                q1.add(queue1[i]);
                q2.add(queue2[i]);

                sum1+=queue1[i];
                sum2+=queue2[i];

                sum+=queue1[i]+queue2[i];
            }

            if(sum%2!=0) return -1;

            while(answer<=2*len*2) {
                if(sum1==sum2) return answer;
                answer++;
                if(sum1>sum2) {
                    int num = q1.poll();
                    sum1-=num;
                    sum2+=num;
                    q2.add(num);
                } else {
                    int num = q2.poll();
                    sum2-=num;
                    sum1+=num;
                    q1.add(num);
                }
            }

            return -1;
    }
}
