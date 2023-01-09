package SOL_2023_01_week1.step19.Q10872;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();

        int sum = fac(N);
        System.out.println(sum);
    }
    public static int fac(int N) {
        if(N<=1) return 1;
        return N*fac(N-1);
    }
}