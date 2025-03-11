package Practice.Basics;

public class Prime {
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%2==0){
                return false;
            }
        }

        return true;
    }
}
