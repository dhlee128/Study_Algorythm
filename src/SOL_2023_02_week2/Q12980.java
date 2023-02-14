package SOL_2023_02_week2;

public class Q12980 {
    public int solution(int n) {
        int ans = 0;

        while(n!=0) {
            if(n%2==0) {
                n/=2;
            } else {
                n-=1;
                ans++;
            }
        }
        return ans;
    }
}
