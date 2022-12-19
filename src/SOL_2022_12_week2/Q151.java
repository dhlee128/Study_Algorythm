package SOL_2022_12_week2;

import java.util.Stack;

public class Q151 {
    public static String reverseWords(String s) {
        String[] array = s.split(" ");
        StringBuilder result = new StringBuilder();
        System.out.println(array[0]+","+array[1]+","+array[2]+","+array[3]+","+array[4]);
        for(String word : array) {
            StringBuilder sb = new StringBuilder(word);
            result.append(sb.reverse() + " ");
        }
        return result.reverse().toString().trim();
    }

    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }
}
