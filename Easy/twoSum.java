package Easy;

public class twoSum {
    public static void SumTwo(int size,int arr[],int tar){
        for(int i=0;i<=size;i++){
            for(int j=0;j<=size;j++){
                if(arr[i]+arr[j]==tar){
                    System.out.println(arr[i]+" "+arr[j]);
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        SumTwo(4, arr, 9);
        
    }
}
