package week11;

//838. Push Dominoes
public class Q838 {
    public static String pushDominoes(String dominoes) {
        String tmp;
        while(true){
            tmp=dominoes;
            dominoes=dominoes.replace("R.L","S");
            dominoes=dominoes.replace(".L","LL");
            dominoes=dominoes.replace("R.","RR");
            if(tmp==dominoes) break;
        }

        dominoes=dominoes.replace("S","R.L");
        return dominoes;
    }

    public static void main(String[] args){
        String dominoes="RR.L";
        System.out.println(pushDominoes(dominoes));
    }
}
