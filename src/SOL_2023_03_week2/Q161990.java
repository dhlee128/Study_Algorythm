package SOL_2023_03_week2;

public class Q161990 {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];

        int x1 = Integer.MAX_VALUE;
        int x2 = Integer.MIN_VALUE;
        int y1 = Integer.MAX_VALUE;
        int y2 = Integer.MIN_VALUE;

        for(int i=0; i<wallpaper.length; i++) {
            String str = wallpaper[i];

            for(int j=0; j<str.length(); j++) {
                if(str.charAt(j)=='#') {
                    x1=Math.min(x1,i);
                    x2=Math.max(x2,i);
                    y1=Math.min(y1,j);
                    y2=Math.max(y2,j);
                }
            }
        }
        answer[0]=x1;
        answer[1]=y1;
        answer[2]=x2+1;
        answer[3]=y2+1;

        return answer;
    }
}
