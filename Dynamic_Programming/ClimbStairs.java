package Dynamic_Programming;
import java.util.*;

public class ClimbStairs {

    public static int Noway(int stairNo,int dp[]){
        if(stairNo==0){
            return 1;
        }
        if(stairNo==-1){
            return 0;
        }
        if(dp[stairNo]!=-1){
            return dp[stairNo];
        }
        dp[stairNo]= Noway(stairNo-1,dp)+Noway(stairNo-2,dp);
        return dp[stairNo];
    }
    
    public static void main(String args[]){
        int n=5;
        int dp[]=new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(Noway(n,dp));
    }
}
