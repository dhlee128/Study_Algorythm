package SOL_2022_12_week2;

public class Q942 {

    public static int[] diStringMatch(String s) {
        int[] res = new int[s.length()+1];
        int h = 0;
        int t = s.length();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='I') {
                res[i]=h++;
            } else {
                res[i]=t--;
            }
        }
        res[s.length()] = h;
        return res;
    }


    public static void main(String[] args) {
        String s = "IDID";
        System.out.println(diStringMatch(s));
    }
}
