package SQL_2022_03_week3;
//1158번 요세푸스 문제
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Q1158 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //(n, k) 1번부터 N명까지, k번째 사람 제거
        int n=sc.nextInt();
        int k=sc.nextInt();

        Queue<Integer> queue=new LinkedList<>();
        for(int i=1;i<=n;i++) {
            queue.add(i);
        }

        List<Integer> list=new ArrayList<>();

        int cnt=0;
        while(!queue.isEmpty()) {//모두 제거될 때까지
            int num=queue.poll();
            cnt++;
            if(cnt==k) {//k번째 마다 제거
                list.add(num);
                cnt=0;
            }else {
                queue.add(num);
            }
        }
        //출력
        System.out.print("<");
        for(int i=0;i<list.size();i++) {
            System.out.print(list.get(i));
            if(i!=list.size()-1)
                System.out.print(", ");
        }
        System.out.print(">");
    }
}
