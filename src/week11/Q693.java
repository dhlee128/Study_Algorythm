package week11;

//693. Binary Number with Alternating Bits
public class Q693 {

    public static void main(String[] args){

        System.out.println(hasAlternatingBits(10));
    }

    public static boolean hasAlternatingBits(int n) {
        int pre=n%2;
        n=n/2;

        while(n!=0){
            if(pre==n%2) return false;
            pre=n%2;
            n=n/2;
        }

        return true;
    }

}
