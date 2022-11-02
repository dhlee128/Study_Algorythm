package SOL_2022_11_week1;

import java.util.ArrayList;
import java.util.List;

public class Q51 {

    List<List<String>> res;

    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<>();

        int[] cols = new int[n];

        dfs(n, cols, 0);

        return res;
    }

    public void dfs(int n, int[] cols, int row) {
        if(row==n) {
            List<String> list = new ArrayList<>();
            for(int i=0; i<n; i++) {
                String s="";
                for(int j=0; j<n; j++) {
                    if(cols[i]==j) {
                        s+="Q";
                    } else {
                        s+=".";
                    }
                }
                list.add(s);
            }
            res.add(list);
            return;
        }

        for(int col=0; col<n; col++) {
            cols[row] = col;
            if(!check(cols, row)) continue;
            dfs(n, cols, row+1);
        }
    }

    public boolean check(int[] cols, int row) {
        for(int i=0; i<row; i++) {
            if(cols[i]==cols[row] || Math.abs(i-row)==Math.abs(cols[i]-cols[row])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Q51 q = new Q51();
        System.out.println(q.solveNQueens(4));
    }
}
