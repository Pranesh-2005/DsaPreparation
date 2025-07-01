import java.util.Arrays;
public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] a = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        setMatrixZeros(a);
        System.out.println(Arrays.deepToString(a));
    }
    public static void setMatrixZeros(int[][] a){
        boolean [] r = new boolean[a.length];
        boolean[] c = new  boolean[a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j] == 0){
                    r[i] = true;
                    c[j] = true;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(r[i]||c[j]) a[i][j] = 0;
            }
        }
    }
}
