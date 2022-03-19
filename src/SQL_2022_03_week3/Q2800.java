package SQL_2022_03_week3;
//2800번 괄호제거
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Q2800 {

    static Set<String> set=new TreeSet<>();//괄호 제거한 문자열 Set
    static List<bracket> bracketList=new ArrayList<>();//괄호 정보(시작,끝) 리스트

    static boolean[] visited;//조합 dfs
    static List<bracket> tempBracketList = new ArrayList<>();//괄호 조합 리스트

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        char[] cArr=str.toCharArray();
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<cArr.length;i++) {
            if(cArr[i]=='(') {
                stack.add(i);
            }else if(cArr[i]==')'){
                bracketList.add(new bracket(stack.pop(),i));//괄호 정보(시작,끝) 리스트
            }
        }

        visited = new boolean[bracketList.size()];

        //괄호 i개 제거
        for(int i=1;i<=bracketList.size();i++){
            dfs(0,i,cArr);
        }
        set.stream().forEach(System.out::println);
    }

    //괄호 조합
    public static void dfs(int depth, int cnt, char[] cArr) {
        if(tempBracketList.size()==cnt) {
            //괄호 제거
            addBracket(tempBracketList,cArr);
            return;
        }

        for(int i=depth;i<bracketList.size();i++) {
            if(!visited[i]) {
                visited[i]=true;
                tempBracketList.add(bracketList.get(i));
                dfs(i+1,cnt,cArr);
                visited[i]=false;
                tempBracketList.remove(tempBracketList.size()-1);
            }
        }
    }

    //문자열에서 괄호를 제거
    public static void addBracket(List<bracket> tempBracketList,char[] cArr) {
        char[] tempArr=cArr.clone();
        String str="";

        for(int i=0;i<tempBracketList.size();i++) {
            tempArr[tempBracketList.get(i).getStart()]='_';
            tempArr[tempBracketList.get(i).getEnd()]='_';
        }
        for(int i=0;i<tempArr.length;i++) {
            if(tempArr[i]!='_') {
                str+=tempArr[i];
            }
        }
        set.add(str);
    }
}

class bracket {

    int start, end;

    public bracket(int start, int end) {
        this.start=start;
        this.end=end;
    }

    public int getStart() {
        return this.start;
    }
    public int getEnd() {
        return this.end;
    }
}
