package SOL_2023_01_week1;

public class Q1927 {
    static class Node {
        int q;
        int sum;

        public Node(){this.q=0;this.sum=0;}
        public Node(int q, int sum) {
            this.q = q;
            this.sum = sum;
        }
    }

    public static boolean sumGame(String num) {

        Node left = new Node();
        Node right = new Node();

        int len = num.length();

        for(int i=0; i<len/2; i++) {
            if(num.charAt(i)=='?') {
                left.q++;
            } else {
                left.sum+=num.charAt(i)-'0';
            }

            if(num.charAt(len-i-1)=='?') {
                right.q++;
            } else {
                right.sum+=num.charAt(len-i-1)-'0';
            }
        }
        if((left.q+right.q)%2==1) return true;
        if(left.q == right.q && left.sum != right.sum) return true;

        if(left.q > right.q && left.sum > right.sum) return true;
        return Math.abs(left.sum-right.sum)!=9*Math.abs(left.q- right.q)/2;
    }

    public static void main(String[] args) {
        String num = "?6?6?000?3";
        System.out.println(sumGame(num));
    }
}
