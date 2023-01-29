package SOL_2023_01_week4;

import java.util.Stack;

public class Q131704 {
    public static void main(String[] args) {
        int[] order = {4, 3, 1, 2, 5};
        System.out.println(solution(order));
    }
    public static int solution(int[] order) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        int orderIdx = 0;

        for(int i=1; i<=order.length; i++) {
            if(order[orderIdx]!=i) {
                stack.add(i);
            } else {
                orderIdx++;
                answer++;

                while(!stack.isEmpty() && order[orderIdx]==stack.peek()) {
                    orderIdx++;
                    answer++;
                    stack.pop();
                }
            }
        }

        return answer;
    }
}
