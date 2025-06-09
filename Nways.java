import java.util.Scanner;
public class Nways {
    public static int ways(int i,int j,int n,int m){
        if(i==n-1 || j==m-1){
            return 1;
        }
        int way1=ways(i+1,j,n,m);
        int way2=ways(i,j+1,n,m);
        return way1+way2;

    }
    public static void main(String args[]){
        //int mat[][]=new int[6][6];
        System.out.println("total ways are:-");
        System.out.println(ways(0, 0,2,2));



    }
    
}
