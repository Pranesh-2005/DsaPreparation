import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class InserInterval {
    public static void main(String[] js){
        int[][] in = {{1,3},{6,9}};
        int[] n = {2,5};
        System.out.print(Arrays.deepToString(insertInterval(in,n)));
    }
    public static int[][] insertInterval(int[][] in,int[] n){
        List<int[]> res = new ArrayList<>();
        int i=0;
        int s = in.length;
        while(i<s && in[i][1] < n[0]) res.add(in[i++]);
        while(i<s && in[i][0] <= n[1]){
            n[0] = Math.min(n[0],in[i][0]);
            n[1] = Math.max(n[1],in[i][1]);
            i++;
        }
        res.add(n);
        while(i<s) res.add(in[i++]);
        return res.toArray(new int[res.size()][]);
    }
}
