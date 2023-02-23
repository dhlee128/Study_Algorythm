package SOL_2023_02_week4;

import java.util.*;

public class Q72411 {

    Map<String, Integer> map = new HashMap<>();
    List<String> list = new ArrayList<>();

    public String[] solution(String[] orders, int[] course) {

        for(int i=0; i<orders.length; i++) {//각 orders 오름차순 정렬
            char[] cArray = orders[i].toCharArray();
            Arrays.sort(cArray);
            orders[i] = String.valueOf(cArray);
        }

        for(int len : course) {
            for(String order : orders) {
                comb("",order,len);//orders 각 order을 len 길이로 조합 만들기
            }

            if(!map.isEmpty()) {
                List<Integer> vList = new ArrayList<>(map.values());
                int maxLen = Collections.max(vList);//가장 많이 주문한 메뉴 조합 횟수

                if(maxLen>1) {//최소 두번은 주문
                    for(String key:map.keySet()) {
                        if(map.get(key)==maxLen) list.add(key);
                    }
                }
                map.clear();
            }
        }

        Collections.sort(list);

        String[] answer = new String[list.size()];

        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public void comb(String set, String sets, int len) {
        if(set.length()==len) {
            map.put(set,map.getOrDefault(set,0)+1);
            return;
        }

        for(int i=0; i<sets.length(); i++) {
            comb(set+sets.charAt(i), sets.substring(i+1), len);
        }
    }
}
