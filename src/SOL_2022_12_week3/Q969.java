package SOL_2022_12_week3;

import java.util.ArrayList;
import java.util.List;

public class Q969 {

    public static List<Integer> pancakeSort(int[] arr) {
        List<Integer> res = new ArrayList<>();
        int num = arr.length;

        while(num!=1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num && i + 1 != num) {
                    if(i!=0) {
                        res.add(i + 1);
                        reverse(arr, i + 1);
                    }
                    res.add(num);
                    reverse(arr, num);
                }
            }
            num--;
        }
        return res;
    }

    public static void reverse(int[] arr, int index) {
        for(int i=0; i<index/2; i++) {
            int temp = arr[i];
            arr[i] = arr[index-1-i];
            arr[index-1-i] = temp;
        }
    }


    public static void main(String[] args) {
        int[] arr = {3,2,4,1};
        System.out.println(pancakeSort(arr));
    }
}
