import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralMatrix(a));
    }
    public static List<Integer> spiralMatrix(int[][] a){
        int t = 0;
        int b = a.length-1;
        int l = 0;
        int r = a[0].length-1;
        List<Integer> res = new ArrayList<>();
        while(t<=b && l<=r){
            for(int i=l;i<=r;i++) res.add(a[t][i]);
            t++;
            for(int i=t;i<=b;i++) res.add(a[i][r]);
            r--;
            if(t<=b) for(int i=r;i>=l;i--) res.add(a[b][i]);
            b--;
            if(l<=r) for(int i=b;i>=t;i--) res.add(a[i][l]);
            l++;
        }
        return res;
    }
}
