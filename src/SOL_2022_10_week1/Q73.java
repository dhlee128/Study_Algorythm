package SOL_2022_10_week1;

public class Q73 {

    public static void setZeroes(int[][] matrix) {
        boolean[][] isZero = new boolean[matrix.length][matrix[0].length];

        for(int i=0;i<matrix.length; i++) {
            for(int j=0;j<matrix[0].length;j++) {
                if(matrix[i][j]==0) {
                    isZero[i][j]=true;
                }
            }
        }

        for(int i=0;i<matrix.length; i++) {
            for(int j=0;j<matrix[0].length;j++) {
                if(isZero[i][j]==true){
                    for(int k=0; k<matrix[0].length; k++) {
                        matrix[i][k] = 0;
                    }

                    for(int k=0; k<matrix.length; k++) {
                        matrix[k][j] = 0;
                    }
                }
            }
        }
    }
    // 0 1 2 0
    // 3 4 0 2
    // 1 3 1 5
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
        for(int i=0;i<matrix.length; i++) {
            for(int j=0;j<matrix[0].length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
