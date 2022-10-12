package SOL_2022_10_week2;

import java.util.ArrayList;
import java.util.List;

public class Q763 {

    public static List<Integer> partitionLabels(String s) {

        List<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[26];
        int max_value = Integer.MIN_VALUE;
        int start = 0;
        char[] cArr = s.toCharArray();

        for(int i=0; i<cArr.length; i++) {
            if(!visited[cArr[i]-'a']) {
                visited[cArr[i]-'a'] = true;
                max_value = Math.max(max_value, s.lastIndexOf(cArr[i])+1);
            }
            if(i==max_value-1) {
                res.add(max_value-start);
                max_value = Integer.MIN_VALUE;
                start = i+1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abcc";
        System.out.println(partitionLabels(s));
    }
}
