package SOL_2022_02_week4.소수_판별;

import java.io.*;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String res="False";

        int num = Integer.parseInt(input);

        if(PrimeNum(num)) res="True";

        System.out.println(res);
    }

    //O(N)
    public static boolean PrimeNum(int num){
        boolean res=false;

        int cnt =0;
        for(int i=2;i<num;i++){
            if(num%i==0) cnt++;
        }

        if(cnt==0){
            res=true;
        }

        return res;
    }

    //O(rootN)
    public static boolean PrimeNum2(int num){
        int sqrtN = (int)Math.sqrt(num);
        for(int i=2;i<=sqrtN;i++){
            if(num%i==0) return false;
        }
        return true;
    }
}