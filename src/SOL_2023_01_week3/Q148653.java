package SOL_2023_01_week3;

public class Q148653 {
    public int solution(int storey) {
        int answer = 0;

        while(storey!=0) {
            int temp = storey%10;
            storey/=10;

            if(temp>5) {
                answer+=(10-temp);
                storey++;
            } else if(temp<5) {
                answer+=(temp);
            } else {
                if(storey%10>=5) {
                    answer+=(10-temp);
                    storey++;
                } else {
                    answer+=(temp);
                }
            }
        }
        return answer;
    }
}
