class seond_lage {
    public static int getSecondLargest(int[] arr) {
        // Code Hereclass Solution {
        int largest=-1;
        int sec_large=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                sec_large=largest;
                largest=arr[i];
                
            }
            else if(arr[i]<largest && arr[i]>sec_large){
                sec_large=arr[i];
            }
            
        }
        return sec_large;
        // code here
    }
    
    public static void main(String[] args) {
        int arr[]={12,35,1,10,34,1};
        System.out.println(getSecondLargest(arr));
    }
}

    
