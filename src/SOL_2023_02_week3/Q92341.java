package SOL_2023_02_week3;

import java.util.Map;
import java.util.TreeMap;

public class Q92341 {

    public static void main(String[] args) {
        int[] fees = {1, 461, 1, 10};
        String[] records = {"00:00 1234 IN"};

        new Q92341().solution(fees, records);
    }
    public int[] solution(int[] fees, String[] records) {

        Map<String, Integer> in = new TreeMap<>();
        Map<String, Integer> out = new TreeMap<>();

        Map<String, Integer> cars = new TreeMap<>();//car, time

        for(int i=0; i<records.length; i++) {
            String[] info = records[i].split(" ");

            if("IN".equals(info[2])) {
                in.put(info[1],getTime(info[0]));
            } else {
                int time = getTime(info[0])-in.get(info[1]);
                in.remove(info[1]);

                cars.put(info[1], cars.getOrDefault(info[1],0)+time);
            }
        }

        for (Map.Entry<String, Integer> entrySet : in.entrySet()) {
            int fee = 0;

            String car = entrySet.getKey();
            int inTime = entrySet.getValue();
            int outTime = 23*60+59;

            int time = outTime-inTime;

            cars.put(car, cars.getOrDefault(car,0)+time);
        }

        int[] answer = new int[cars.size()];
        int idx=0;
        for (Map.Entry<String, Integer> entrySet : cars.entrySet()) {

            int fee = fees[1];
            int time = entrySet.getValue()-fees[0];

            if(time>0) {
                if(time%fees[2]==0) {
                    fee+= time/fees[2]*fees[3];
                } else {
                    fee+= (time/fees[2]+1)*fees[3];
                }
            }
            answer[idx++] = fee;
        }
        return answer;
    }

    public int getTime(String time) {
        String[] t = time.split(":");
        return Integer.valueOf(t[0])*60+Integer.valueOf(t[1]);
    }

}
