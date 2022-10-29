package SOL_2022_10_week4;

import java.sql.SQLOutput;

//79. Word Search
public class Q79 {
    public static boolean exist(char[][] board, String word) {

        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                visited[i][j]=true;
                if(board[i][j]==word.charAt(0)) search(board, word, visited, 1, i, j);
                visited[i][j]=false;
            }
        }

        return res;
    }
    static boolean res = false;
    public static void search(char[][] board, String word, boolean[][] visited, int index, int row, int col) {

        if(index==word.length()) res = true;

        if(!res) {
            if (col - 1 >= 0 && board[row][col - 1] == word.charAt(index) && !visited[row][col - 1]) {
                visited[row][col - 1] = true;
                search(board, word, visited, index + 1, row, col - 1);
                visited[row][col - 1] = false;
            }
            if (col + 1 < board[row].length && board[row][col + 1] == word.charAt(index) && !visited[row][col + 1]) {
                visited[row][col + 1] = true;
                search(board, word, visited, index + 1, row, col + 1);
                visited[row][col + 1] = false;
            }
            if (row - 1 >= 0 && board[row - 1][col] == word.charAt(index) && !visited[row - 1][col]) {
                visited[row - 1][col] = true;
                search(board, word, visited, index + 1, row - 1, col);
                visited[row - 1][col] = false;
            }
            if (row + 1 < board.length && board[row + 1][col] == word.charAt(index) && !visited[row + 1][col]) {
                visited[row + 1][col] = true;
                search(board, word, visited, index + 1, row + 1, col);
                visited[row + 1][col] = false;
            }
        }
    }

    public static void main(String[] args) {
        char[][] board = {{'A','B'},{'C','D'}};
        String word = "ACDB";

        System.out.println(exist(board, word));
    }
}
