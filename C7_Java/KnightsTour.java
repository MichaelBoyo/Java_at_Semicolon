package C7_Java;

public class KnightsTour {
    private final char[][] board;
    private final int BOARD_SIZE = 8;

    public KnightsTour() {
        board = new char[BOARD_SIZE][BOARD_SIZE];
    }

    public void printBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                String game= "  %c  ";
                game = game.formatted(board[i][j]);
                System.out.print(game);
            }
            System.out.println();
        }
    }

    public void setToZero() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = '0';
            }
        }
    }

    public void horizontal(int move) {
        for (int i = 0; i < board.length ; i++) {
            switch (move){
                case 1-> board[5][i]='K';

                case -1-> board[3][i]='K';

            }
            break;
        }

    }

    public void vertical(int move) {
        switch (move){
            case 1-> board[0][5]='K';
            case -1-> board[2][3]='K';

        }
    }
}
