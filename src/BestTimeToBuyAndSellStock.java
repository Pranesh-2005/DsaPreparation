public class BestTimeToBuyAndSellStock {
    public static int bst(int[] a){
        int m = a[0],p=0;
        for(int n:a){
            if(n<m) m = n;
            else p = Math.max(p,n-m);
        }
        return p;
    }
    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        System.out.print(bst(a));
    }
}
