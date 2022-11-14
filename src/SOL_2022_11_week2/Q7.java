package SOL_2022_11_week2;

//7. Reverse Integer
public class Q7 {

    public static int reverse(int x) {
        int ans = 0;
        int check = 0;

        while(x!=0) {
            check = check*10+x%10;
            if(ans!=(check-x%10)/10) return 0;
            x/=10;
            ans = check;
        }

        return ans;
    }

    public static void main(String[] args) {
        int x = Integer.MIN_VALUE;
        System.out.println(reverse(x));
    }
}
