public class SUDKO {
    public static boolean sudkoSolver(int sudko[][],int row,int col){
        //base
        if(row==9){
            return true;
        }
        //recursion
        int nextrow=row;
        int nextcol=col+1;
        if(col+1==9){
            nextrow=row+1;
            nextcol=0;
        }

        if(sudko[row][col]!=0){
            return(sudkoSolver(sudko, nextrow, nextcol));
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafe(sudko,row,col,digit)){
                sudko[row][col]=digit;
                if(sudkoSolver(sudko, nextrow, nextcol)){
                    return true;
                }
                sudko[row][col]=0;
            }
        }
        return false;

    }
    public static boolean isSafe(int sudko[][],int row,int col,int digit){
        //column
        for(int i=0;i<9;i++){
            if(sudko[row][i]==digit){
                return false;
            }
        }
        //row
        for(int i=0;i<9;i++){
            if(sudko[i][col]==digit){
                return false;
            }
        }
        //grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudko[i][j]==digit){
                    return false;
                }
            }
        }
        return true;

    }
    public static void printsudko(int sudko[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudko[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        int sudko[][]={
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3},
        };
        if(sudkoSolver(sudko,0,0)){
            System.out.print("the solution exist\n");
            printsudko(sudko);
        }
        else{
            System.out.println("solution does not exist");
        }

    }
    
}
