package SOL_2022_11_week3;

import java.util.HashSet;
import java.util.Set;

public class Q202 {

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        int sum = n;

        while(set.add(sum)) {
            sum = 0;
            while (n != 0) {
                sum += ((n % 10) * (n % 10));
                n /= 10;
            }
            n=sum;
            if(sum==1) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
}
