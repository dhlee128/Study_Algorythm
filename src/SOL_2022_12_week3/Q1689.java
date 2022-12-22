package SOL_2022_12_week3;

public class Q1689 {
    public static int minPartitions(String n) {

        int max = 0;

        for(int i=0; i<n.length(); i++) {
            max = Math.max(n.charAt(i), max);
        }

        return max-'1'+1;
    }

    public static void main(String[] args) {
        String n = "32";
        System.out.println(minPartitions(n));
    }
}
