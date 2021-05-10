package week4;

import java.util.ArrayList;
import java.util.List;

public class Soltution {

	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		System.out.println(solution(scoville,K));
	}

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        boolean flag = false;

        List<Integer> list=new ArrayList<>();
        for(int s:scoville) {
        	list.add(s);
        }

        while(!flag) {

        	flag = true;
            for(int s:list) {
            	if(s<K) {
            		flag = false;
            		break;
            	}
            }
            if(flag) {break;}

            list.sort(null);
            list.add(list.get(0)+list.get(1)*2);
            list.remove(0);
            list.remove(0);
            answer++;
        }

        return answer;
    }
}
