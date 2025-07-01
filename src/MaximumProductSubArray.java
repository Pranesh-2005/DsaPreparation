import java.util.Arrays;
public class MaximumProductSubArray {
    public static int mPA(int[] a){
        int res = a[0],mx = a[0], mi=a[0];
        for(int i=0;i<a.length;i++){
            int t = mx;
            mx = Math.max(a[i] , Math.max(mx*a[i],mi*a[i]));
            mi = Math.min(a[i],Math.min(t*a[i],mi*a[i]));
            res = Math.max(res,mx);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        System.out.println(mPA(a));
    }
}
