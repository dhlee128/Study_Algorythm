package SOL_2022_10_week4;

import java.util.Stack;

public class Q155 {
    class MinStack {

        Stack<Integer> stack;
        Stack<Integer> min;

        public MinStack() {
            stack = new Stack<>();
            min = new Stack<>();
        }

        public void push(int val) {
            stack.add(val);
            min.add((min.size()>0)?(min.peek()>val?val:min.peek()):val);
        }

        public void pop() {
            stack.pop();
            min.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return min.peek();
        }
    }
}
