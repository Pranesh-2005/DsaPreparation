import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] a,int t){
        Map<Integer,Integer> m = new LinkedHashMap<>();
        for(int i=0;i<a.length;i++){
            int c = t-a[i];
            if(m.containsKey(c)) return new int[]{m.get(c),i};
            m.put(a[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int t = 10;
        System.out.println(Arrays.toString(twoSum(a,t)));
    }
}
