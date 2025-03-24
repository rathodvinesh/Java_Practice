package Practice.Patterns;

public class AlphaNo {
    public static void main(String[] args) {
        char start;
        int n=5;
        for(int i=1;i<=n;i++){
            start=(char) ('A'+(n-i));
            for(int j=n;j>=i;j--){
                if(i%2==0){
                    System.out.print(start+" ");
                    start--;
                }else{
                    System.out.print((j-i+1)+" ");
                }
            }
            System.out.println();
        }
    }
}
