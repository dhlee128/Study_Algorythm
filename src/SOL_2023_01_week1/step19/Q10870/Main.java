package SOL_2023_01_week1.step19.Q10870;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();

        System.out.println(fib(N));
    }

    public static int fib(int N) {
        if(N==1) return 1;
        if(N==0) return 0;

        return fib(N-1)+fib(N-2);
    }
}