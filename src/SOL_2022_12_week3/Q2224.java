package SOL_2022_12_week3;

public class Q2224 {
    public static int convertTime(String current, String correct) {
        int cur = Integer.parseInt(current.substring(0,2))*60+Integer.parseInt(current.substring(3));
        int cor = Integer.parseInt(correct.substring(0,2))*60+Integer.parseInt(correct.substring(3));

        int diff = cor-cur;

        int cnt = 0;

        cnt+=diff/60;
        diff%=60;

        cnt+=diff/15;
        diff%=15;

        cnt+=diff/5;
        diff%=5;

        cnt+=diff/1;
        diff%=1;

        return cnt;
    }

    public static void main(String[] args) {
        String current = "02:30";
        String correct = "04:35";

        System.out.println(convertTime(current, correct));
    }
}
