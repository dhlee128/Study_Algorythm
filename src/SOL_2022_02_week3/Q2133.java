package SOL_2022_02_week3;

import java.util.*;

//2133. Check if Every Row and Column Contains All Numbers
public class Q2133 {

    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,2,3},{1,2,3}};
        System.out.println(checkValid(matrix));
    }

    public static boolean checkValid(int[][] matrix) {
        int n = matrix.length;//nxn 행렬,1부터 n까지 수가 있어야함

        for(int i=0; i<n; i++){
            TreeSet<Integer> rSet = new TreeSet<>();
            TreeSet<Integer> lSet = new TreeSet<>();

            for(int j=0; j<n; j++){
                rSet.add(matrix[i][j]);
                lSet.add(matrix[j][i]);
            }
            //행 검사
            if(rSet.size()!=n || rSet.last()!=n){
                return false;
            }
            //열 검사
            if(lSet.size()!=n || lSet.last()!=n){
                return false;
            }
        }
        return true;
    }
}
