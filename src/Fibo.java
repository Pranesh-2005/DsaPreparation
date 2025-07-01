public class Fibo {
    public static void main(String[] args) {
        int n = 10;
        fib(n);
    }
    public static void fib(int n){
        int a =0;
        int b = 1;
        System.out.print("0 1 ");
        for(int i=0;i<n;i++){
            int c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
}
