package SOL_2023_03_week2;

public class Q70129 {
    public static void main(String[] args) {
        System.out.println(new Q70129().solution("01110"));
    }

    public int[] solution(String s) {
        int[] answer = new int[2];

        int zero = 0;
        int cnt = 0;

        while(!"1".equals(s)) {
            int len = s.length();

            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i)=='0') {
                    zero++;
                    len--;
                }
            }
            cnt++;

            s=toBinary(len);
        }

        answer[0]=cnt;
        answer[1]=zero;

        return answer;
    }

    public String toBinary(int num) {
        String str="";

        int mok = num;
        while(mok!=0) {
            str+=String.valueOf(mok%2);
            mok/=2;
        }

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        return reverse;
    }
}
