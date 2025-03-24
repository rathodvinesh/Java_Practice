package Practice.Patterns;

public class FiveNo5star {
    public static void main(String[] args) {
        int n=16;
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=5 && i<=n){
                System.out.print((i)+" ");
                i++;
                j++;
            }
            j=1;
            while(j<=5 && i<=n){
                System.out.print("* ");
                i++;
                j++;
            }
            System.out.println();
        }
    }
}
