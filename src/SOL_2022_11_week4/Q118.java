package SOL_2022_11_week4;

import java.util.ArrayList;
import java.util.List;

public class Q118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> list;

        list = new ArrayList<>();
        list.add(1);
        res.add(list);

        if(numRows==1) return res;

        list = new ArrayList<>();
        list.add(1);
        list.add(1);
        res.add(list);

        for(int i=2; i<numRows; i++) {
            list = new ArrayList<>();
            list.add(1);
            for(int j=1; j<=i-1; j++) {
                list.add(res.get(i - 1).get(j-1) + res.get(i - 1).get(j));
            }
            list.add(1);

            res.add(list);
        }

        return res;
    }

    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows));
    }
}
