public class Subarray {
    public static void main(String args[]){
        int mat[]={2,4,6,8,10};
        for(int i=0;i<mat.length;i++){
            for(int j=i+1;j<mat.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(mat[k]);
                }
                System.out.println();

            }
            System.out.println();

        }
    }
    
}
    

