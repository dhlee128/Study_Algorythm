package SOL_2022_12_week4;

import java.util.Arrays;

public class Q1663 {
    public static String getSmallestString(int n, int k) {
        //a:1 ... z:26
        char[] arr = new char[n];
        Arrays.fill(arr, 'a');

        k = k-n;

        while(k!=0) {
            if(k<=25) {
                arr[n-1] += k;
                k = 0;
            } else {
                arr[n - 1] = 'z';
                k = k - 25;
            }
            n--;
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        int n = 3;
        int k = 27;

        System.out.println(getSmallestString(n,k));
    }

}
