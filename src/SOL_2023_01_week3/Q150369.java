package SOL_2023_01_week3;

import java.util.Stack;

public class Q150369 {

    public static void main(String[] args) {
        int cap = 4;
        int n = 5;
        int[] deliveries = {1, 0, 3, 1, 2};
        int[] pickups = {0, 3, 0, 4, 0};
        System.out.println(solution(cap, n, deliveries, pickups));
    }
    public static long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;

        Stack<Integer> stackD = new Stack<>();
        Stack<Integer> stackP = new Stack<>();

        for(int i=0; i<deliveries.length; i++) {
            if(deliveries[i]>0) stackD.add(i);
        }
        for(int i=0; i<pickups.length; i++) {
            if(pickups[i]>0) stackP.add(i);
        }


        while(!stackD.isEmpty() && !stackP.isEmpty()) {
            int idxD = stackD.pop();
            int idxP = stackP.pop();
            answer+=(Math.max(idxD,idxP)+1)*2;

            int temp = cap;
            while(temp>0 && !stackD.isEmpty()) {
                if(deliveries[idxD] >= temp) {
                    deliveries[idxD]-=temp;
                    temp=0;
                    if(deliveries[idxD]>0) stackD.add(idxD);
                } else {
                    temp-=deliveries[idxD];
                    if(!stackD.isEmpty()) idxD = stackD.pop();
                }
            }
            temp = cap;
            while(temp>0 && !stackP.isEmpty()) {
                if(pickups[idxP] >= temp) {
                    pickups[idxP]-=temp;
                    temp=0;
                    if(pickups[idxP]>0) stackP.add(idxP);
                } else {
                    temp-=pickups[idxP];
                    if(!stackP.isEmpty()) idxP = stackP.pop();
                }
            }
        }
        while(!stackD.isEmpty()){
            int idxD = stackD.pop();
            answer+=(idxD+1)*2;

            int temp = cap;
            while(temp>0) {
                if(deliveries[idxD] >= temp) {
                    deliveries[idxD]-=temp;
                    temp=0;
                    if(deliveries[idxD]>0) stackD.add(idxD);
                } else {
                    temp-=deliveries[idxD];
                    if(!stackD.isEmpty()) idxD = stackD.pop();
                }
            }
        }
        while(!stackP.isEmpty()){
            int idxP = stackP.pop();
            answer+=(idxP+1)*2;

            int temp = cap;
            while(temp>0) {
                if(pickups[idxP] >= temp) {
                    pickups[idxP]-=temp;
                    temp=0;
                    if(pickups[idxP]>0) stackP.add(idxP);
                } else {
                    temp-=pickups[idxP];
                    if(!stackP.isEmpty()) idxP = stackP.pop();
                }
            }
        }

        return answer;
    }
}
