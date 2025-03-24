package Practice.Nimap;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=2;

        reverseArr(arr,0,arr.length-1);
        reverseArr(arr,0,k);
        reverseArr(arr,k+1, arr.length-1);

        for(int i:arr){
            System.out.print(i+ " ");
        }
    }
    public static void reverseArr(int[] arr,int l,int r){
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}
