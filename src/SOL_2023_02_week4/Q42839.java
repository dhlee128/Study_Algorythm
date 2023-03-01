package SOL_2023_02_week4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q42839 {

    Set<Integer> set = new HashSet<>();
    boolean[] visited;

    public int solution(String numbers) {
        int answer = 0;
        visited = new boolean[numbers.length()];

        for(int i=1; i<=numbers.length(); i++) {
            dfs(numbers, "", i);
        }

        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            if(find(it.next())) answer++;
        }

        return answer;
    }

    public boolean find(int num) {
        if(num<=1) return false;

        for(int i=2; i*i<=num; i++) {
            if(num%i==0) return false;
        }
        return true;
    }

    public void dfs(String numbers, String str, int len) {
        if(str.length() == len) {
            set.add(Integer.parseInt(str));
            return;
        }

        for(int i=0; i<numbers.length(); i++) {
            if(visited[i]) continue;

            visited[i] = true;
            str+=numbers.charAt(i);
            dfs(numbers, str, len);
            str=str.substring(0,str.length()-1);
            visited[i] = false;
        }

    }
}
