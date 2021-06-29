public class WarCardGame {
    import java.util.Scanner;
    public static void main(String[] args) {

        // create Scanner
        Scanner input = new Scanner(System.in);

        // create variables to keep tally
        int playerScore, compScore;

        // play ten rounds
        for (int i = 1; i <= 10; i++) {

            // read user's card
            int user = readCard(input);

            // get computer's card
            int comp = getCard();

            // break if it's a tie
            if (isTie(user, comp)) continue;

            // get the winner
            Boolean playerWin = whoWins(user, comp);

            // display the winner
            displayWinner(playerWin);

            // update the score
            playerWin ? playerScore++ : compScore++;
        }

        // print results
        matchResults(playerScore, compScore);

        // end program
        System.exit(0);

    }

    public static int readCard(Scanner x) {

        return 0;
    }

    public static int getCard() {

        return 0;
    }

    public static Boolean isTie(int user, int comp) {

        return false;
    }

    public static Boolean whoWins(int user, int comp) {

        return false;
    }

    public static void displayWinner(Boolean playerWin) {

    }

    public static void matchResults(int playerScore, int compScore) {

    }
}

