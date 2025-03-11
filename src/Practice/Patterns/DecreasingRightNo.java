package Practice.Patterns;

public class DecreasingRightNo {
    public static void main(String[] args) {
        int n=3;
//        for(int i=n;i>=1;i--){
//            for (int j = i; j >=1; j--) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j = i; j >=1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
