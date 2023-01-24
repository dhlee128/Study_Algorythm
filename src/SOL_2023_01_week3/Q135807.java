package SOL_2023_01_week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q135807 {
    static List<Integer> divisors;

    private static void findDivisors(int num) {

        divisors = new ArrayList<>();

        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                divisors.add(i);
            }
        }
        Collections.sort(divisors, Collections.reverseOrder());
    }

    static boolean canDivideAllElement(int divisor, int[] arr) {
        for (int num : arr)
            if (num % divisor != 0)
                return false;
        return true;
    }

    static boolean cantDivideAllElement(int divisor, int[] arr) {
        for (int num : arr)
            if (num % divisor == 0)
                return false;
        return true;
    }

    static public int solution(int[] arrayA, int[] arrayB) {
        int a = problem(arrayA, arrayB);
        int b = problem(arrayB, arrayA);

        return (a>b)?a:b;
    }

    static public int problem(int[] arrayA, int[] arrayB) {
        Arrays.sort(arrayA);

        findDivisors(arrayA[0]);

        for(int i=0; i<divisors.size(); i++) {
            int num = divisors.get(i);
            if(canDivideAllElement(num, arrayA) && cantDivideAllElement(num, arrayB)) {
                return num;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arrayA ={10, 20};
        int[] arrayB ={5, 17};

        System.out.println(solution(arrayA,arrayB));
    }
}
