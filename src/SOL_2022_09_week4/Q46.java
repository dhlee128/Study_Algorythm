package SOL_2022_09_week4;

import java.util.ArrayList;
import java.util.List;

public class Q46 {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        boolean[] visited = new boolean[nums.length];
        List<Integer> list = new ArrayList<>();

        permuteCal(res, list, nums, visited);

        return res;
    }

    public static void permuteCal(List<List<Integer>> res, List<Integer> list, int[] nums, boolean[] visited) {

        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));

            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                list.add(nums[i]);
                permuteCal(res, list, nums, visited);
                list.remove(list.size() - 1);
                visited[i] = false;
            }
        }
    }
}
