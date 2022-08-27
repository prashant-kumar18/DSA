class Sudoku16 {

  public static void main(String[] args) {
    int board[][] = {
        { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
        { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
        { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
        { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
        { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
        { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
        { 0, 0, 5, 2, 0, 6, 3, 0, 0 },
    };
    sudoku(board, 0, 0, 1);
  }

  static boolean isSafe(int[][] grid, int row, int col, int num) {
    for (int x = 0; x <= 8; x++)
      if (grid[row][x] == num)
        return false;

    for (int x = 0; x <= 8; x++)
      if (grid[x][col] == num)
        return false;

    int startRow = row - row % 3, startCol = col - col % 3;
    for (int i = 0; i < 3; i++)
      for (int j = 0; j < 3; j++)
        if (grid[i + startRow][j + startCol] == num)
          return false;

    return true;
  }

  static void sudoku(int[][] board, int i, int j, int num) {
    if (i == board.length) {
      for (int[] ks : board) {
        for (int ks2 : ks) {
          System.out.print(ks2);
        }
        System.out.println();
      }
      System.out.println();
      return;
    }
    int oi = 0;
    int oj = 0;
    if (j == board[0].length - 1) {
      oi = i + 1;
      oj = 0;
    } else {
      oi = i;
      oj = j + 1;
    }

    if (board[i][j] != 0) {
      sudoku(board, oi, oj, num);
    } else
      for (int k = 1; k <= 9; k++) {
        if (isSafe(board, i, j, k)) {
          board[i][j] = k;
          sudoku(board, oi, oj, num);
          board[i][j] = 0;
        }
      }
  }
}
