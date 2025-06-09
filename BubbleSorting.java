public class BubbleSorting {
    public static void main(String args[]){
   // int arr[]={5,4,1,3,2};
   int arr[]={1,2,3,4,5};
    int swap=0;
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-i-1;j++){
           if(arr[j]>arr[j+1]){
            swap=1;
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;

           }
           }
           if(swap==0){
            System.out.print("the array is already sorted");
            break;
           }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    }

    

