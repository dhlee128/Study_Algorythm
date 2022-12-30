package SOL_2022_12_week4;

import java.util.Arrays;

public class Q1433 {
    public static boolean checkIfCanBreak(String s1, String s2) {

        char[] stringToChar1 = s1.toCharArray();
        char[] stringToChar2 = s2.toCharArray();
        Arrays.sort(stringToChar1);
        Arrays.sort(stringToChar2);

        int s1Cnt = 0;
        int s2Cnt = 0;

        for(int i=0; i<s1.length(); i++) {
            if(stringToChar1[i]>=stringToChar2[i]) {
                s1Cnt++;
            }
            if(stringToChar1[i]<=stringToChar2[i]) {
                s2Cnt++;
            }
        }
        return (s1Cnt==s1.length()||s2Cnt==s2.length());
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "xya";

        System.out.println(checkIfCanBreak(s1, s2));
    }

}
