package SOL_2023_02_week4;

public class Q42584 {
    public int[] solution(int[] prices) {
        int len = prices.length;
        int[] answer = new int[len];

        for(int i=0; i<len-1; i++) {
            int cnt=0;
            for(int j=i+1; j<len; j++) {
                cnt++;
                if(prices[i]>prices[j]) {
                    break;
                }
            }
            answer[i]=cnt;
        }
        return answer;
    }
}
