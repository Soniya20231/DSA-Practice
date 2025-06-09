public class spiralMatrix {
    public static void printSpiral(int mat[][]){
        int startRow=0;
        int startCol=0;
        int endRow=mat.length-1;
        int endCol=mat.length-1;
        while(startRow<=endRow && startCol<=endCol-1){
            //right
            for(int i=startCol;i<=endCol;i++){
                System.out.print(mat[startRow][i]+" ");
            }
            //down
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(mat[i][endCol]+" ");
            }
            //left
            for(int j=endCol-1;j>=startCol;j--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(mat[endRow][j]+" ");
            }
            //up
            for(int k=endRow-1;k>startRow+1;k--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(mat[k][startCol]+" ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
            
        }
    }
    public static void main(String args[]){
        int mat[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        printSpiral(mat);
    }
    
}
