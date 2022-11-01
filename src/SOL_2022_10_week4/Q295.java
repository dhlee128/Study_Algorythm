package SOL_2022_10_week4;

import java.util.*;

public class Q295 {

    PriorityQueue<Integer> bigQ;
    PriorityQueue<Integer> smallQ;

    public Q295() {
        bigQ = new PriorityQueue<>();
        smallQ = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void addNum(int num) {
        bigQ.offer(num);
        smallQ.offer(bigQ.poll());
        if(bigQ.size() < smallQ.size()) {
            bigQ.offer(smallQ.poll());
        }
    }

    public double findMedian() {
        if(smallQ.size()!=bigQ.size()) {
            return bigQ.peek();
        }else{
            return (double)(smallQ.peek()+bigQ.peek())/2;
        }
    }
}
