package SOL_2022_11_week5;

import java.util.ArrayList;
import java.util.List;

public class Q119 {
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list  = new ArrayList<>();

        List<Integer> rowList;
        rowList = new ArrayList<>();
        rowList.add(1);
        list.add(rowList);

        rowList = new ArrayList<>();
        rowList.add(1);
        rowList.add(1);
        list.add(rowList);

        for(int i=2; i<=rowIndex; i++) {
            rowList = new ArrayList<>();
            rowList.add(1);
            for(int j=1; j<i; j++) {
                rowList.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
            rowList.add(1);
            list.add(rowList);
        }
        return list.get(rowIndex);
    }

    public static void main(String[] args) {
        int rowIndex = 3;
        System.out.println(getRow(rowIndex));
    }
}
