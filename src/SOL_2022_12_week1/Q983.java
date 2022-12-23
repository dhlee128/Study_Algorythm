package SOL_2022_12_week1;

public class Q983 {
    public static int mincostTickets(int[] days, int[] costs) {
        int lastDay = days[days.length-1];
        int[] dp = new int[lastDay+1];
        boolean[] flag = new boolean[lastDay+1];

        for(int i=0; i<days.length; i++) {
            flag[days[i]] = true;
        }

        for(int i=1; i<=lastDay; i++) {
            if(flag[i]) {
                dp[i] = Math.min(dp[i-1]+costs[0], Math.min(dp[Math.max(i-7,0)]+costs[1], dp[Math.max(i-30,0)]+costs[2]));
            } else {
                dp[i] = dp[i-1];
            }
        }
        return dp[lastDay];
    }

    public static void main(String[] args) {
        int[] days = {1,4,6,7,8,20};
        int[] costs = {2,7,15};
        System.out.println(mincostTickets(days, costs));
    }
}
