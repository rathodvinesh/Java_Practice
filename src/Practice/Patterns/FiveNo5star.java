package Practice.Patterns;

public class FiveNo5star {
    public static void main(String[] args) {
        int n=19;
        int i=1;
        while(i<=n){
            int num=1;
            for(int j=1;j<=5 && i<=n;j++){
                System.out.print((i++)+" ");
            }
            for(int j=1;j<=5 && i<=n;j++){
                System.out.print("* ");
                i++;
            }
            System.out.println();
//            i++;
        }
    }
}
