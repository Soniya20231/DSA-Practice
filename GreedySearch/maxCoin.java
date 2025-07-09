package GreedySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class maxCoin {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins,Comparator.reverseOrder()); //sort in descending order

        int amount=1059;
        int countOfCoin=0;
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<coins.length;i++){ //for different coin
            if(amount >= coins[i]){
                while (amount>=coins[i]) { //for the same coin
                    countOfCoin++;
                    amount-=coins[i];
                    ans.add(coins[i]) ;
                }
            }
        }
        System.out.println("the currency require is="+ans);
        System.out.println("Minimum Coin="+ countOfCoin);
    }
}
