package SOL_2023_03_week1;

import java.util.LinkedList;
import java.util.Queue;

public class Q42583 {
    public static void main(String[] args) {
        int bridge_length=2;
        int weight=10;
        int[] truck_weights={7,4,5,6};

        System.out.println(solution(bridge_length, weight, truck_weights));
    }
    public static int solution(int bridge_length, int weight, int[] truck_weights) {

        Queue<Integer> q = new LinkedList<>();

        int time = 0;
        int sum = 0;

        for(int i=0; i<truck_weights.length; i++) {

            while(true) {
                if(q.isEmpty()) {
                    q.add(truck_weights[i]);
                    sum+=truck_weights[i];
                    break;
                } else {
                    int temp = q.peek();

                    if(q.size()==bridge_length) {
                        sum-=temp;
                        time++;
                        q.poll();
                    } else {
                        if(truck_weights[i]+sum<=weight) {
                            q.add(truck_weights[i]);
                            sum+=truck_weights[i];
                            break;
                        } else {
                            q.add(0);
                        }
                    }
                }
            }
        }
        return bridge_length+time+q.size();
    }
}
