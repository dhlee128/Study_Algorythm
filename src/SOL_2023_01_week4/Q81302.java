package SOL_2023_01_week4;

public class Q81302 {
    public static void main(String[] args) {
        String[][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
        int[] ans = solution(places);
        for(int i=0; i<5; i++) {
            System.out.println(ans[i]);
        }
    }

    public static int[] solution(String[][] places) {

        int[] answer = {1,1,1,1,1};

        for(int i=0; i<5; i++) {
            String[] map = places[i];
            boolean breakF = false;

            for(int j=0; j<5 && !breakF; j++) {
                for(int k=0; k<5 && !breakF; k++){
                    if(map[j].charAt(k)=='P') {
                        if(!findPeople(map, j, k)) {
                            breakF = true;
                            answer[i]=0;
                        }
                    }
                }
            }
        }

        return answer;
    }

    public static boolean findPeople(String[] map, int x, int y) {
        //상하좌우 맨하탄 1
        int[] mx1 = {-1, 0, 0, 1};
        int[] my1 = {0, -1, 1, 0};

        for(int i=0; i<4; i++) {
            int nx1 = x+mx1[i];
            int ny1 = y+my1[i];

            if(nx1>=0 && nx1<5 && ny1>=0 && ny1<5) {
                if(map[nx1].charAt(ny1)=='P') return false;
            }
        }

        //상하좌우 맨하탄 2
        int[] mx2 = {-2, 0, 0, 2};
        int[] my2 = {0, -2, 2, 0};

        for(int i=0; i<4; i++) {
            int nx2 = x+mx2[i];
            int ny2 = y+my2[i];

            if(nx2>=0 && nx2<5 && ny2>=0 && ny2<5) {
                if(map[nx2].charAt(ny2)=='P' && map[x+mx2[i]/2].charAt(y+my2[i]/2)!='X') return false;
            }
        }

        //대각선
        int[] mx3 = {-1, -1, 1, 1};
        int[] my3 = {-1, 1, -1, 1};

        for(int i=0; i<4; i++) {
            int nx3 = x+mx3[i];
            int ny3 = y+my3[i];

            if(nx3>=0 && nx3<5 && ny3>=0 && ny3<5) {
                if(map[nx3].charAt(ny3)=='P' && !(map[nx3].charAt(y)=='X' && map[x].charAt(ny3)=='X')) return false;
            }
        }

        return true;
    }
}
