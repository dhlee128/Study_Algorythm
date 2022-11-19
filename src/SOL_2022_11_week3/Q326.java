package SOL_2022_11_week3;

public class Q326 {
    public static boolean isPowerOfThree(int n) {
        while(n>=3){
            if(n%3!=0) return false;
            n/=3;
        }
        if(n==1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 27;
        System.out.println(isPowerOfThree(n));
    }
}
