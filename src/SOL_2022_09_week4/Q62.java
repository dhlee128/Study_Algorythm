package SOL_2022_09_week4;

public class Q62 {

    public static void main(String[] args) {
        System.out.println(uniquePaths(3,7));
    }

    public static int uniquePaths(int m, int n) {
        int[][] map = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                map[i][j] = 1;
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i>=1 && j>=1) map[i][j] = map[i][j-1] + map[i-1][j];
            }
        }

        return map[m-1][n-1];
    }

}
