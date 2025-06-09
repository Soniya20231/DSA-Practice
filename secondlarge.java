public class secondlarge {
    public static void main(String args[]){
        int arr[]={1,6,8,3,0,10,8,7};
        int large=0;
        int secondLarge=0;
        for(int i=0;i<8;i++){
            if(large<=arr[i]){
                secondLarge=large;
                large=arr[i];
            }
        }
        System.err.println("second largest element is="+secondLarge);
    }
    
}
