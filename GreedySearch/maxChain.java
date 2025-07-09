package GreedySearch;

import java.util.*;

//(a,b)<(c,d)

public class maxChain {
    public static void main(String arg[]){  //O(n log n)

       int chain[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(chain,Comparator.comparingInt(o -> o[1]));
        int endVal=chain[0][1];
        int count=1;
        for(int i=1;i<5;i++){
            if(endVal<= chain[i][0]){
                count++;
                endVal=chain[i][1];
            }
        }
        System.out.println(count);

    }
}
