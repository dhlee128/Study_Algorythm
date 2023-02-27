package SOL_2023_02_week4;

public class Q42842 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int xy = brown+yellow;
        //yellow == (x-2)*(y-2)

        for(int x=yellow+2; x>0; x--) {
            if(yellow == (x-2)*((brown+yellow)/x-2)) {
                answer[0] = x;
                answer[1] = (brown+yellow)/x;
                return answer;
            }
        }
        return answer;
    }
}
