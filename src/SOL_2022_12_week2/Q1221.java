package SOL_2022_12_week2;

public class Q1221 {
    public static int balancedStringSplit(String s) {
        int cnt = 0;

        int lLen = 0;
        int rLen = 0;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='L') {
                lLen++;
            } else {
                rLen++;
            }
            if(lLen==rLen) {
                cnt++;
                lLen=0;
                rLen=0;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }
}
