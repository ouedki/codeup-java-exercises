import java.util.Scanner;

/**
 * High Low game exercise
 */
public class HighLowApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator(sc);
        HighLow hl = new HighLow();
        int number;
        String response="yes";

        do {
            hl.tracker = 6;
            int randomNumber = hl.randomWithRange(1, 100);
            System.out.println(randomNumber);
            System.out.println("You have only 6 attempts.");
            number = validator.getIntWithinRange(sc, "Guess a number between 1 and 100: ", 1, 100);
            checkHiLo(response, sc, number, randomNumber);

            while (!(number == randomNumber)) {
                hl.tracker--;
                System.out.println("Number of attempts left: " + hl.tracker);
                if (hl.tracker == 0) {
                    System.out.println("No more attempts left, You lost!");
                    System.out.print("Do you want to play again ? Yes or No. ");
                    response = sc.nextLine();
                    break;
                }
                number = validator.getIntWithinRange(sc, "Guess a number between 1 and 100: ", 1, 100);
                checkHiLo(response, sc, number, randomNumber);
            }
        } while(response.equals("yes") || response.equals("y"));
    }

    public static void checkHiLo (String response, Scanner sc, int prompt, int random ) {
        if (prompt > random) {
            System.out.println("LOWER");
        } else if (prompt < random) {
            System.out.println("HIGHER");
        } else if (prompt == random) {
            System.out.println("GOOD GUESS!");
            System.out.print("Do you want to play again ? Yes or No. ");
            response = sc.nextLine();
        }
    }


}
