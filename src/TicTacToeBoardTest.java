import static org.junit.jupiter.api.Assertions.*;

class TicTacToeBoardTest {

    private String[] has3consecutive = {"XXXOOOXXX", "XXXO5OXXX", "xoxoxoxox", "oxxxxooxo"};
    private String[] lacks3inRow = {"oxoxoxxox","oxooxoxox","123456789","x2o4o6x7x"};
    private String[] noMovesLeft = {"xxxoooxxx","XOXXOXXOX","XOOOXOXOX","OXXXOXOXO"};
    private String[] hasMovesLeft = {"12o4x6x89","xoxo5oxox","123456789","1o3xxo7x9"};

    private TicTacToeBoard[] boards3inRow;
    private TicTacToeBoard[] boardsNo3inRow;
    private TicTacToeBoard[] boardsNoMovesLeft;
    private TicTacToeBoard[] boardsHasMovesLeft;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        boards3inRow = new TicTacToeBoard[has3consecutive.length];
        for (int ndx = 0; ndx < boards3inRow.length; ndx++) {
            boards3inRow[ndx] = new TicTacToeBoard(has3consecutive[ndx]);
        }
        boardsNo3inRow = new TicTacToeBoard[lacks3inRow.length];
        for (int ndx = 0; ndx < boardsNo3inRow.length; ndx++) {
            boardsNo3inRow[ndx] = new TicTacToeBoard(lacks3inRow[ndx]);
        }
        boardsNoMovesLeft = new TicTacToeBoard[noMovesLeft.length];
        for (int ndx = 0; ndx < boardsNoMovesLeft.length; ndx++) {
            boardsNoMovesLeft[ndx] = new TicTacToeBoard(noMovesLeft[ndx]);
        }
        boardsHasMovesLeft = new TicTacToeBoard[hasMovesLeft.length];
        for (int ndx = 0; ndx < boardsHasMovesLeft.length; ndx++) {
            boardsHasMovesLeft[ndx] = new TicTacToeBoard(hasMovesLeft[ndx]);
        }
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        boardsNo3inRow = null;
        boardsHasMovesLeft = null;
        boards3inRow = null;
        boardsNoMovesLeft = null;
    }

    @org.junit.jupiter.api.Test
    void clearBoard() {
        for (TicTacToeBoard board : boardsNoMovesLeft) {
            int boardSize = board.getBoardSize();
            /* N.B. board squares are 1-based */
            for (int square = 1; square <= boardSize; square++) {
                assertFalse(board.available(square));
            }
            board.clearBoard();
            for (int square = 1; square <= boardSize; square++) {
                assertTrue(board.available(square));
            }
        }
    }

    @org.junit.jupiter.api.Test
    void gameOver() {
        for (TicTacToeBoard board : boards3inRow) {
            assertTrue(board.gameOver());
        }
        for (TicTacToeBoard board : boardsNoMovesLeft) {
            assertTrue(board.gameOver());
        }
        for (TicTacToeBoard board : boardsHasMovesLeft) {
            assertFalse(board.gameOver());
        }
    }

    @org.junit.jupiter.api.Test
    void hasThree() {
        for (TicTacToeBoard board : boards3inRow) {
            assertTrue(board.hasThree());
        }
        for (TicTacToeBoard board : boardsNo3inRow) {
            assertFalse(board.hasThree());
        }
    }

    @org.junit.jupiter.api.Test
    void noMoves() {
        for (TicTacToeBoard board : boardsNoMovesLeft) {
            assertTrue(board.noMoves());
        }
        for (TicTacToeBoard board : boardsHasMovesLeft) {
            assertFalse(board.noMoves());
        }
    }

    @org.junit.jupiter.api.Test
    void toStringTest() {
        for (TicTacToeBoard board : boards3inRow) {
            System.out.println(board);
        }
        for (TicTacToeBoard board : boardsNo3inRow) {
            System.out.println(board);
        }
        for (TicTacToeBoard board : boardsNoMovesLeft) {
            System.out.println(board);
        }
        for (TicTacToeBoard board : boardsHasMovesLeft) {
            System.out.println(board);
        }
    }
}