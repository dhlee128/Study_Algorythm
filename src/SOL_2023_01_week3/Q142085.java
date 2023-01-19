package SOL_2023_01_week3;

import java.util.Collections;
import java.util.PriorityQueue;

public class Q142085 {
    public int solution(int n, int k, int[] enemy) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<enemy.length; i++) {
            n-=enemy[i];
            queue.add(enemy[i]);
            if(n<0) {
                if(k>0) {
                    k--;
                    n+=queue.poll();
                }else {
                    return i;
                }
            }
        }
        return enemy.length;
    }
}
