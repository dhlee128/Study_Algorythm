package week6;

import java.util.*;

//873. Length of Longest Fibonacci Subsequence
public class Q873 {

    public static void main(String[] args) {
        int[] arr={1,3,7,11,12,14,18};
        System.out.println(lenLongestFibSubseq(arr));
    }

    public static int lenLongestFibSubseq(int[] arr) {

        Set<Integer> fibo = new HashSet<>();
        int res=0;

        for(int num:arr){
            fibo.add(num);
        }
        // fibo[i], fibo[i+1] 구하기 -> fibo[i+2]
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int cnt=2;//피보나치 수열이 가능한 원소 개수
                int p1=arr[i];// fibo[i]
                int p2=arr[j];// fibo[j]
                while(true){
                    int sum=p1+p2;
                    if(fibo.contains(sum)){// 포함O
                        cnt++;
                        int tmp=p1;
                        p1=p2;
                        p2+=tmp;
                    }else{// 포함X
                        break;
                    }
                }
                res=Math.max(res,(cnt==2)?0:cnt);
            }
        }
        return res;
    }

}
