package SOL_2022_10_week2;

//378. Kth Smallest Element in a Sorted Matrix
public class Q378 {

    public static void main(String[] args) {
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        int k = 8;
        System.out.println(kthSmallest(matrix, k));
    }
    // 1 2
    // 1 3
    //(1, 3, 2) (1, 1, 1) (2, 1, ) ::k-3
    public static int kthSmallest(int[][] matrix, int k) {

        int min = matrix[0][0];
        int max = matrix[matrix.length-1][matrix[0].length-1];

        while(min<=max) {
            int mid = (max-min)/2+min;
            int count = 0;

            for(int i=0; i<matrix.length; i++) {
                for(int j=0; j<matrix[0].length; j++) {
                    if(mid < matrix[i][0]) break;
                    if(matrix[i][j] <= mid) count++;
                }
            }

            if(count >= k) max = mid-1;
            if(count < k) min = mid+1;
        }
        return min;
    }
}
