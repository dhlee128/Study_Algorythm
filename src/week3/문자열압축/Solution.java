package week3.문자열압축;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        String s="abcabcabcabcdededededede";
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        int answer;

        if(s.length()==1) {
            answer = 1;
        }else {
            answer = Integer.MAX_VALUE;
        }

        for(int i=1; i<=s.length()/2; i++){//문자 수
            int idx1 = 0;//비교할 문자열1의 시작 인덱스
            String find1 = s.substring(idx1, idx1+i);//비교할 문자열1
            String result="";
            int cnt=1;

            for(int j=0; j<(s.length()/i)-1; j++){//비교할 문자열 개수
                int idx2 = idx1+i;//비교할 문자열2의 시작 인덱스
                String find2=s.substring(idx2,idx2+i);//비교할 문자열2

                if(find1.equals(find2)){
                    cnt++;
                }else{//다음 문자열과 다르다면
                    if(cnt==1){//압출할 문자열이 1개면 1을 생략
                        result+=find1;
                    }else{
                        result+=(cnt+find1);
                    }
                    cnt=1;
                }
                find1=find2;//비교할 문자열1(기준)
                idx1=idx2;//비교할 문자열1 시작 인덱스

                if(j==(s.length()/i)-2) {
                    if(cnt==1){
                        result+=find1;
                    }else{
                        result+=(cnt+find1);
                    }
                }
            }

            if(s.length()%i!=0){//나머지 문자열
                result+=s.substring(s.length()-s.length()%i);
            }
            //System.out.println(">>>"+i+":"+result);
            answer = Math.min(answer,result.length());
        }
        return answer;
    }
}
