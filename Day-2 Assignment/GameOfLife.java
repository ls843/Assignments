public class GameOfLife {
    public static void main(String[] args) {
        int[][] board = {
            {0, 1, 0},
            {0, 0, 1},
            {1, 1, 1},
            {0, 0, 0}
        };

        System.out.println("Original:");
        printBoard(board);

        nextState(board);

        System.out.println("\nNext State:");
        printBoard(board);
    }

    public static void nextState(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        int[][] dirs = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1},          {0, 1},
            {1, -1},  {1, 0},  {1, 1}
        };

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                int liveNeighbors = 0;

                for(int[] dir : dirs) {
                    int ni = i + dir[0];
                    int nj = j + dir[1];

                    if(ni >= 0 && ni < m && nj >= 0 && nj < n) {
                        if(board[ni][nj] == 1 || board[ni][nj] == 3) {
                            liveNeighbors++;
                        }
                    }
                }

                if(board[i][j] == 1) {
                    if(liveNeighbors < 2 || liveNeighbors > 3) {
                        board[i][j] = 3; 
                    }
                } else { 
                    if(liveNeighbors == 3) {
                        board[i][j] = 2; 
                    }
                }
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 2) board[i][j] = 1;
                else if(board[i][j] == 3) board[i][j] = 0;
            }
        }
    }

    public static void printBoard(int[][] board) {
        for(int[] row : board) {
            for(int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}