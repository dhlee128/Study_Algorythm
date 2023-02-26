package SOL_2023_02_week4;

public class Q42883 {

    public static void main(String[] args) {
        System.out.println(new Q42883().solution("4177252841",4));
    }

    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder("");

        int len = number.length();
        int start = 0;

        for(int i=0; i<len-k; i++) {
            int max = 0;
            for(int j=start; j<=k+i; j++) {
                int temp = number.charAt(j)-'0';
                if(max<temp) {
                    max = temp;
                    start = j+1;
                }
            }
            answer.append(max);
        }

        return answer.toString();
    }
}
