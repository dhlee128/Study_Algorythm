package SOL_2023_02_week3;

public class Q12900 {
    public int solution(int n) {

        int[] fib = new int[n%1000000007+1];

        fib[1] = 1;
        fib[2] = 2;
        for(int i=3; i<=n; i++) {
            fib[i]=(fib[i-2]+fib[i-1])%1000000007;
        }

        return fib[n];
    }
}
