import java.util.zip.ZipEntry;

public class AllPaths13 {
    
    public static void main(String[] args) {
        int board[][]={
        {0,1,0,0,0,0,0},
        {0,1,0,1,1,1,0},
        {0,0,0,0,0,0,0},
        {1,0,1,1,0,1,1},
        {1,0,1,1,0,1,1},
        {1,0,0,0,0,0,0},
       
        };
        int visited[][]=new  int[6][7];
        allpaths(board, visited, 0, 0,"");

    }

    static void allpaths(int board[][], int visited[][],int i,int j,String str){
        if(i==board.length-1&&j==board[0].length-1){
            visited[i][j]=1;
            System.out.println(str);

            for (int[] v : visited) {
                for (int js : v) {
                    System.out.print(js+" ");
                }System.out.println();
            }System.out.println();
           
            return;
        }
        if (i>board.length-1||j>board[0].length-1||i<0||j<0||board[i][j]==1 || visited[i][j]==1) {
            return ;
        }
        visited[i][j]=1;
         allpaths(board, visited, i, j-1,str+"L");
        allpaths(board, visited, i, j + 1, str + "R");
       
        allpaths(board, visited, i-1, j, str + "U");
        allpaths(board, visited, i+1, j, str + "D");
       
        visited[i][j] = 0;
    }
}
