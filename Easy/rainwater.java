package Easy;

public class rainwater {
    public static void trappedWater(int arr[]){
        int leftmax[]=new int[arr.length];
        int RightMax[]=new int[arr.length];

        leftmax[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            if(leftmax[i-1]>arr[i]){
                leftmax[i]=leftmax[i-1];
            }
            else{
                leftmax[i]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(leftmax[i]+" ");
        }
        System.out.println();

        RightMax[arr.length-1]=arr[arr.length-1];
        for(int j=arr.length-2;j>=0;j--){
            if(RightMax[j+1]<arr[j]){
                RightMax[j]=arr[j];
            }
            else{
                RightMax[j]=RightMax[j+1];
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(RightMax[i]+" ");
        }
        System.out.println();


        int total=0;
        for(int i=0;i<arr.length;i++){
           int waterLevel=Math.min(leftmax[i], RightMax[i]);
           int waterHeight=waterLevel-arr[i];
            total=total+ waterHeight;
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        int bars[]={0,1,0,2,1,0,1,3,2,1,2,1};
        trappedWater(bars);

    }
}
