package SOL_2023_02_week4;

public class Q92342 {

    public static void main(String[] args) {
        int n = 10;
        int[] info = {0,0,0,0,0,0,0,0,3,4,3};

        new Q92342().solution(10, info);
    }

    int[] answer = {-1};
    int max = -1;

    public int[] solution(int n, int[] info) {

        dfs(n, info, new int[11], 0);

        return answer;
    }

    public void dfs(int n, int[] info, int[] lion, int cnt) {

        if(n==cnt) {
            int apeach_total = 0;
            int lion_total = 0;

            for(int i=10; i>=0; i--) {
                if(info[10-i]==0&&lion[10-i]==0) continue;

                if(info[10-i]<lion[10-i]) {
                    lion_total+=i;
                } else {
                    apeach_total+=i;
                }
            }
            if(lion_total>apeach_total && max<=lion_total-apeach_total) {
                max = lion_total-apeach_total;
                answer = lion.clone();
            }
            return;
        }

        for(int i=0; i<11; i++) {
            if(lion[i]>info[i]) break;
            lion[i]++;
            dfs(n, info, lion, cnt+1);
            lion[i]--;
        }
    }
}
