package SOL_2023_01_week1;

public class Q1400 {
    public static boolean canConstruct(String s, int k) {

        if(s.length()<k) return false;

        char[] arr = new char[26];
        for(int i=0; i<s.length(); i++) {
            arr[s.charAt(i)-'a']++;
        }
        int odd = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%2!=0) odd++;
        }
        if(odd>k) return false;

        return true;
    }

    public static void main(String[] args) {
        String s = "annabelle";
        int k = 2;
        System.out.println(canConstruct(s,k));
    }
}
