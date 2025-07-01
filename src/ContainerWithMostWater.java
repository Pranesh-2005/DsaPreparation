public class ContainerWithMostWater {
    public static int cWmw(int[] a){
        int s = 0,e=a.length-1;
        int mx = 0;
        while (s<e){
            mx = Math.max(mx,Math.min(a[s],a[e])*(e-s));
            if(a[s]<a[e]) s++;
            else e--;
        }
        return mx;
    }
    public static void main(String[] args) {
        int[] a = {1,8,6,2,5,4,8,3,7};
        System.out.println(cWmw(a));
    }
}
