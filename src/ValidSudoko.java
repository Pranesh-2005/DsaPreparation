import java.util.HashSet;
public class ValidSudoko {
    public static void main(String[] js) {
       char[][] ch = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
       System.out.print(isValidSudoku(ch));
    }
    public static boolean isValidSudoku(char[][] ch){
        HashSet<String> st = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char c = ch[i][j];
                if(c=='.') continue;
                if(!st.add(c+"row"+i) || !st.add(c+"col"+j) || !st.add(c+"in"+i/3+"-"+j/3)) return false;
            }
        }
        return true;
    }
}
