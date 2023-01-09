package SOL_2023_01_week1;

public class Q714 {
    public static int maxProfit(int[] prices, int fee) {
        int mn = prices[0];
        int ans = 0;
        for(int i=1; i<prices.length; i++) {
            if(prices[i]<mn) mn=prices[i];
            if(prices[i]-fee>mn) {
                ans+=(prices[i]-fee-mn);
                mn = prices[i]-fee;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] prices = {1,3,2,8,4,9};
        int fee = 2;
        System.out.println(maxProfit(prices, fee));
    }
}
