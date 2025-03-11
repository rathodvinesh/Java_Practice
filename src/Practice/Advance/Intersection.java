package Practice.Advance;

public class Intersection {
    public static void main(String[] args) {
        int[] l1 = {1, 2, 3, 4, 5};
        int[] l2 = {3, 4, 6};

        for(int i=0;i<l1.length;i++){
            for (int j = 0; j < l2.length; j++) {
                if(l1[i]==l2[j]){
                    System.out.print(l1[i]+" ");
                    break;
                }
            }
        }


    }
}
