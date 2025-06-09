public class Nqueen {
    public static void queens(char board[][],int row)
    {
        if(row==board.length)
        {
            PrintBoard(board);
            count++;//to count the total ways
            return;
        }
        for(int j=0;j<board.length;j++)
        {
            if(isSafe(board,row,j))
            {
            board[row][j]='Q';
            queens(board, row+1);
            board[row][j]='X';
            }
        }
        
    }
    public static boolean isSafe(char board[][],int row,int column){
        //upward
        for(int i=row-1;i>=0; i--)
        {
            if(board[i][column]=='Q'){
            return false;
            }
        }
        //left diagonal" \ "
        for(int i=row-1,j=column-1;i>=0 && j>=0; i--,j--)
        {
            if(board[i][j]=='Q'){
            return false;
            }
        }
        //right diagonal" / "
        for(int i=row-1,j=column+1;i>=0 && j<board.length;i--,j++)
        {
            if(board[i][j]=='Q')
            {
            return false;
            }
        }
        return true;
    }
    
    public static void PrintBoard(char board[][])
    {
        System.out.print("----------chessBoard---------\n");
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    static int count=0;

    public static void main(String[] args) {
    int n=4;
      char chessboard[][] = new char[n][n];
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
            chessboard[i][j]='X';
        }
      }
      queens(chessboard, 0);
      System.out.println("total ways to solve the nqueen problem are:-"+count);

    }
}
