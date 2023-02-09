package SOL_2023_02_week2;

import java.util.Arrays;
import java.util.Comparator;

public class Q42746 {
    public String solution(int[] numbers) {
        String[] strings = new String[numbers.length];

        for(int i=0; i<numbers.length; i++) {
            strings[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        String ans = "";

        for(int i=0; i<numbers.length; i++) {
            if(i==0 && "0".equals(strings[0])) return "0";
            ans+=strings[i];
        }

        return ans;
    }
}
