//Kth largest odd number in a given range We have two variables La nd R,indicating a range of integers from L to R inclusive ,and a number K,the task is to find Kth largest odd number.If K > number of odd numbers in the range L to R then return 0

package GreedySearch;
import java.util.*;

public class LargestOddNumber {
    public static void main(String[] args) {
        int L=-10;
        int R=10;
        int k=8;
        ArrayList<Integer> odd=new ArrayList<>();
        for(int i=L;i<=R;i++){
            if (i%2!=0){
                odd.add(i);
            }
        }
        System.out.println(odd);
        Collections.sort(odd, Collections.reverseOrder());
         System.out.println(odd);
        System.err.println(odd.get(k-1));

    }
}
