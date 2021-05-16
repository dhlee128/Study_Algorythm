package week3.기능개발;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        int[] progresses={95, 90, 99, 99, 80, 99};
        int[] speeds={1, 1, 1, 1, 1, 1};

        System.out.println(solution(progresses,speeds));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue=new LinkedList<>();

        for(int i=0;i<progresses.length;i++) {
            int day;
            //남은 일자 계산
            if((100-progresses[i])%speeds[i]==0) {
                day=(100-progresses[i])/speeds[i];
            }else {
                day=(100-progresses[i])/speeds[i]+1;
            }

            if(queue.isEmpty()) {//첫번째 기능 등록
                queue.add(day);
            }else {
                if((int)queue.peek()<day) {//해당 기능이 첫번째 기능 보다 오래걸리면
                    answer.add(queue.size());//첫번째 기능 day로 먼저 배포
                    queue.clear();
                }
                queue.add(day);// 기능 등록
            }
        }
        answer.add(queue.size());//마지막 기능 배포

        return answer.stream().mapToInt(i->i).toArray();
    }
}
