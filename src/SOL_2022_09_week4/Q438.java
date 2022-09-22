package SOL_2022_09_week4;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q438 {

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        System.out.println(findAnagrams(s,p));
    }

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> res = new ArrayList<>();

        int[] patternArray = new int[256];

        for(int i=0;i<p.length();i++){
            patternArray[p.charAt(i)]++; //패턴 1로 초기화
        }

        for(int start=0; start<=s.length()-p.length(); start++){ //시작 인덱스는 0부터 s.length()-p.length() 까지
            boolean isSame = true;
            int[] findArray = new int[256];

            for(int end=start; end<=p.length()+start-1; end++){ //종료 인덱스는 start 부터 p.length()+start-1 까지
                findArray[s.charAt(end)]++;
            }

            for(int k=0; k<256; k++){
                if(patternArray[k]!=findArray[k]) { //두 배열 원소가 하나라도 다를 경우 false
                    isSame = false;
                    break;
                }
            }
            if(isSame) res.add(start);
        }
        return res;
    }
}
