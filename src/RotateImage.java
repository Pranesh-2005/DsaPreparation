import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        rotateImage(a);
        System.out.print(Arrays.deepToString(a));
    }
    public static void rotateImage(int[][] a){
        for(int i=0;i<a.length;i++) {
            for (int j = i; j < a.length; j++) {
                int t = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = t;
            }
        }
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a.length/2;j++){
                    int t = a[i][j];
                    a[i][j] = a[i][a.length - j -1];
                    a[i][a.length - j - 1] = t;
                }
            }
    }
}
