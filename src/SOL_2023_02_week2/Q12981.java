package SOL_2023_02_week2;

import java.util.ArrayList;
import java.util.List;

public class Q12981 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<String>();

        for(int i=0; i<words.length; i++) {

            if(words[i].length()==1 || list.contains(words[i])) {
                answer[0] = i%n+1;
                answer[1] = i/n+1;
                break;
            }
            if(i!=0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)) {
                answer[0] = i%n+1;
                answer[1] = i/n+1;
                break;
            }
            list.add(words[i]);
        }

        return answer;
    }
}
