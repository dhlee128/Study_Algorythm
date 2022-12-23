package week12;

public class Q807 {
    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] row = new int[grid.length];
        int[] col = new int[grid[0].length];
        int total = 0;

        for (int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {
                col[j] = Math.max(col[j], grid[i][j]);
                row[i] = Math.max(row[i], grid[i][j]);
                total+=grid[i][j];
            }
        }
        int sum = 0;
        for (int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {
                sum+=Math.min(col[j], row[i]);
            }
        }
        return sum-total;
    }

    public static void main(String[] args) {
        int[][] grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        System.out.println(maxIncreaseKeepingSkyline(grid));
    }
}
