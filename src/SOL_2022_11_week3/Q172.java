package SOL_2022_11_week3;

public class Q172 {
    public static int trailingZeroes(int n) {
        int res = 0;
        while(n>=5) {
            res+=n/5;
            n/=5;
        }
        return res;
    }

    public static void main(String[] args) {

        int n = 3;

        System.out.println(trailingZeroes(3));
    }
}
