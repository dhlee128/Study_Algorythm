package SOL_2023_01_week3;

public class Q140107 {
    public long solution(int k, int d) {
        long answer = 0;

        for(int i=0; i<=d; i+=k) {
            int j = 0;
            long len = (long)(i*i)+(long)(j*j);
            while(len<=(long)(d*d)) {
                answer++;
                j+=k;
                len = (long) Math.sqrt(i*i+j*j);
            }
        }
        return answer;
    }
}
