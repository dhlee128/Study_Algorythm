package SOL_2022_12_week3;

public class Q861 {
    public static int matrixScore(int[][] grid) {
        int res = 0;

        for(int i=0; i<grid.length; i++) {
            if(grid[i][0]==0) {
                for(int j=1; j<grid[i].length; j++) {
                    grid[i][j]=grid[i][j]==0?1:0;
                }
            }
        }

        res = (int) Math.pow(2,grid[0].length-1)*grid.length;

        for(int i=1; i<grid[0].length; i++) {
            int zeroCount = 0;
            int num = (int) Math.pow(2,grid[0].length-1-i);

            for(int j=0; j<grid.length; j++) {
                if(grid[j][i]==0) zeroCount++;
            }

            if(grid.length-zeroCount > zeroCount) {
                res+=num*(grid.length-zeroCount);
            } else {
                res+=num*zeroCount;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] grid = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        System.out.println(matrixScore(grid));

    }
}
