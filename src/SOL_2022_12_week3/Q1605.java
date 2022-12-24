package SOL_2022_12_week3;

public class Q1605 {
    public static int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int r = rowSum.length;
        int c = colSum.length;

        int[][] arr = new int[r][c];

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                arr[i][j] = Math.min(rowSum[i], colSum[j]);
                rowSum[i] -= arr[i][j];
                colSum[j] -= arr[i][j];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] rowSum = {3,8};
        int[] colSum = {4,7};

        System.out.println(restoreMatrix(rowSum, colSum));
    }

}
