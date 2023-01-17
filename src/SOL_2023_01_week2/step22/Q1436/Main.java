package SOL_2023_01_week2.step22.Q1436;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(movie(n));
    }
    static int cnt = 0;
    static int i = 666;
    public static int movie(int n) {
        if(Integer.toString(i).contains("666")) cnt++;
        if(n==cnt) return i;
        i++;

        return movie(n);
    }
}
