package SOL_2022_11_week3;

public class Q69 {
    public static int mySqrt(int x) {
       long res = 1;

        while(res*res<=x) {
            res++;
        }

        return (int)res-1;
    }

    public static void main(String[] args) {
        int x = 4;
        System.out.println(mySqrt(x));
    }
}
