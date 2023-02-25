package SOL_2023_02_week4;

public class Q12911 {
    public int toBinary(int n) {
        int cnt = 0;

        while(n!=0) {
            if(n%2==1) cnt++;
            n/=2;
        }
        return cnt;
    }

    public int solution(int n) {
        int answer = 0;

        int cur = toBinary(n);

        while(true) {
            if(toBinary(++n)==cur) {
                answer=n;
                break;
            }
        }

        return answer;
    }
}
