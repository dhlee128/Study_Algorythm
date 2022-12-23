package SOL_2022_12_week1;

import java.util.HashSet;
import java.util.Set;

public class Q1525 {
    public static int numSplits(String s) {
        int cnt = 0;
        int[] pre = new int[s.length()];
        int[] suf = new int[s.length()];

        Set<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++) {
            set.add(s.charAt(i));
            pre[i] = set.size();
        }
        set = new HashSet<>();
        for(int i=s.length()-1; i>=0; i--) {
            set.add(s.charAt(i));
            suf[i] = set.size();
        }

        for(int i=0; i<s.length()-1; i++) {
            if(pre[i]==suf[i+1]) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        String s = "aacaba";
        System.out.println(numSplits(s));
    }
}
