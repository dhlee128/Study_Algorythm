package SOL_2023_03_week1;

import java.util.*;

public class Q72412 {
    public static void main(String[] args) {
        String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
        String[] query ={"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};

        System.out.println(new Q72412().solution(info, query));
    }

    Map<String, List<Integer>> map;

    public int[] solution(String[] info, String[] query) {

        map = new HashMap<>();
        int[] answer = new int[query.length];

        for(String i:info) {
            comb("",i.split(" "),0);
        }

        for(String key:map.keySet()) {
            Collections.sort(map.get(key));
        }

        for(int i=0; i<query.length; i++) {
            String[] q = query[i].replaceAll(" and ","").split(" ");

            answer[i] = map.containsKey(q[0]) ? find(q) : 0;
        }

        return answer;
    }

    public int find(String[] q) {
        String key = q[0];
        int score = Integer.parseInt(q[1]);

        List<Integer> list = map.get(key);

        int start = 0;
        int end = list.size()-1;

        while(start<=end) {
            int mid = (start+end)/2;
            if(list.get(mid)<score) {
                start=mid+1;
            } else {
                end=mid-1;
            }
        }

        return list.size()-start;
    }

    public void comb(String str, String[] info, int cnt) {
        if(cnt==4) {
            int score = Integer.parseInt(info[4]);
            if(map.containsKey(str)) {
                map.get(str).add(score);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(score);

                map.put(str, list);
            }
            return;
        }

        comb(str+"-", info, cnt+1);
        comb(str+info[cnt], info, cnt+1);
    }
}
