package SOL_2023_01_week2.step20.Q2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(cal(n));
    }
    public static int cal(int n) {

        for(int i=1; i<n; i++) {
            int sum = i;
            int num = i;

            while(num!=0) {
                sum+=num%10;
                num/=10;
            }
            if(sum==n) return i;
        }
        return 0;
    }
}
