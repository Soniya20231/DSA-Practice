public class maxSubArray {
    public static void main(String ars[]){
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];
            if(currentSum<0){
                currentSum=0;
            }
            maxSum=Math.max(currentSum,maxSum);

        }
        System.out.println("maximum of the sum is:"+maxSum);
    }
    
}
