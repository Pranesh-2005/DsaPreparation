import java.util.Arrays;
public class TwoSumII {
    public static void main(String[] args) {
        int[] a = {2,3,4};
        int t = 6;
        System.out.print(Arrays.toString(twoSumII(a,t)));
    }
    public static int[] twoSumII(int[] a,int t){
        int l = 0;
        int r = a.length-1;
        while(l<r){
            if(a[l]+a[r]==t) return new int[]{l+1,r+1};
            else if (a[l] + a[r] < t) {
                l++;
            }
            else r--;
        }
        return new int[]{-1,-1};
    }
}
