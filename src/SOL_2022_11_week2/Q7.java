package SOL_2022_11_week2;

//7. Reverse Integer
public class Q7 {

    public static int reverse(int x) {
        int ans = 0;
        int check = 0;
        boolean isPositive = true;
        if(x<0) isPositive = false;

        x = Math.abs(x);

        while(x!=0) {
            check = check*10+x%10;
            if(ans!=(check-x%10)/10) return 0;
            x/=10;
            ans = check;
        }
        if(!isPositive) ans*=-1;

        return ans;
    }

    public static void main(String[] args) {
        int x = Integer.MIN_VALUE;
        System.out.println(reverse(x));
    }
}
