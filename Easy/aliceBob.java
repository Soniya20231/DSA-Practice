package Easy;
import java.util.*;

public class aliceBob {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no. of days");
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("enter alice run on "+i+"th day");
            a[i]=sc.nextInt();
            System.out.println("enter Bob run on "+i+"th day");
            b[i]=sc.nextInt();
        }
        int happyCount=0;
        for(int i=0;i<n;i++){
            if(a[i]*2< b[i] || b[i]*2<a[i]){
                continue;
            }
            else{
                happyCount++;
            }
        }
        System.out.println("no of the days alice is happy:-"+happyCount);

    }
}
