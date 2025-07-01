public class MinInRotatedSortef {
    public static int miRs(int[] a){
        int s = 0,e= a.length -1;
        while(s<e){
            int m = s + (e-s)/2;
            if(a[m]>a[e]) s = m+1;
            else e = m;
        }
        return a[s];
    }
    public static void main(String[] args) {
        int[] a = {3,4,5,1,2};
        System.out.println(miRs(a));
    }
}
