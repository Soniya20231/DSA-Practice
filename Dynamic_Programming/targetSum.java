package Dynamic_Programming;

public class targetSum {
    public static void target(int num[],int target,boolean dp[][]){
        int n=num.length;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<target+1;j++){
                int v=num[i-1];
                //include
                if(v<=j && dp[i-1][j-v]==true){
                    dp[i][j]=true;
                }
                //exclude
                else if(dp[i-1][j]==true){
                    dp[i][j]=true;
                }
            }
        }
        System.out.println(dp[n][target]);
    }
    public static void main(String args[]){
        int numbers[]={4,2,7,1,3};
        int target=10;
        int n=numbers.length;
        boolean dp[][]=new boolean[n+1][target+1];
        
        for(int i=0;i<=n;i++){
            dp[i][0]=true;
        }
        target(numbers,target,dp);
    }
}
