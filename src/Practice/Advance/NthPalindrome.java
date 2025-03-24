package Practice.Advance;

public class NthPalindrome {
    public static void main(String[] args) {
        int num=4;
        int c=1,start=101;
        while (c<=num){
            if(isPalindrome(start)){
                if(c==num)
                    System.out.print(start+" ");
                c++;
            }
            start++;
        }
    }

    public static boolean isPalindrome(int num){
        int og=num,rev=0;
        while (num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        return og==rev;
    }
}
