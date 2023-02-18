package SOL_2023_02_week3;

public class Q68936 {
    public int[] solution(int[][] arr) {
        int[] answer = new int[2];

        backtracking(arr, 0,0, arr.length-1, arr[0].length-1);

        answer[0] = zero;
        answer[1] = one;

        return answer;
    }

    int zero = 0;
    int one = 0;

    public void backtracking(int[][] arr, int startX, int startY, int endX, int endY) {
        int check = arr[startX][startY];
        boolean allChk = true;

        for(int i=startX; i<=endX; i++) {
            for(int j=startY; j<=endY; j++) {
                if(arr[i][j]!=check) allChk = false;
            }
        }

        if(allChk) {
            if(check==0) {
                zero++;
            } else {
                one++;
            }
            return;
        }
        backtracking(arr, startX, startY, (startX+endX)/2, (startY+endY)/2);
        backtracking(arr, startX, (startY+endY)/2+1, (startX+endX)/2, endY);
        backtracking(arr, (startX+endX)/2+1, startY, endX, (startY+endY)/2);
        backtracking(arr, (startX+endX)/2+1, (startY+endY)/2+1, endX, endY);
    }
}
