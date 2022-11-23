package SOL_2022_11_week4;

public class Q28 {
    public static int strStr(String haystack, String needle) {
        int p1 = 0;
        int i = 0;

        while(p1<haystack.length()) {
            if(haystack.charAt(p1)==needle.charAt(i)) {
                if(i==needle.length()-1) return p1-i;
                i++;
            } else {
                p1=p1-i;
                i=0;
            }
            p1++;
        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));
    }
}
