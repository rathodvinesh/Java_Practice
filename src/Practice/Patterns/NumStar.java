package Practice.Patterns;

public class NumStar {
    public static void main(String[] args) {
        int n=17;
        int i=1;
        while(i<=n){
            for (int j = 1; j <= 5 && i<=n; j++) {
                System.out.print(i+++" ");
            }
            for (int j = 1; j <= 5 && i<=n; j++) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
        }
    }
}
