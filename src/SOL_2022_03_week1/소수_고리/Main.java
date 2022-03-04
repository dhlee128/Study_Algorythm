package SOL_2022_03_week1.소수_고리;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static int[] arr;
    static boolean[] visited;
    static int num;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();//4-16 짝수 입력

        num = Integer.parseInt(input);
        arr = new int[num];
        visited = new boolean[num+1];

        arr[0]=1;//idx 0은 무조건 1
        visited[1]=true;//1부터 num 까지

        dfs(1);
    }

    public static void dfs(int idx){
        if(idx>=num){
            if(sumArray(arr)) {
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i]);
                    if(i==arr.length-1){
                        System.out.println();
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            return;
        }
        //idx 0은 무조건 1
        for(int j=2;j<=num;j++){
            if(!visited[j]){
                visited[j]=true;
                arr[idx]=j;
                dfs(idx+1);
                visited[j]=false;
            }
        }
    }
    public static boolean sumArray(int[] arr){//인접한 두 수의 합이 소수인가
        for(int i=0;i<arr.length-1;i++){
            if(!isPrime(arr[i],arr[i+1])){
                return false;
            }
        }
        if(!isPrime(arr[0],arr[arr.length-1])) return false;//양 끝쪽
        return true;
    }

    public static boolean isPrime(int n1, int n2){//소수판별
        int sum = n1+n2;
        int sqrt = (int)Math.sqrt(sum);
        for(int i=2;i<=sqrt;i++){
            if(sum%i==0) return false;
        }
        return true;
    }
}
