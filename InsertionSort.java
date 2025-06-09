public class InsertionSort {
    public static void main (String args[]){
        int arr[]={5,4,1,3,2};
        for(int i=1;i<arr.length;i++){
            int curr=i;
            int prev=i-1;
            while (prev>=0 && arr[prev]>arr[curr]) {
                arr[prev+1]=arr[prev];
                prev--;
                
            }
            arr[prev+1]=arr[curr];
        }
    }
    
}
