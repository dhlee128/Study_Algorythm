package week2;
//1047. Remove All Adjacent Duplicates In String
public class Q1047 {
    public static void main(String[] args){
        String str="abbaca";
        System.out.println(removeDuplicates(str));
    }

    public static String removeDuplicates(String S) {

        for(int i=0;i<S.length()-1;i++){//idx 0부터 (끝-1)까지
            if(S.charAt(i)==S.charAt(i+1)){//인접 하는 경우
                if(i==S.length()-2){//idx가 (끝-1)에 위치
                    S=S.substring(0,i);
                }else if(i==0){//idx가 0에 위치
                    S=S.substring(i+2);
                }else{
                    S=(S.substring(0,i)+S.substring(i+2));
                }
                i=-1;//인접한 문자 제거 후 다시 idx를 0으로
            }
        }

        return S;
    }
}
