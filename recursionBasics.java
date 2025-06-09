import java.util.*;
public class recursionBasics {
    public static int fibb(int n){
        //base case
        if(n==0){
            return 0;
         }
         if(n==1){
            return 1;
         }
         //recursion fuction
         int fibb1= fibb(n-1);
         int fibb2= fibb(n-2);
         int f=fibb1+fibb2;
         return f;
    }
    public static void main(String arg[]){
        //factorial of a number with recursion
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of terms you want in a series:-");
        int n=sc.nextInt();
        System.out.print(fibb(n));
    }
    
}
