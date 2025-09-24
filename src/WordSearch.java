public class WordSearch {
    private int m, n;
    private char[][] board;
    private String word;
    public boolean exist(char[][] board, String word) {
        this.board = board; this.word = word;
        m = board.length; if (m == 0) return false;
        n = board[0].length;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (dfs(i,j,0)) return true;
            }
        }
        return false;
    }
    private boolean dfs(int i, int j, int idx) {
        if (idx == word.length()) return true;
        if (i<0||j<0||i>=m||j>=n||board[i][j]!=word.charAt(idx)) return false;
        char tmp = board[i][j];
        board[i][j] = '#';
        boolean found = dfs(i+1,j,idx+1) || dfs(i-1,j,idx+1) || dfs(i,j+1,idx+1) || dfs(i,j-1,idx+1);
        board[i][j] = tmp;
        return found;
    }
}
