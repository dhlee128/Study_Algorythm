package SOL_2022_12_wek1;

public class Q1395 {

    public static int numTeams(int[] rating) {
        return numTeam(rating, true) + numTeam(rating, false);
    }

    public static int numTeam(int[] rating, boolean increase) {
        int cnt = 0;
        int[] dp = new int[rating.length];

        for(int i=1; i<rating.length; i++) {
            for(int j=i-1; j>=0; j--) {
                boolean flag = increase==true?rating[i]>rating[j]:rating[i]<rating[j];
                if(flag) {
                    dp[i]++;
                    if(dp[j]>0) cnt+=dp[j];
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] rating = {1,2,3,4};
        System.out.println(numTeams(rating));
    }

}
