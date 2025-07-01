import java.util.Arrays;
import java.util.Comparator;

public class NonOverlaping {
    public static void main(String[] args) {
        int[][] intvrl= {{1,3}, {2,5}, {4,6}, {7,8}, {5,9}};
        System.out.println(nonOverlaping(intvrl));
    }
    public static int nonOverlaping(int[][] ints){
        Arrays.sort(ints, Comparator.comparingInt(a -> a[1]));
        int e = Integer.MIN_VALUE;
        int c =0;
        for(int[] intv:ints){
            if(intv[0]>=e) e = intv[1];
            else c++;
        }
        return c;
    }
}
