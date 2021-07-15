package week13;
//48. Rotate Image
public class Q48 {

    public static void rotate(int[][] matrix) {
        int[][] tmp=new int[matrix.length] [matrix[0].length];
        for(int i=0;i<tmp.length;i++){
            for(int j=0;j<tmp[0].length;j++){
                tmp[j][tmp.length-i-1]=matrix[i][j];
            }
        }

        for(int i=0;i<tmp.length;i++){
            for(int j=0;j<tmp[0].length;j++){
                matrix[i][j]=tmp[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
    }
}
