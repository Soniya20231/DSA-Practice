package GreedySearch;
import java.util.*;

public class KnapSack {
    public static void main(String args[]){
        int value[]={60,100,120};
        int weight[]={10,20,30};
        int W=50;
        
        double ratio[][]= new double[value.length][2];
        for(int i=0;i<value.length;i++){
            ratio[i][0]=i;//store original index of items
            ratio[i][1]=value[i]/(double)weight[i];
        }
        //Sorting the 2Darray based on ration
        Arrays.sort(ratio, Comparator.comparingDouble(o ->o[1])); 

        int capacity=W;
        int finalVal=0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0]; //getting right index
            if(weight[idx]<=capacity){
                capacity-=weight[idx];
                finalVal+=value[idx];
            }
            else{
                //including fraction items
                finalVal+=  (int)(ratio[i][1] * capacity);
                capacity=0;
                break;
            }

        }
        System.out.println(finalVal);
    }
}
