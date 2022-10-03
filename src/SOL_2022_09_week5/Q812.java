package SOL_2022_09_week5;

public class Q812 {

    public static void main(String[] args) {
        int[][] points = {{0,0},{0,1},{1,0},{0,2},{2,0}};
        System.out.println(largestTriangleArea((points)));
    }

    public static double largestTriangleArea(int[][] points) {
        double ans = 0;

        int len = points.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                for(int k=j+1;k<len;k++){
                    int[] a = points[i];
                    int[] b = points[j];
                    int[] c = points[k];

                    double res = Math.abs(a[0]*b[1]+b[0]*c[1]+c[0]*a[1]-a[0]*c[1]-b[0]*a[1]-c[0]*b[1])*0.5;

                    ans = Math.max(ans,res);
                }
            }
        }
        return ans;
    }
}
