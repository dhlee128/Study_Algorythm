package SOL_2022_11_week4;

public class Q14 {
    public static String longestCommonPrefix(String[] strs) {
        String str = strs[0];

        for(int i=1;i<strs.length; i++) {
            while(strs[i].indexOf(str)!=0) {
                if(str.length()==1) return "";
                str = str.substring(0,str.length()-1);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String[] strs = {"c","acc","ccc"};
        System.out.println(longestCommonPrefix(strs));
    }
}
