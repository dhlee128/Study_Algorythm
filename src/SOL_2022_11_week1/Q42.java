package SOL_2022_11_week1;

public class Q42 {
    public static int trap(int[] height) {
        int res = 0;

        int h = height.length;

        int[] right = new int[h];
        int[] left = new int[h];

        int maxR = height[h-1];
        int maxL = height[0];
        for(int i=0; i<h; i++) {
            maxL = Math.max(maxL, height[i]);
            left[i] = maxL;

            maxR = Math.max(maxR, height[h-1-i]);
            right[h-i-1] = maxR;
        }

        for(int i=1; i<h-1; i++) {
            if(height[i]<left[i-1] && height[i]<right[i+1]) {
                res += Math.min(left[i-1], right[i+1])-height[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
