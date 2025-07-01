public class Prime {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(isPrime(n));
    }
    public static boolean isPrime(int n){
        if(n==0 || n==1) return true;
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
