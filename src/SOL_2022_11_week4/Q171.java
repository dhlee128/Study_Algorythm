package SOL_2022_11_week4;

public class Q171 {

    public static int titleToNumber(String columnTitle) {
        int res = 0;
        int p = 0;

        for(int i=columnTitle.length()-1; i>=0; i--) {
            res += ((columnTitle.charAt(i)-'A'+1)*Math.pow(26,p++));
        }
        return res;
    }

    public static void main(String[] args) {
        String columnTitle = "AB";
        System.out.println(titleToNumber((columnTitle)));
    }

}
