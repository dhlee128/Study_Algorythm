package SOL_2023_02_week1;

import java.util.Arrays;

public class Q152995 {
    public int solution(int[][] scores) {
        int answer = 1;

        int[] won = scores[0];
        int wonSum = scores[0][0]+scores[0][1];

        //태도점수 내림차순, 태도점수 동일 경우에 평가점수 오름차순
        Arrays.sort(scores, (a, b)-> a[0]==b[0]?a[1]-b[1]:b[0]-a[0]);

        int maxVal = Integer.MIN_VALUE;

        for(int i=0; i<scores.length; i++) {
            if(maxVal>scores[i][1]) {//태도점수가 내림차순으로 평가점수까지 작으면 랭크 X
                if(won.equals(scores[i])) return -1;
            } else {
                maxVal = scores[i][1];
                if(scores[i][0]+scores[i][1]>wonSum) answer++;//태도+평가 점수가 원호점수 보다 높을 때에만 카운트
            }
        }

        return answer;
    }
}
