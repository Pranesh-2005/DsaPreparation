import java.util.Scanner;
public class PowXN {
    public static double powOfXN(int n,int p){
        long newpow = p;
        if(newpow < 0){
            n = 1/n;
            newpow = -newpow;
        }
        double res = 1;
        while(newpow > 0){
            if((newpow & 1)==1) res *= n;
            n*=n;
            newpow = newpow >> 1;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        System.out.print(powOfXN(n,p));
    }
}
