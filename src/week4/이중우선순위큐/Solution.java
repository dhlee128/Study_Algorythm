package week4.이중우선순위큐;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        String[] op={"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        System.out.println(solution(op));
    }

    public static int[] solution(String[] operations) {
        int[] answer = {0,0};

        PriorityQueue<Integer> queue = new PriorityQueue<>();//오름차순
        PriorityQueue<Integer> queue2 = new PriorityQueue<>(Collections.reverseOrder());//내림차순
        
        for(String str:operations){
            String comm = str.substring(0,1);
            int num = Integer.parseInt(str.substring(2));
            if(comm.equals("I")){
                queue.offer(num);
                queue2.offer(num);
            }
            if(comm.equals("D")){//삭제
                if(queue.isEmpty()){continue;}
                if(num==1){//최대값
                    int max=queue2.poll();
                    boolean nddum=queue.remove(max);
                }else if(num==-1){//최소값
                    int min=queue.poll();
                    queue2.remove(min);
                }
            }
        }
        if(queue.isEmpty()){
            return answer;
        }

        answer[0]=queue.peek();
        answer[1]=queue2.peek();

        return answer;
    }
}
