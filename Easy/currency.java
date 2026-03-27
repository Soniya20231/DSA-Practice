//Given a value V, determine the minimum number of coins/notes required to make a change for V rupees.
// You are provided with an infinite supply of Indian currency denominations: 
//{1, 2, 5, 10, 20, 50, 100, 500, 1000}.
// Example 1:
// Input: 93
// Output: 5
// Explanation: 50 + 20 + 20 + 2 + 1 = 93

package Easy;

import java.util.ArrayList;
import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        int arr[]={1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount");
        int amount=sc.nextInt();


        //int amount=121;
        int len=arr.length-1;
        ArrayList<Integer> notes=new ArrayList<>();

        for(int i=len;i>=0;i--){
            if(arr[i]<=amount){
                while(arr[i]<=amount){
                    amount=amount-arr[i];
                    count++;
                    notes.add(arr[i]);
                }
            }
            
        }
        System.out.println("No.of notes-"+count);
        System.out.println(notes);
    }
}
