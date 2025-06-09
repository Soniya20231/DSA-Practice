public class second {
    public static void large(int arr[]){
        int largest=0;
        int selargest=0;
        for(int i=0;i<5;i++){
           if(arr[i]>largest){
            largest=arr[i];
            selargest=largest;
           }
        //    if(largest<=selargest){
        //         selargest=arr[i];
        //    }

        }
        System.out.println(selargest);
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,6,2};
        large(arr);
        
    }
    
}
