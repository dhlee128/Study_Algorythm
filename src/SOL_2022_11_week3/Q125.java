package SOL_2022_11_week3;

import java.util.Locale;

public class Q125 {
    public static boolean isPalindrome(String s) {
        String regex = "[^0-9a-zA-Z]";
        s = s.replaceAll(regex,"").toLowerCase();

        for(int i=0; i<s.length()/2; i++) {
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
