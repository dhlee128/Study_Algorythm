package SOL_2022_12_week4;

public class Q1769 {
    public static int[] minOperations(String boxes) {
        int[] res = new int[boxes.length()];

        for(int i=0; i<boxes.length(); i++) {
            for(int j=0; j<boxes.length(); j++) {
                int cost = 0;
                if(i!=j && boxes.charAt(j)=='1') cost += Math.abs(i-j);
                res[i]+=cost;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String boxes = "110";
        System.out.println(minOperations(boxes));
    }
}
