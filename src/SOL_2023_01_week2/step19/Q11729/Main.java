package SOL_2023_01_week2.step19.Q11729;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int cnt = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        hanoi(n, 1, 3, 2);

        System.out.println(cnt);
        System.out.println(sb);
    }
    public static void hanoi(int n, int start, int end, int via) {
        if(n==0) return;

        hanoi(n-1, start, via, end);
        sb.append(start+" "+end+"\n"); cnt++;
        hanoi(n-1, via, end, start);
    }
}
