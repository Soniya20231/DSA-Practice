import java.util.*;
public class sorting{
    public static void printarr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        
        }  
    }
    public static void MergeSort(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid=(si+ei)/2;
        MergeSort(arr,si,mid);
        MergeSort(arr,mid+1,ei);    
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[],int si,int mid,int ei)
    {
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
                k++;
            }
            else{
                temp[k]=arr[j];
                j++;
                k++;
            }
        }
        //to insert the remaining eements in the temp array
        while (i<=mid) {
           temp[k++]=arr[i++]; 
        }
        while (j<=ei) {
            temp[k++]=arr[j++];
        }
        
    //copy element in temp
    for(k=0, i=si;k<temp.length;k++,i++);
    {
        arr[i]=temp[k];
    }
   }
    public static void main(String args[])
    {   
        // int arr1[]=new int[10];
        // System.out.println("enter you array to be sorted");
        // Scanner sc=new Scanner(System.in);
        // for(int i=0;i<10;i++)
        // {
        //     arr[i]=sc.nextInt();
        // }
        // System.out.println("your array is:");
        // for(int i=0;i<10;i++)
        // {
        //     System.out.print(arr[i]+" ");
        
        // }  
        int arr[]={6,3,9,5,2,8};
        MergeSort(arr,0,5);
        System.out.println("your sorted array is:-");
        printarr(arr);

    }
}