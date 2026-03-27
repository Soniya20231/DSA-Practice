package Arrays;

public class Pascaltriangle {
    public static void main(String[] args) {
        int arr[][]=new int[6][6];
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(j==0){
                    arr[i][j]=1;
                    System.out.print("1 ");
                }
                else if(j==i){
                    arr[i][j]=1;
                    System.out.print("1 ");
                }
                else{
                     arr[i][j]=arr[i-1][j-1]+ arr[i-1][j];
                     System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
