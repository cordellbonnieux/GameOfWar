import java.util.Scanner;
public class WarCardGame {
    public static void main(String[] args) {

        // create Scanner
        Scanner input = new Scanner(System.in);

        // create variables to keep tally
        int playerScore = 0, compScore = 0;

        // print instructions
        printInstructions();

        // play ten rounds
        for (int i = 1; i <= 10; i++) {

            // display round header
            System.out.println("|- Round " + i );

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
            if (playerWin)
                playerScore++;
            else
                compScore++;
        }

        // print results
        matchResults(playerScore, compScore);

        // end program
        System.exit(0);

    }

    public static void printInstructions() {

        // print the game instructions
        System.out.println("|- Game Of War");
        System.out.println("|- Choose a number between 1 and 13 (inclusive), the computer will also choose a number");
        System.out.println("|- who ever has the higher number wins the round, if it is a tie the round is skipped.");
        System.out.println("|- After 10 rounds the total scores will be displayed.");
    }

    public static int readCard(Scanner input) {

        // prompt user
        System.out.print("Please enter a valid (1-13) card number: ");

        // read num
        int x = input.nextInt();

        // check if it's valid
        if (x > 13 || x < 1)
            return readCard(input);
        
        return x;
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

