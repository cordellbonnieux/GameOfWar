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

            // get the winner
            Boolean playerWin = whoWins(user, comp);

            // display the winner
            displayWinner(playerWin);

            // update the score
            playerWin ? playerScore++ : compScore++;
        }

        // print results
        printResults();

        // end program
        System.exit(0);

    }
}

