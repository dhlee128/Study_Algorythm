package SOL_2022_11_week2;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Q341 implements Iterator<Integer> {

    public interface NestedInteger {

      // @return true if this NestedInteger holds a single integer, rather than a nested list.
      public boolean isInteger();

      // @return the single integer that this NestedInteger holds, if it holds a single integer
      // Return null if this NestedInteger holds a nested list
      public Integer getInteger();

      // @return the nested list that this NestedInteger holds, if it holds a nested list
      // Return empty list if this NestedInteger holds a single integer
     public List<NestedInteger> getList();

    }

    Stack<NestedInteger> stack = new Stack<>();
    public void NestedIterator(List<NestedInteger> nestedList) {
        for(int i=nestedList.size()-1; i>=0; i--) {
            stack.add(nestedList.get(i));
        }
    }

    @Override
    public Integer next() {
        return stack.pop().getInteger();
    }

    @Override
    public boolean hasNext() {
        while(!stack.isEmpty()) {
            NestedInteger temp = stack.peek();
            if (temp.isInteger()) return true;
            stack.pop();
            List<NestedInteger> tempList = temp.getList();
            for (int i = tempList.size() - 1; i >= 0; i--) {
                stack.add(tempList.get(i));
            }
        }
        return false;
    }
}
