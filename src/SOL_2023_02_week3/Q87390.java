package SOL_2023_02_week3;

public class Q87390 {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)right-(int)left+1];
        int idx=0;

        for(long i=left; i<=right; i++) {
            long x = i/n;
            long y = i%n;

            answer[idx++]=Math.max((int)x,(int)y)+1;
        }

        return answer;
    }
}
