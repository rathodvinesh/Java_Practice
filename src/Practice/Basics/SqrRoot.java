package Practice.Basics;

public class SqrRoot {
    public static void main(String[] args) {
        int n=36;
        double precision = 0.1,mid=0,low=0,high=n;
        while ((high-low)>precision){
            mid=(low+high)/2;
            if(mid*mid>n){
                high=mid;
            }else {
                low=mid;
            }
        }
        System.out.println(mid);
    }
}
