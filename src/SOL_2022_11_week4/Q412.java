package SOL_2022_11_week4;

import java.util.ArrayList;
import java.util.List;

public class Q412 {
    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();

        for(int i=1; i<=n; i++) {
            String s = "";
            if(i%3==0 || i%5==0) {
                if(i%3==0) {
                    s = "Fizz";
                }
                if(i%5==0) {
                    s += "Buzz";
                }
            } else {
                s = String.valueOf(i);
            }
            list.add(s);
        }
        return list;
    }

    public static void main(String[] args) {
        int n=15;
        System.out.println(fizzBuzz(n));
    }
}
