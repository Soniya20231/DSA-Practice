public class RotedSort {

    public static int RotedSearch(int si,int ei,int key,int arr[]){

        if(si>ei){
            return -1;
        }

        int mid=(si+ei)/2;
        if(arr[mid]==key){
            return mid;
        }

        //Case 1:- Lie on L1
        if(arr[si]<=arr[mid]){
            //case A:- lie on left half of L1
            if(arr[si]<=key && arr[mid]>=key){ 
                return RotedSearch(si, mid-1, key, arr);
            }
            else{
                //case B:- lie on Right half  (L1 and L2)
                return RotedSearch(mid+1, ei, key, arr);
            }
        }
        //Case 1:- Lie on L2
        else{
             //case A:- lie on Right half of L2
            if(arr[mid]<=key && key<=arr[ei]){
                return RotedSearch(mid+1, ei, key, arr);
            }
             //case B:- lie on left half of (L1 and L2)
            else{
                return RotedSearch(si, mid-1, key, arr);
            }
        }
    }

    public static void main(String[] args) {
        int rotedArr[]={4,5,6,7,0,1,2};
        int key=0;
        System.out.println(  RotedSearch(0, rotedArr.length-1, key, rotedArr));
     

    }
}
