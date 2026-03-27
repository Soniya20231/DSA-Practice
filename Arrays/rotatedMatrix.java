package Arrays;

// Example:
// Input:
// 3
// 1 2 3
// 4 5 6
// 7 8 9
// Output:
// 7 4 1
// 8 5 2
// 9 6 3


public class rotatedMatrix {
    public static void main(String args[]){
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        // int rotated[][]=new int[arr.length][arr.length];
        // int col=2;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length;j++){
        //         rotated[j][col]=arr[i][j];
        //     }
        //     col--;
        // }

        //transpose of matrix
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        //reverse each row
        
        for(int i=0;i<arr.length;i++){
            int left=0,right=arr.length-1;
            while(left<right){
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;
                left++;
                right--;
            }
            
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
