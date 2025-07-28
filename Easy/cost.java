package Easy;
import java.util.*;
public class cost {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read N and X
        System.out.println("enter value of N item");
        int N = sc.nextInt();
        System.out.println("enter value of freshness");
        int X = sc.nextInt();

        // Read freshness values
        System.out.println("enter freshness value");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // Read cost values
        System.out.println("enter item cost");
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        // Calculate total cost for items with freshness >= X
        int totalCost = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] >= X) {
                totalCost += B[i];
            }
        }

        // Output the total cost
        System.out.println("total cost is:-"+totalCost);
    }
}


