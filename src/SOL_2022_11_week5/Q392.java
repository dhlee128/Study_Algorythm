package SOL_2022_11_week5;

public class Q392 {
    public static boolean isSubsequence(String s, String t) {

        int p1 = 0;
        int p2 = 0;

        while(p1!=s.length() && p2!=t.length()) {
            if(s.charAt(p1) == t.charAt(p2)) {
                p1++;
            }
            p2++;
        }
        if(p1==s.length()) return true;
        return false;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
}
