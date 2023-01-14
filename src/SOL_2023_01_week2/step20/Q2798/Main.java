package SOL_2023_01_week2.step20.Q2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());

        int[] card = new int[n];

        st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<n; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        int res = blackJ(card, n, max);

        System.out.println(res);
    }

    public static int blackJ(int[] card, int n, int max) {
        int res = 0;

        for(int i=0; i<card.length-2; i++) {
            for(int j=i+1; j<card.length-1; j++) {
                for(int k=j+1; k<card.length; k++) {
                    int sum = card[i]+card[j]+card[k];

                    if(sum==max) return sum;

                    if(sum<max && res<sum) res = sum;
                }
            }
        }
        return res;
    }
}
