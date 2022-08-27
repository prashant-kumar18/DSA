public class NQueen10 {
    public static void main(String[] args) {
        // int board[][]={
        //     {1,0,0,0,0},
        //     {0,0,0,0,0},
        //     {0,1,0,0,0},
        //     {0,0,0,0,0},
        //     {0,0,0,0,0},  
        // };
     
        // System.out.println(check(board, 4, 2));
        int board[][] =new int[4][4];
        nqueen(board,  0, "");
      
    }
   static boolean check(int board[][], int i,int j){
        //horizontal check
        int k=0;
        int ori=i;
        int orj=j;
        while(k<board.length){
            if(board[i][k]==1)return false;
            k++;
        }
        k=0;
        while(k<board.length){
            if(board[k][j]==1)return false;
            k++;
        }

        while(i<board.length&&j<board.length&&i>=0 && j >= 0){

            if(board[i][j]==1)return false;
            i--;
            j++;
        }
        i=ori;
        j=orj;
        while(i < board.length && j < board.length && i >= 0 && j >= 0){
            if(board[i][j]==1)return false;
            i++;
            j++;
        }
        i = ori;
        j = orj;
        while(i < board.length && j < board.length && i >= 0 && j >= 0){
            if(board[i][j]==1)return false;
            i++;
            j--;
        }
        i = ori;
        j = orj;
        while(i < board.length && j < board.length && i >= 0 && j >= 0){
            if(board[i][j]==1)return false;
            i--;
            j--;
        }
        i=ori;
        j=orj;
        
        return true;

    }


   static void nqueen(int[][] board,int col,String s){
        
       if (col == board.length - 1) {
           for (int[] is : board) {
               for (int i : is) {
                   System.out.print(i);
               }
               System.out.println();
           }
            System.out.println();

         return;
       }

    


    for (int i = 0; i < board.length; i++) {
        if (check(board, i, col)) {
            board[i][col] = 1;
            nqueen(board, col + 1, s);
            board[i][col] = 0;
            
        } 
       
      
      
    }
    return;

   } 
}
