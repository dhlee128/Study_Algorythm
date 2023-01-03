package SOL_2022_12_week4;

public class Q1217 {
    public static int minCostToMoveChips(int[] position) {
        int pos1 = 0;
        int pos2 = 0;

        for(int i=0;i<position.length; i++) {
            if(position[i]%2==0) {
                pos2++;
            } else{
                pos1++;
            }
        }
        return Math.min(pos1, pos2);
    }

    public static void main(String[] args) {
        int[] position = {1,2,3};
        System.out.println(minCostToMoveChips(position));
    }
}
