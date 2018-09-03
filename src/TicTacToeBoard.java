/**
 * class for a Tic Tac Toe board
 */
public class TicTacToeBoard {

    private final int BOARD_SIZE = 9;
    private char[] board;
    /*
    0 , 1 , 2
    3 , 4 , 5
    6 , 7 , 8
     */

    public TicTacToeBoard() {
        clearBoard();
    }

    public TicTacToeBoard(String b) {
        if (b.length() == BOARD_SIZE) {
            //        for (int ndx = 0; ndx < board.length; ndx++)
            //            board[ndx] = b.charAt(ndx);
            board = b.toCharArray();
        } else {
            System.err.println("Invalid length string used to initialize board.\n" +
                    "Setting up a clear board.");
            clearBoard();
        }
    }

    public void clearBoard() {
        board = new char[BOARD_SIZE];
        for (int ndx = 0; ndx < board.length; ndx++) {
            board[ndx] = String.valueOf(ndx + 1).charAt(0);
        }
    }

    public int getBoardSize() {
        return BOARD_SIZE;
    }

    public boolean gameOver() {
        return hasThree() || noMoves();
    }

    /**
     * determines whether the board has 3 of the same tokens
     * horizontally (i.e. 3 in the same row), vertically (3 in
     * the same column), or diagonally (upper-left to lower-right
     * or lower-left to upper-right)
     *
     * @return true iff board has 3 in a row of the same token
     */
    public boolean hasThree() {
        boolean result = false;

        return result;
    }

    /**
     * determines whether there are any legal moves left
     *
     * @return false iff at least one square contains a digit instead of a token
     */
    public boolean noMoves() {
        return true;
    }

    public void makeMove(int ndx, char token) {
        board[ndx] = token;
    }

    public boolean available(int square_number) {
        return Character.isDigit(board[square_number - 1]);
    }

    public String toString() {
        StringBuilder sBldr = new StringBuilder("+---+---+---+\n");
        for (int row = 0; row < 9; row += 3) {
            sBldr.append(String.format("| %c | %c | %c |\n",
                    board[row], board[row + 1], board[row + 2]));
            sBldr.append("+---+---+---+\n");
        }
        return sBldr.toString();
    }

}
