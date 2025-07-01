import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] pRodS(int[] a){
        int[] res = new int[a.length];
        int l =1,r=1;
        for(int i=0;i<a.length;i++){
            res[i] =l;
            l*=a[i];
        }
        for(int i=a.length-1;i>=0;i--){
            res[i]*=r;
            r*=a[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        System.out.println(Arrays.toString(pRodS(a)));
    }
}
