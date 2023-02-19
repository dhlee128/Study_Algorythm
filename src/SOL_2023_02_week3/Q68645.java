package SOL_2023_02_week3;

public class Q68645 {
    public static void main(String[] args) {
        int n=4;
        new Q68645().solution(n);
    }

    public int[] solution(int n) {
        int[][] map = new int[n][n];

        int x=-1;
        int y=0;

        int num=1;
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                if(i%3==0) {
                    x++;
                }else if(i%3==1) {
                    y++;
                }else {
                    x--;
                    y--;
                }
                map[x][y]=num;
                num++;
            }
        }

        int[] answer = new int[n*(n+1)/2];

        int idx=0;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(map[i][j]==0) continue;
                answer[idx++] = map[i][j];
            }
        }

        return answer;
    }
}
