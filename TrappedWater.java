public class TrappedWater {
    public static int TrapWater(int height[]){
        int n=height.length;
        //left maximum array
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //right max array
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }

        int totalWater=0;
        int trapedWater;
        int waterlevel=0;
        for(int i=0;i<n;i++){
            waterlevel=Math.min(rightmax[i],leftmax[i]);
            trapedWater=(waterlevel-height[i])*1;
            totalWater=trapedWater+totalWater;
        }
        return totalWater;
    }
    public static void main(String arg[]){
        int height[]={4,2,0,6,3,2,5};
        int w =TrapWater(height);
        System.out.print(w);

    }
    
}
