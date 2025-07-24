// Remove Duplicates from Sorted Array
// Given a sorted array nums, remove the duplicates in-place such that
// each element appears only once and returns the new length.
// Eg. Input: nums = [1,1,2]
//  Output: Length = 2, Array = [1, 2] 

package Easy;

import java.util.ArrayList;

public class remDuplicate {
    
    public static int remove(int arr[]){
        if (arr.length==0){
            return 0;
        }
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String arg[]){
        int Array[]={1,1,2,2,2,3,6,8};
        System.out.println("New length after removing duplicates:-"+remove(Array));
    }
}
