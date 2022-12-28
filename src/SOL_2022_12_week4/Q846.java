package SOL_2022_12_week4;

import java.util.PriorityQueue;

public class Q846 {
    public static boolean isNStraightHand(int[] hand, int groupSize) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<hand.length; i++) {
            pq.add(hand[i]);
        }

        while(!pq.isEmpty()) {
            int small = pq.poll();
            for(int i=1; i<groupSize; i++) {
                if(pq.remove(small+i)) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] hand = {1,2,3,6,2,3,4,7,8};
        int groupSize = 3;

        System.out.println(isNStraightHand(hand, groupSize));
    }
}
