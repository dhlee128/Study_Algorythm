package SOL_2022_11_week1;

import java.util.Stack;

public class Q84 {

    public static int largestRectangleArea(int[] heights) {
        int max = 0;
        int index = 0;

        Stack<Integer> stack = new Stack<>();

        while(index<heights.length) {
            if(stack.isEmpty() || heights[stack.peek()]<=heights[index]) {
                stack.add(index++);
            } else {
                int idx = stack.pop();
                int w = stack.isEmpty()?index:index-stack.peek()-1;

                max = Math.max(max, w*heights[idx]);
            }
        }

        while(!stack.isEmpty()) {
            int idx = stack.pop();
            int w = stack.isEmpty()?index:index-stack.peek()-1;

            max = Math.max(max, w*heights[idx]);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] heights = {2,4,5,3,2};
        System.out.println(largestRectangleArea(heights));

    }

}
