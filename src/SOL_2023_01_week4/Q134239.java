package SOL_2023_01_week4;

import java.util.ArrayList;
import java.util.List;

public class Q134239 {
    public double[] solution(int k, int[][] ranges) {
        double[] answer = new double[ranges.length];
        Double temp = Double.valueOf(k);

        List<Double> list = new ArrayList<>();
        List<Double> size = new ArrayList<>();
        list.add(temp);
        size.add(0.0);
        while(temp!=1) {
            if(temp%2==0) {
                temp/=2;
            } else {
                temp=temp*3+1;
            }
            size.add(size.get(size.size()-1)+(list.get(list.size()-1) + temp)/2);
            list.add(temp);
        }

        for(int i=0; i<ranges.length; i++) {
            int start = ranges[i][0];
            int end = list.size()+ranges[i][1]-1;

            if(start>end) {
                answer[i] = -1.0;
            } else if(start==end) {
                answer[i] = 0.0;
            } else {
                answer[i] = size.get(end)-size.get(start);
            }
        }

        return answer;
    }
}
