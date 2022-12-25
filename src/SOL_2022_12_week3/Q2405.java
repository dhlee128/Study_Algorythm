package SOL_2022_12_week3;

public class Q2405 {
    public static int partitionString(String s) {
        int res = 1;
        String temp = "";

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(temp.contains(String.valueOf(c))) {
                res++;
                temp = "";
            }
            temp+=c;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abacaba";
        System.out.println(partitionString(s));
    }
}
