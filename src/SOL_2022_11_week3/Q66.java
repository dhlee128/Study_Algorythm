package SOL_2022_11_week3;

public class Q66 {
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        boolean carry = true;
        for(int i=len-1; i>=0&&carry; i--) {
            digits[i]=(digits[i]+1)%10;
            if(digits[i]!=0) carry = false;
        }
        if(digits[0]==0) {
            digits = new int[len+1];
            digits[0] = 1;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {1,2,3};
        plusOne(digits);
    }
}
