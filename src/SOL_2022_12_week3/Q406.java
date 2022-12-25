package SOL_2022_12_week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q406 {
    public static int[][] reconstructQueue(int[][] people) {
        List<int[]> ans = new ArrayList<>();

        Arrays.sort(people, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);

        for (final int[] p : people)
            ans.add(p[1], p);

        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {
        int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        System.out.println(reconstructQueue(people));
    }
}
