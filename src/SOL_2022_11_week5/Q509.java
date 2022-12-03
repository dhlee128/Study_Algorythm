package SOL_2022_11_week5;

public class Q509 {
    public static int fib(int n) {
        if(n<2) return n;

        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(fib(n));
    }
}
