package SOL_2023_02_week2;

public class Q92335 {

    public static void main(String[] args) {
        int n = 1100011;
        int k = 10;

        System.out.println((solution(n,k)));
    }

    public static int solution(int n, int k) {
        int answer = 0;

        String[] num = convertKbinary(n, k).split("0");

        for(int i=0;i<num.length;i++){
            if("".equals(num[i])) continue;
            if(isPrime(Long.parseLong(num[i]))){
                answer++;
            }
        }

        return answer;
    }

    // k진수로 변환
    public static String convertKbinary(int n, int k) {
        StringBuilder sb = new StringBuilder();
        String numK = "";
        while(n!=0) {
            numK+=String.valueOf(n%k);
            n/=k;
        }
        numK = sb.append(numK).reverse().toString();

        return numK;
    }
    // 소수판별
    public static boolean isPrime(long num) {
        if(num==0 || num==1) return false;

        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num%i==0) return false;
        }

        return true;
    }
}
