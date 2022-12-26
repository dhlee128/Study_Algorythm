package SOL_2022_12_week3;

public class Q1007 {
    public static int minDominoRotations(int[] tops, int[] bottoms) {
        int[] countSum = new int[7];
        int[] countA = new int[7];
        int[] countB = new int[7];

        for(int i=0; i<tops.length; i++) {
            if(tops[i]==bottoms[i]) {
                countSum[tops[i]]++;
            } else {
                countSum[tops[i]]++;
                countSum[bottoms[i]]++;
                countA[tops[i]]++;
                countB[bottoms[i]]++;
            }
        }

        for(int i=1; i<7; i++) {
            if(countSum[i]==tops.length) {
                return Math.min(countA[i], countB[i]);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] tops = {2,1,2,4,2,2};
        int[] bottoms = {5,2,6,2,3,2};

        System.out.println(minDominoRotations(tops, bottoms));
    }
}
