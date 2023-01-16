package SOL_2023_01_week2.step22.Q1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        String[] rows = new String[row];
        for(int i=0; i<row; i++) {
            rows[i] = br.readLine();
        }
        br.close();

        int res = Integer.MAX_VALUE;
        for(int i=0; i<=row-8; i++) {
            for(int j=0; j<=col-8; j++) {
                res = Math.min(find(rows, i, j), res);
            }
        }
        System.out.println(res);
    }

    public static int find(String[] rows, int x, int y) {
        String[] pan = {"WBWBWBWB","BWBWBWBW"};

        int sol = 0;

        for(int i=0; i<8; i++) {
            int xx = i+x;
            for(int j=0; j<8; j++) {
                int yy = j+y;
                if(rows[xx].charAt(yy)!=pan[i%2].charAt(j)) sol++;
            }
        }
        return Math.min(sol, 64-sol);
    }
}
