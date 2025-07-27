package Dynamic_Programming;

public class longestSeq {
    public static int longestCommonSubsequence(String text1, String text2, int n,int m,int dp[][]) {
        

        if(n==0 || m==0){
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(text1.charAt(n-1)==text2.charAt(m-1)){
            dp[n][m]= longestCommonSubsequence(text1,text2,n-1,m-1,dp)+1;
            return dp[n][m];
        }
        else{
            int ans1=longestCommonSubsequence(text1,text2,n-1,m,dp);
            int ans2=longestCommonSubsequence(text1,text2,n,m-1,dp);
           dp[n][m]= Math.max(ans1,ans2);
           return dp[n][m];
        }
        
    }

    public static int tabulation(String str1,String str2){
        int n=str1.length();
        int m=str2.length();

        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=str1.length();i++){   //initialization for base cases
            for(int j=0;j<=str2.length();j++){
                dp[i][j]=0; 
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    int ans1=dp[i][j-1];
                    int ans2=dp[i-1][j];
                    dp[i][j]=Math.max(ans1,ans2);
                }
            }
        }
        return dp[n][m];

    }
    public static void main(String[] args) {
        String str1="abcde";
        String str2="ace";
        int dp[][]=new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<=str1.length();i++){
            for(int j=0;j<=str2.length();j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(longestCommonSubsequence(str1, str2, 5, 3,dp));
        System.out.println(tabulation(str1, str2));
        
    }
}
