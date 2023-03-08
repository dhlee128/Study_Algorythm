package SOL_2023_03_week1;

import java.util.ArrayList;
import java.util.List;

public class Q17680 {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize==0) return 5*cities.length;

        List<String> list = new ArrayList<>();
        int answer = 0;

        for(int i=0; i<cities.length; i++) {
            String c = cities[i].toUpperCase();

            if(list.remove(c)) {
                answer+=1;
            } else {
                answer+=5;
                if(cacheSize==list.size()) list.remove(0);
            }
            list.add(c);
        }
        return answer;
    }
}
