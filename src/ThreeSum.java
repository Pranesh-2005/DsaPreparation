import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> tSum(int[] a){
        Arrays.sort(a);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<a.length-2;i++){
            if(i>0 && a[i]==a[i-1])continue;
            int s = i+1,e=a.length-1;
            while(s<e){
                int su = a[i]+a[s]+a[e];
                if(su==0){
                    res.add(Arrays.asList(a[i],a[s++],a[e--]));
                    while(s<e && a[s]==a[s-1]) s++;
                    while(s<e && a[e]==a[e+1]) e--;
                }
                else if(su<0) s++;
                else e--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = tSum(a);
        System.out.println(res);
    }
}
