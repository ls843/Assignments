public class Minesweeper {
    public static void main(String[] args) {
        char[][] board = {
            {'E', 'E', 'E'},
            {'E', 'M', 'E'},
            {'E', 'E', 'E'}
        };

        generateBoard(board);
        printBoard(board);
    }

    public static char[][] generateBoard(char[][] board) {
        if(board == null || board.length == 0) return board;

        int m = board.length;
        int n = board[0].length;

        int[][] dirs = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1},           {0, 1},
            {1, -1},  {1, 0},  {1, 1}
        };

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 'E') {
                    int count = 0;

                    for(int[] dir : dirs) {
                        int ni = i + dir[0];
                        int nj = j + dir[1];

                        if(ni >= 0 && ni < m && nj >= 0 && nj < n) {
                            if(board[ni][nj] == 'M') {
                                count++;
                            }
                        }
                    }

                    board[i][j] = (char) (count + '0');
                }
            }
        }

        return board;
    }

    public static void printBoard(char[][] board) {
        for(char[] row : board) {
            for(char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}