package SOL_2022_09_week5;

//1844. Replace All Digits with Characters
public class Q1844 {
    public static String replaceDigits(String s) {
        char[] cArr = s.toCharArray();
        for(int i=0;i<cArr.length-1; i=i+2){//'a'->97
            cArr[i+1] = (char)((int)cArr[i]+cArr[i+1]-'0');
        }
        return new String(cArr);
    }

    public static void main(String[] args) {
        String s = "a1c1e1";

        System.out.println(replaceDigits(s));
    }
}
