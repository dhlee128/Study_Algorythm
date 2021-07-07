package week12;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

//752. Open the Lock
public class Q752 {

    public static void main(String[] args){

        String[] deadends={"0000"};
        String target="8888";

        System.out.println(openLock(deadends, target));
    }

    public static Set<String> visited=new HashSet<>();
    public static String result="";
    public static int cnt=-1;
    public static Queue<String> queue=new LinkedList<>();

    public static int openLock(String[] deadends, String target) {

        for(String s:deadends){
            if("0000".equals(s)) return -1;
            visited.add(s);
        }
        queue.add("0000");
        visited.add("0000");

        while(!queue.isEmpty()) {
            int size=queue.size();
            cnt++;
            for(int q=0;q<size;q++){
                String cur = queue.poll();
                if(target.equals(cur)) return cnt;

                for (int i = 0; i < 4; i++) {
                    StringBuilder new_s = new StringBuilder(cur);
                    //up
                    new_s.setCharAt(i, calc(cur.charAt(i), '+'));
                    String up=new_s.toString();
                    if(!visited.contains(up)){
                        queue.add(up);
                        visited.add(up);
                    }
                    //down
                    new_s.setCharAt(i, calc(cur.charAt(i), '-'));
                    String down=new_s.toString();
                    if(!visited.contains(down)){
                        queue.add(down);
                        visited.add(down);
                    }
                }
            }
        }
        return -1;
    }

    public static char calc(char c, char op){
        int n = c - '0';

        if(op=='+'){
            return (char)(((n + 1+ 10) % 10)+ '0');
        }
        return (char)(((n -1 + 10) % 10)+ '0');
    }
}
