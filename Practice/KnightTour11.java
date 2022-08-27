public class KnightTour11 {
    
    public static void main(String[] args) {
        int board[][] = new int[5][5];

  
           knightTour(board, 0, 1, 0);
 
        
    }
    static void knightTour(int board[][],  int i, int j,int count){
      
      
        if (i >= board.length || j >= board.length  || i < 0 || j < 0 || board[i][j] != 0) {
            return;
        }
       else if(count==board.length*board.length){
            board[i][j] = count;
           for (int[] ks : board) {
               for (int ks2 : ks) {
                   System.out.print(ks2+" ");
               }
               System.out.println();
           }
           System.out.println();
           board[i][j] = 0;
           return;
       }

        board[i][j]=count;
     ;
        knightTour(board, i-2, j+1, count+1);
        knightTour(board, i-1, j+2, count+1);
        knightTour(board, i+1, j+2, count+1);
        knightTour(board, i+2, j+1, count+1);
        knightTour(board, i+2, j-1, count+1);
        knightTour(board, i+1, j-2, count+1);
        knightTour(board, i-1, j-2, count+1);
        knightTour(board, i-2, j-1, count+1);
        board[i][j] = 0;
    }
}
