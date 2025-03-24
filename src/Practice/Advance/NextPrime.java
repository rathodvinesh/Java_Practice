package Practice.Advance;

public class NextPrime {
    public static void main(String[] args) {
        int n=11;
        System.out.println(nextPrime(n));
    }

    public static int nextPrime(int n) {
        int num=n+1;
        while(!isPrime(num)){
            num++;
        }
        return num;
    }

    public static boolean isPrime(int n){
        if(n<=1) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=2;i<n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
