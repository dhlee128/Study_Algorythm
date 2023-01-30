package SOL_2023_01_week4;

public class Q131130 {
    public static void main(String[] args) {
        int[] circles = {8,6,3,7,2,5,1,4};
        System.out.println(solution(circles));
    }
    public static int solution(int[] cards) {
        int max1 = 0;
        int max2 = 0;

        for(int i=0; i<cards.length; i++) {
            if(cards[i]==-1) continue;

            int cnt = circle(cards, i);
            if(max1<cnt) {
                max2 = max1;
                max1 = cnt;
            } else if(max2<cnt) {
                max2 = cnt;
            }
        }

        return max1*max2;
    }
    public static int circle(int[] cards, int idx) {
        if(cards[idx]==-1) {
            return 0;
        }
        int nextIndex = cards[idx]-1;
        cards[idx] = -1;
        return circle(cards, nextIndex)+1;
    }
}
