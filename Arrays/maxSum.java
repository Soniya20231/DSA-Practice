package Arrays;

public class maxSum {
    public static void main(String[] args) {
        int arr[]={-2 ,1 ,-3, 4, -1, 2, 1, -5, 4};
        //int arr[]={5 ,4 ,-1 ,7 ,8};
        int curr=0;
        int maxSum=0;
       

        for(int i=0;i<arr.length;i++){
            curr=curr+arr[i];
           
            if(curr<0){
                curr=0;   
            }
            maxSum=Math.max(maxSum, curr);
        }
        System.out.println(maxSum);
    }
}
