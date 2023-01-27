package SOL_2023_01_week4;

import java.util.Stack;

public class Q154539 {
    public int[] solution(int[] numbers) {
        int num = numbers.length;
        int[] answer = new int[num] ;

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<num; i++) {
            answer[i]=-1;
            if(stack.isEmpty() || numbers[i]<numbers[i-1]) {
                stack.add(i);
            } else {
                while(!stack.isEmpty() && numbers[stack.peek()]<numbers[i]) {
                    answer[stack.pop()]=numbers[i];
                }
                stack.add(i);
            }
        }
        return answer;
    }
}
