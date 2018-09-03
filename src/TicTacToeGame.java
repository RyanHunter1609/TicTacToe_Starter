import java.util.Scanner;

public class TicTacToeGame {

    private static Scanner keyb = new Scanner(System.in);
    private static final String WELCOME_MESSAGE ="Welcome to Tic Tac Toe.";
    private static final String SIGNOFF_MESSAGE = "Thanks for playing Tic Tac Toe.";
    private static final String PLAY_AGAIN_MESSAGE = "Play again? (Y/N) ";
    private static final char KEEP_PLAYING = 'Y';

    public static void main(String[] args) {
        System.out.println(WELCOME_MESSAGE);
        boolean again = true;
        do {
            playOneRound(new TicTacToeBoard());
            System.out.print(PLAY_AGAIN_MESSAGE);
            // char y_or_n_0 = keyb.nextLine().toUpperCase().charAt(0);
            char y_or_n = Character.toUpperCase(keyb.nextLine().charAt(0));
            again = y_or_n == KEEP_PLAYING;
        } while (again);
        System.out.println(SIGNOFF_MESSAGE);
    }

    private static void playOneRound(TicTacToeBoard board) {

    }
}
