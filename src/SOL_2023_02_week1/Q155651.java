package SOL_2023_02_week1;

public class Q155651 {
    public int solution(String[][] book_time) {
        int ans = Integer.MIN_VALUE;

        int[] arr = new int[2401];

        for(int i=0; i<book_time.length; i++) {
            int start = timeToInt(book_time[i][0]);
            int end = timeToInt(book_time[i][1]);

            arr[start] += 1;
            arr[end+10] -= 1;
        }

        for(int i=1; i<arr.length; i++) {
            arr[i]+=arr[i-1];
            ans=Math.max(arr[i],ans);
        }
        return ans;
    }

    public int timeToInt(String time) {
        String[] split = time.split(":");
        return Integer.parseInt(split[0])*60+Integer.parseInt(split[1]);
    }
}
