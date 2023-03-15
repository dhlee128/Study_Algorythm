package SOL_2023_03_week2;

public class Q62048 {
    //w*h-(w+h-최대공약수 gcd)
    public long solution(int w, int h) {
        //gcd
        long ww = (long)w;
        long hh = (long)h;

        long x = Math.max(ww,hh);
        long y = Math.min(ww,hh);

        while(x%y!=0) {
            long temp = x%y;
            x=y;
            y=temp;
        }

        return ww*hh-(ww+hh-y);
    }
}
