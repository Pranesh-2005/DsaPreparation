import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        int[][] a = {{1,3},{2,5},{4,10},};
        System.out.print(Arrays.deepToString(mergeIn(a)));
    }
    public static int[][] mergeIn(int[][] a){
        Arrays.sort(a,Comparator.comparingInt(c ->c[0]));
        List<int[]> res = new ArrayList<>();
        int[] cur = a[0];
        for(int i=1;i<a.length;i++){
            if(cur[1]>=a[i][0]) cur[1] = Math.max(cur[1],a[i][1]);
            else{
                res.add(cur);
                cur = a[i];
            }
        }
        res.add(cur);
        return res.toArray(new int[res.size()][]);
    }
}