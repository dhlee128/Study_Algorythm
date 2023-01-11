package SOL_2023_01_week2.step19.Q2447;

import java.util.Scanner;

public class Main {
    static char[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        arr = new char[N][N];

        star(0,0,N,false);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        sc.close();
        System.out.println(sb);
    }
    public static void star(int x, int y, int n, boolean blank) {

        if(blank) {
            for(int i=x; i<x+n; i++) {
                for(int j=y; j<y+n; j++) {
                    arr[i][j]=' ';
                }
            }
            return;
        }

        if(n==1) {
            arr[x][y]='*';
            return;
        }

        int size = n/3;
        int cnt = 0;
        for(int i=x; i<x+n; i+=size) {
            for(int j=y; j<y+n; j+=size) {
                cnt++;
                boolean bFlag = false;
                if(cnt==5) bFlag = true;
                star(i,j,size,bFlag);
            }
        }

    }
}
