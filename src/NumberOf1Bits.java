import java.util.Scanner;
public class NumberOf1Bits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        System.out.print(numberOf1Bits(v));
    }
    public static int numberOf1Bits(int v){
        int c = 0;
        while (v!=0){
            c += v &1;
            v >>>= 1;
        }
        return c;
    }
}
