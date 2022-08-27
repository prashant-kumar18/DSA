import java.util.Arrays;
import java.util.HashSet;

public class RecAndBac {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3 };
        // int grid[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
        // { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
        // { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
        // { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
        // { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
        // { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
        // { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
        // { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
        // { 0, 0, 5, 2, 0, 6, 3, 0, 0 }, };
        // int maze[][] = {
        // { 1, 0, 0, 0 },
        // { 1, 1, 0, 1 },
        // { 1, 1, 0, 0 },
        // { 0, 1, 1, 1 } };
        // int board[][] = new int[4][4];

        HashSet<String> set = new HashSet<>();
        set.add("god");
        set.add("is");
        set.add("now");
        set.add("no");
        set.add("where");
        set.add("here");
        // subset(a, 0, 0);
        // subset2(a, 0, "");
        // combination2(a, 0, 8, "");
        // palindromePartition("aab", "");

        // permutation(a, 0, new int[a.length], "");

        // nqueen(new int[4][4], 0);

        // sudoku(grid, 0, 0);
        // ratInMaze(maze, new boolean[maze.length][maze.length], 0, 0, "");
        wordBreak(set, "godisnowherenowhere", "");
    }

    static void subset(int a[], int i, int s) {
        if (i > a.length - 1) {
            System.out.println(s);
            return;
        }
        subset(a, i + 1, s);
        subset(a, i + 1, s + a[i]);

    }

    static void subset2(int a[], int i, String s) {
        if (i > a.length - 1) {
            System.out.println("[" + s + "]");
            return;
        }
        subset2(a, i + 1, s);
        subset2(a, i + 1, s + a[i]);

    }

    static void combination(int a[], int i, int n, String s) {
        if (i > a.length - 1 || n < 0)
            return;
        if (n == 0) {
            System.out.println("[" + s + "]");
            return;
        }

        combination(a, i, n - a[i], s + a[i]);
        combination(a, i + 1, n, s);

    }

    static void combination2(int a[], int i, int n, String s) {
        if (i > a.length - 1 || n < 0)
            return;
        if (n == 0) {
            System.out.println("[" + s + "]");
            return;
        }

        combination2(a, i + 1, n - a[i], s + a[i]);
        combination2(a, i + 1, n, s);

    }

    static void palindromePartition(String s, String asf) {
        if (s.length() == 0) {
            System.out.println("[" + asf + "]");
        }
        for (int i = 0; i < s.length(); i++) {
            String temp = s.substring(0, i + 1);
            if (isPlain(temp)) {
                palindromePartition(s.substring(i + 1), asf + "(" + temp + ")");
            }
        }

    }

    static boolean isPlain(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }

        }
        return true;
    }

    static void permutation(int a[], int index, int v[], String asf) {
        if (index > a.length - 1) {
            System.out.println(asf);
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (v[i] != 1) {
                v[i] = 1;
                permutation(a, index + 1, v, asf + a[i]);
                v[i] = 0;
            }
        }
    }

    static void nqueen(int board[][], int column) {

        if (column > board[0].length - 1) {
            for (int[] is : board) {
                for (int is2 : is) {
                    System.out.print(is2);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafeNqueen(board, row, column)) {
                board[row][column] = 1;
                nqueen(board, column + 1);
                board[row][column] = 0;
            }
        }
    }

    static boolean isSafeNqueen(int board[][], int row, int column) {
        int i = 0;
        int j = 0;

        while (j < board[0].length) {
            if (board[row][j++] == 1)
                return false;
        }
        j = 0;
        i = 0;
        while (i < board.length) {
            if (board[i++][column] == 1)
                return false;
        }
        i = row;
        j = column;
        while (i < board.length && j < board[0].length && i >= 0 && j >= 0) {
            if (board[i--][j--] == 1)
                return false;
        }
        i = row;
        j = column;
        while (i < board.length && j < board[0].length && i >= 0 && j >= 0) {
            if (board[i--][j++] == 1)
                return false;
        }
        i = row;
        j = column;
        while (i < board.length && j < board[0].length && i >= 0 && j >= 0) {
            if (board[i++][j++] == 1)
                return false;
        }
        i = row;
        j = column;
        while (i < board.length && j < board[0].length && i >= 0 && j >= 0) {
            if (board[i++][j--] == 1)
                return false;
        }

        return true;
    }

    static void sudoku(int grid[][], int row, int col) {
        if (row == grid.length) {
            for (int[] is : grid) {
                for (int is2 : is) {
                    System.out.print(is2);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        if (col == grid[0].length) {
            col = 0;
            row++;

        }
        if (row < grid.length && grid[row][col] == 0) {
            for (int num = 1; num <= grid.length; num++) {
                if (isSafeSudoku(grid, row, col, num)) {
                    grid[row][col] = num;
                    sudoku(grid, row, col + 1);
                    grid[row][col] = 0;
                }
            }
        } else {
            sudoku(grid, row, col + 1);
        }

    }

    static boolean isSafeSudoku(int[][] grid, int row, int col, int num) {
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

    static void ratInMaze(int a[][], boolean v[][], int i, int j, String path) {

        if (i == a.length - 1 && j == a[0].length - 1) {
            System.out.println(path);
            return;
        }
        if (i < 0 || j < 0 || i > a.length - 1 || j > a[0].length - 1 || a[i][j] == 0 || v[i][j] == true) {
            return;
        }
        v[i][j] = true;
        ratInMaze(a, v, i - 1, j, path + "U");
        ratInMaze(a, v, i, j + 1, path + "R");
        ratInMaze(a, v, i + 1, j, path + "D");
        ratInMaze(a, v, i, j - 1, path + "L");
        v[i][j] = false;
    }

    static void wordBreak(HashSet<String> dis, String string, String ans) {

        if (string.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < string.length(); i++) {
            String temp = string.substring(0, i + 1);
            if (dis.contains(temp)) {
                wordBreak(dis, string.substring(i + 1), ans + temp + " ");
            }
        }
    }

}
