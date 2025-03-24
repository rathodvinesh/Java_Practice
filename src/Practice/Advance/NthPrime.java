package Practice.Advance;

class NthPrime {
    public static void main(String[] args) {
        int n = 1;
        System.out.print(nPrime(n));
    }

    public static int nPrime(int n){
//        int num=1;
//        for(int i=1;i<=n;){
//            num++;
//            if(isPrime(num)){
//                i++;
//            }
//        }
        int count = 0;  // Count of prime numbers found
        int num = 1;    // Number to check for primality

        while (count < n) {
            num++; // Move to the next number
            if (isPrime(num)) {
                count++; // Increase count if prime is found
            }
        }
        return num;
    }

    public static boolean isPrime(int n){
        if(n<=1) return false;
        if (n == 2) return true; // 2 is the smallest prime number
        if (n % 2 == 0) return false; // Skip even numbers after 2
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}


//public class NthPrime {
//    public static void main(String[] args) {
//        int n=3;
//        int start=1;
//        int c=0;
//        while(c<n) {
//            if (isPrime(start)) {
//                c++;
//                if(c==n){
//                    System.out.print(start+" ");
//                }
//            }
//            start++;
//        }
//    }
//
//    public static boolean isPrime(int n){
//
//        if(n<=1){
//            return false;
//        }
//
//        if(n==2) return true;
//
//        for(int i=2;i<Math.sqrt(n);i++){
//            if(n%i==0)
//                return false;
//        }
//        return true;
//    }
//}
