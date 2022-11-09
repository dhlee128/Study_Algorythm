package SOL_2022_11_week2;

import java.util.HashMap;
import java.util.Map;

public class Q166 {

    public static String fractionToDecimal(int numerator, int denominator) {
        StringBuilder sb = new StringBuilder();

        if((numerator<0 && denominator>0)||(numerator>0 && denominator<0)) sb.append("-");

        long num = Math.abs(Long.valueOf(numerator));
        long denom = Math.abs(Long.valueOf(denominator));

        sb.append(num/denom);
        num%=denom;
        if(num%denom==0) return sb.toString();
        sb.append(".");

        Map<Long, Integer> map = new HashMap<>();

        while(num!=0) {
            if(map.containsKey(num)) {
                sb.insert(map.get(num),"(");
                sb.append(")");
                break;
            }
            map.put(num, sb.length());
            num*=10;
            sb.append(num/denom);
            num%=denom;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int numerator = 4;
        int denominator = 333;

        System.out.println(fractionToDecimal(numerator, denominator));
    }
}
