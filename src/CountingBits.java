import java.util.Scanner;
import java.util.Arrays;
public class CountingBits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.print(Arrays.toString(countingBits(a)));
    }
    public static int[] countingBits(int a){
        int[] res = new int[a+1];
        for(int i=1;i<=a;i++) res[i] = res[i >> 1] + (i&1);
        return res;
    }
}
