package SOL_2022_12_week4;

public class Q852 {
    public static int peakIndexInMountainArray(int[] arr) {
        int res = 0;
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i]>arr[i+1]) {
                res = i;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
