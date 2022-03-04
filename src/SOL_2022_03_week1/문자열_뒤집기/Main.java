package SOL_2022_03_week1.문자열_뒤집기;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] arr = input.toCharArray();

        String output = "";
        for(int i=arr.length-1;i>=0;i--){
            output+=arr[i];
        }
        System.out.println(output);
    }
}
