package SOL_2022_11_week3;

public class Q38 {
    public static String countAndSay(int n) {

        String res = "1";

        for(int i=1; i<n; i++) {
            res = say(res);
        }
        return res;
    }

    public static String say(String res) {
        int p1 = 0;
        int p2 = 0;
        String temp = "";

        while(p2<res.length()) {
            if(res.charAt(p1)!=res.charAt(p2)) {
                temp+=((p2-p1)+""+res.charAt(p1));
                p1=p2;
            }
            p2++;
        }
        temp+=((p2-p1)+""+res.charAt(p1));

        return temp;
    }


    public static void main(String[] args) {
        int n=4;
        System.out.println(countAndSay(n));
    }
}
