package Practice.Nimap;

public class SearchInsertPosi {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int k=2;
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==k){
                System.out.println("Found");
                return;
            }
            if(arr[mid]>k){
                r=mid-1;
            }
            if(arr[mid]<k){
                l=mid+1;
            }
        }
        System.out.println(l);
    }
}
