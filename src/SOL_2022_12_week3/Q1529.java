package SOL_2022_12_week3;

public class Q1529 {
    public static int minFlips(String target) {
        int cnt = 0;

        for(int i=0; i<target.length(); i++) {
            if(cnt%2==1) {
                if(target.charAt(i)=='0') {
                    cnt++;
                }
            } else {
                if(target.charAt(i)=='1') {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        String target = "10111";
        System.out.println(minFlips(target));
    }
}
