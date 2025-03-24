package Practice.Advance;

public class NextPalindrome {
    public static void main(String[] args) {
        int n=101;
        n++;
        while(!isPali(n)){
            n++;
        }
        System.out.println(n);
    }
    public static boolean isPali(int n){
        int og=n,rev=0;
        while (n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return rev==og;
    }
}
