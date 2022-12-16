package SOL_2022_12_wek1;

//https://leetcode.com/problems/video-stitching/description/
public class Q1024 {

    public static int videoStitching(int[][] clips, int time) {

        int cnt = 0;

        int start = 0;
        int end = 0;

        for(int i=0; i<clips.length; i++) {
            for (int j = 0; j < clips.length; j++) {
                if (start >= clips[j][0] && end < clips[j][1]) {
                    end = clips[j][1];
                }
            }
            cnt++;
            start = end;
            if(start>=time) return cnt;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[][] clips = {{1,23},{3,17},{22,24},{8,24},{4,17},{3,18},{15,23},{0,2}};
        int time = 15;

        System.out.println(videoStitching(clips, time));
    }
}
