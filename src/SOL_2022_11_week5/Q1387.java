package SOL_2022_11_week5;

import java.util.Arrays;

public class Q1387 {

    static class Node {
        int num;
        int cnt;

        Node(int num, int cnt) {
            this.num = num;
            this.cnt = cnt;
        }
    }

    public static int getKth(int lo, int hi, int k) {

        Node[] arr = new Node[hi-lo+1];
        int idx = 0;

        for(int i=lo; i<=hi; i++) {
            arr[idx++] = new Node(i, cal(i));
        }

        Arrays.sort(arr, (a, b)-> {
            return a.cnt - b.cnt;
        });

        return arr[k-1].num;
    }

    public static int cal(int num) {
        int cnt = 0;
        while(num != 1) {
            if(num%2==0) {
                num/=2;
            } else {
                num = 3*num+1;
            }
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int lo = 12;
        int hi = 15;
        int k = 2;
        System.out.println(getKth(lo, hi, k));
    }

}
