package Practice.Nimap;

import java.util.ArrayList;
import java.util.List;

public class PascalTri {

    public static List<Integer> generateRow(int row){
        long ans =1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);

        for(int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=ans/col;
            ansRow.add((int)ans);
        }

        return ansRow;
    }

    public static List<List<Integer>> pascal(int n){
        List<List<Integer>> ans = new ArrayList<>();

        for(int row=1;row<=n;row++){
            ans.add(generateRow(row));
        }
        return ans;
    }

    public static void main(String[] args) {
        int n=4;

        List<List<Integer>> ans = pascal(n);

        for(List<Integer> i:ans){
            for (int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
