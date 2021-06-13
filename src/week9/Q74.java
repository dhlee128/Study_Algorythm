package week9;

//74. Search a 2D Matrix
public class Q74 {
    public static void main(String[] args){
        int[][] matrix={{1}};
        int target = 2;

        System.out.println(searchMatrix(matrix,target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int x=-1;
        //적합한 행 찾기, target < (n+1)행 0열 값
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]>target){//(n+1)행 0열 값
                if(i==0){
                    return false;
                }else{
                    x=i-1; break;
                }
            }
            if(i==matrix.length-1){
                x=i; break;
            }
        }

        //x 행에서 target 찾기
        for(int i=0;i<matrix[x].length;i++){
            if(matrix[x][i]==target){
                return true;
            }
            if(matrix[x][i]>target){
                return false;
            }
        }
        return false;
    }
}
