package Practice.Basics;

public class PairsOfNumber {
    public static void main(String[] args) {
        int[] arr = {80, 60, 10, 50,40, 100, 0, 50};
        int k=100;

        for(int i=0;i<arr.length;i++){
            int res = k-arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(res==arr[j]){
                    System.out.print("["+ arr[i]+","+arr[j]+"]");
                }
            }
        }
    }
}
