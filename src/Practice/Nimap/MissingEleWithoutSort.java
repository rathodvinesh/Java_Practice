package Practice.Nimap;

public class MissingEleWithoutSort {
    //All Numbers
//    public static void main(String[] args) {
//        int[] arr={2,5,3,11};
//        int max=0;
//        for(int i:arr){
//            if(i>max){
//                max=i;
//            }
//        }
//        int[] res = new int[max+1];
//        for(int i:arr){
//            res[i]++;
//        }
//        for(int i=1;i<res.length;i++){
//            if(res[i]==0){
//                System.out.print(i+" ");
//            }
//        }
//    }

    //one no
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 5, 4, 7, 8 };
        int n = arr.length + 1;

        int res = (n * (n + 1)) / 2;

        int acSum = 0;
        for (int i : arr) {
            acSum += i;
        }
        System.out.println(res - acSum);
    }
}
