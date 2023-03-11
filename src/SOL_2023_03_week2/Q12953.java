package SOL_2023_03_week2;

public class Q12953 {
    public int solution(int[] arr) {
        int answer = arr[0];

        for(int i=1; i<arr.length; i++) {
            answer = answer*arr[i]/gcd(answer, arr[i]); //최소공배수
        }

        return answer;
    }

    public int gcd(int x, int y) {
        int a,b;

        if(x>y) {
            a=x;
            b=y;
        } else {
            a=y;
            b=x;
        }

        while(a%b!=0) {
            int t=a%b;
            a=b;
            b=t;
        }

        return b;
    }
}
