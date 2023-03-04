package SOL_2023_03_week1;

public class Q161989 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;

        int start = 0;

        for(int i=0; i<section.length; i++) {
            if(start>section[i]) continue;

            start = section[i]+m;
            answer++;
        }

        return answer;
    }
}
