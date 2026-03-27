package Arrays;
import java.util.*;
public class UniqueSum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a number of elements in an array:-");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter a elements in an array:-");
            int num=sc.nextInt();
            arr[i]=num;
        }
        Arrays.sort(arr);
        int sum=0;
        for(int i=0;i<n;i++){
            sum=arr[i]+sum;
            while(i<n-1 && arr[i]==arr[i+1]){
                i++;
            }
        }
        System.out.println(sum);
    }
}
