public class SingleNumber {
    public static void main(String[] js){
        int[] a = {1,2,1};
        System.out.print(singleNumber(a));
    }
    public static int singleNumber(int[] a){
        int v = 0;
        for(int nu:a) v ^= nu;
        return v;
    }
}
