package Practice.Nimap;

import java.util.Arrays;

public class LongConseSeq {
    public static void main(String[] args) {
        int[] arr = {101,100,4,54,3,2,1};
        Arrays.sort(arr);
        int longest=1;
        int c=0;
        int prev=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]-1==prev){
                c++;
                prev=arr[i];
            }else if(arr[i]!=prev){
                c=1;
                prev=arr[i];
            }
            longest=Math.max(longest,c);
        }
        System.out.println(longest);
    }
}
//package Practice.Nimap;
//
//import java.util.Arrays;
//
//public class LongConseSeq {
//    public static void main(String[] args) {
//        int[] arr = {101, 100, 4, 54, 3, 2, 1};
//
//        if (arr.length == 0) {
//            System.out.println(0);
//            return;
//        }
//
//        Arrays.sort(arr); // Sorting array
//        int longest = 1;
//        int c = 1;
//        int prev = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i]-1 == prev) { // If current number is consecutive
//                c++;
//            } else if (arr[i] != prev) { // If not consecutive and not duplicate
//                c = 1;
//            }
//            prev = arr[i]; // Update previous element
//            longest = Math.max(longest, c); // Track max sequence length
//        }
//        System.out.println(longest);
//    }
//}
