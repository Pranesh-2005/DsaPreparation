public class SearchInRotatedSorted {
    public static int sInrs(int[] a,int t){
        int s = 0,e = a.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(a[m]==t) return a[m];
            if(a[s]<=a[m]){
                if(a[s]<=t && t<a[m]) e = m-1;
                else s = m+1;
            }
            else{
                if(a[m]<t && t<=a[e]) s = m+1;
                else e = m-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {5,4,1,2,3};
        int t = 1;
        System.out.println(sInrs(a,t));
    }
}
