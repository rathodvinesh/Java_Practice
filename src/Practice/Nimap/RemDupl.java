package Practice.Nimap;

public class RemDupl {
    public static void main(String[] args) {
        int[] arr1 = {1,3,1,5,3,5};
        int in=0;
//        for(int i=1;i<arr1.length;i++){
//            if(arr1[i]!=arr1[in]){
//                // in++;
//                arr1[++in]=arr1[i];
//            }
//        }

        for(int i=0;i< arr1.length;i++){
            boolean isDup=false;
            for(int j=0;j< in;j++){
                if(arr1[i]==arr1[j]){
                    isDup=true;
                    break;
                }
            }
            if(!isDup) arr1[in++]=arr1[i];
        }

        for(int i=0;i<in;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
