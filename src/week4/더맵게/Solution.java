package week4.더맵게;

import java.util.PriorityQueue;

public class Solution {

	public static void main(String[] args) {
		int[] scoville = {1, 1, 5};
		int K = 4;
		System.out.println(solution(scoville,K));
	}

    public static int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> queue=new PriorityQueue<>();
        for(int s:scoville) {
            queue.offer(s);
        }

        while(!queue.isEmpty()) {
            // 모든 수가 K 이상일 경우
            if(queue.peek()>=K) return answer;
            // K 이상으로 만들 수 없는 경우
            if(queue.size()==1) return -1;

            int num=queue.poll()+queue.poll()*2;
            queue.add(num);

            answer++;
        }

        return answer;
    }
}
