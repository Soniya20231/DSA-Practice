package Easy;

public class SortByparity {

    public static void SortBy(int arr[]){
        int n=arr.length;
        int even=0;
        int odd=n-1;
        int temp[]=new int[n];

        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                temp[even]=arr[i];
                even++;
            }
            else{
                temp[odd]=arr[i];
                odd--;
            }
        }
        int result[]=new int[n];
        int idx=0;

        for(int i=0;i<even;i++){
            result[idx++]=temp[i];
        }
        //System.out.println("this is index value"+idx);
        for(int i=n-1;i>odd;i--){
            result[idx++]=temp[i];
        }
        //System.out.println("this is index value"+idx);

        for(int i=0;i<n;i++){
            System.out.println(result[i]);
        }

    }
    public static void main(String[] args) {
        int arr[]={3,1,2,4};
        SortBy( arr);

    }
}
