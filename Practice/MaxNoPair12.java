//ashish tech ques not completed
public class MaxNoPair12 {
    public static void main(String[] args) {
        int board[][]={
        {0,0,0,0,0},
        {0,0,0,0,0},
        {0,1,1,0,0},
        {0,0,0,0,0},

        };
        System.out.println(max(board, 0, 0, 0, 1, 0));

    }

    static int max(int board[][],int i1,int j1,int i2,int j2,int pair){
        if(i1>board.length-1||i2>board.length-1|| j1 > board.length-1|| j2 > board.length-1||board[i1][j1]!=0 || board[i2][j2]!=0){
            return 0;
        }
      
        
      pair+=1;
      board[i1][j1]=1;
      board[i2][j2]=1;
      System.out.println(pair);

    int a=  max(board, i1, j1+2, i2, j2+2,pair);
    int b=  max(board, i1+2, j1, i2+3, j2,pair);
    board[i1][j1] = 0;
    board[i2][j2] = 0;
        if (a>b) {
            return a;
        }
        else
        return b;
      
    } 
}
