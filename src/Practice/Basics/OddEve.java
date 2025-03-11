package Practice.Basics;

/*
Print list of odd/even numbers from 1-n, where n is input.
E.g.
n = 10
even_nums = [2, 4, 6, 8, 10]
odd_nums = [1, 3, 5, 7, 9]
*/

import java.util.ArrayList;
import java.util.List;

public class OddEve {
    public static void main(String[] args) {
//        int odd=0;
//        int eve=0;
        int n=10;
        List<Integer> odd = new ArrayList<>();
        List<Integer> eve = new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(i%2==0){
                eve.add(i);
            }else{
                odd.add(i);
            }
        }

        System.out.println("even_nums = "+eve);
        System.out.println("odd_nums = "+odd);

    }
}
