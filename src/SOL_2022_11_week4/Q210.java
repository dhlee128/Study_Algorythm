package SOL_2022_11_week4;

import java.util.*;

public class Q210 {
    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] res = new int[numCourses];
        int idx = 0;
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for(int i=0; i<prerequisites.length; i++) {
            int after = prerequisites[i][0];
            int before = prerequisites[i][1];

            if(map.containsKey(after)) {
                map.get(after).add(before);
            } else {
                Set<Integer> set = new HashSet<>();
                set.add(before);
                map.put(after, set);
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        // 선행이 없는 코스
        for(int i=0; i<numCourses; i++) {
            if(!map.containsKey(i)) queue.add(i);
        }

        while(!queue.isEmpty()) {
            int course = queue.poll();
            res[idx++] = course;
            for(int i=0; i<numCourses; i++) {
                if(map.containsKey(i) && map.get(i).contains(course)) {
                    map.get(i).remove(course);
                    if(map.get(i).isEmpty()) {
                        queue.add(i);
                        map.remove(i);
                    }
                }
            }
        }
        if(idx!=numCourses) return new int[0];
        return res;
    }

    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = {{1,0}};

        System.out.println(findOrder(numCourses, prerequisites));
    }
}
