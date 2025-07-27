package Dynamic_Programming;

public class fibbonachi {

    public static int fibbonachiNo(int num,int f[]){  //Memoization
        if(num==1 || num==0){
            return num;
        }
        if(f[num]!=0){   // f(n) is already calculated 
            return f[num]; 
        }
       f[num]=fibbonachiNo(num-1,f)+fibbonachiNo(num-2,f);
       return f[num];
    }

    public static int fibTabulation(int num){     //Tabulation
        int dp[]=new int[num+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=num;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[num];
    }
    
    public static void main(String args[]){
        int n=6;
        int f[]=new int[n+1];
        System.out.println(fibbonachiNo(n,f));
        System.out.println(fibTabulation(n));
    }
}
